package com.java8.streams;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import com.java8.methodreference.PredicateAsMethodReference;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsStudentDemo {

	public static void main(String[] args) {
		 
		// create Map<Student  name, List of activites>

		List<Student> students = StudentDataBase.getAllStudents() ;
		
		/*
		
		Map<String , List<String>> studentVsActivities = new HashMap<>();
		
		students.stream().forEach((student) -> {
		      studentVsActivities.put(student.getName(), student.getActivities());	
		});
		
		*/
		
		Map<String , List<String>> studentVsActivities  = students.stream().collect(Collectors.toMap(Student :: getName, Student :: getActivities));
		
		
		System.out.println(studentVsActivities);
		
		
		Map<String , List<String>> filteredStudentsVsActivities = students.parallelStream().filter(
            PredicateAsMethodReference:: greaterThanGradeLevel)
				.collect(Collectors.toMap(Student :: getName, Student :: getActivities));
		
		
		System.out.println(filteredStudentsVsActivities);
		
		
		Predicate<Student>gpaAtLeast3Dot9  = (student) -> student.getGpa() >= 3.9;
		
		Map<String , List<String>> filteredStudentsVsActivities2 = students.parallelStream().filter(PredicateAsMethodReference :: greaterThanGradeLevel)
				.filter(gpaAtLeast3Dot9).
				collect(Collectors.toMap(Student :: getName, Student :: getActivities)) ;
		
		System.out.println(filteredStudentsVsActivities2);
		
		
		System.out.println("################PEEK####################"); //peek goes through all elements of stream - good method for debugging streams
		
		//Looking at output we see 1st element is passed through stream from start to end before 2nd element begins and so on in order.
		List<Student> filteredStudents3 = students.stream().peek( System.out :: println) .filter(PredicateAsMethodReference :: greaterThanGradeLevel).
		  peek( (student) -> System.out.println("STUD after 1st filter:" + student.toString())).collect(Collectors.toList());
		
		System.out.println("Fil:"+filteredStudents3.toString());
	}

}
