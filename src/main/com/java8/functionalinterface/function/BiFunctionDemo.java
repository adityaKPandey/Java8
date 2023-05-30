package com.java8.functionalinterface.function;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import com.java8.functionalinterface.predicate.PredicateStudentExample;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionDemo {
	
	//returns Map<Student,gpa> as output
	//takes List<Student> and a Predicate as input
	
	private static BiFunction<List<Student>, Predicate<Student>,
	HashMap<Student,Double>> studentResultBiFunction = (students , predicate) ->{
		HashMap<Student,Double> studentVsGpa = new HashMap<>();
		students.forEach((student) -> {
		  if(	predicate.test(student) )
		    	studentVsGpa.put(student, student.getGpa());
		});
		
		return studentVsGpa;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(studentResultBiFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.isGradeLevelAtLeast3));
	}

}
