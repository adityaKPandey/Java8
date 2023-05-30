package com.java8.streams.terminal;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {

	public static Map<String, List<Student>> groupStudentsByGender() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
	}
	
	public static Map<String, Set<Student>> groupStudentsByGenderDownstreamCollectorAsSet() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender , Collectors.toSet()));
	}
	
	
	public static Map<String, List<Student>> groupStudentsCustom() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(student -> student.getGpa() >=3.8 ? "OUTSTANDING":"AVERAGE"));
	}
	
	public static Map<Integer , Map<String , List<Student>>> groupingBasedOnTwoLevels() {
		
		  return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student :: getGradeLevel  , 
				    Collectors.groupingBy(student -> student.getGpa() >=3.8 ? "OUTSTANDING":"AVERAGE")) ) ;
	}
	
	public static Map<Integer, Integer> groupingBasedOnTwoLevels_2() {
		
		  
		return  StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student :: getGradeLevel  ,
				Collectors.summingInt(Student :: getNotebooks)  ));
				    
	}
	
	public static Map<String, Set<Student>> groupingBy3Arg() {
		
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student :: getName , LinkedHashMap :: new
				, Collectors.toSet()));
		
	}
	
	
	//top gpa student in each grade 	
	public static Map<Integer , Student> getGradeVsTopGPAStudent() {
		
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student :: getGradeLevel , 
				   Collectors.collectingAndThen( Collectors.maxBy(Comparator.comparing(Student :: getGpa)) , Optional :: get)
				)) ;
		
	}
	
	//least gpa student in each grade
	public static Map<Integer , Student> getGradeVsLeastGPAStudent() {
		
		return StudentDataBase.getAllStudents().stream().collect( Collectors.groupingBy(Student :: getGradeLevel ,
				  Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student :: getGpa) )  , Optional :: get))) ;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Student map based on gender:" + groupStudentsByGender() );		
		
		System.out.println("Student map based on gender , downstream colector as set:" + groupStudentsByGenderDownstreamCollectorAsSet() );		
		
		System.out.println("Customized studnet grouping:" + groupStudentsCustom()); 
		
		System.out.println("Group by grade , gpa : " + groupingBasedOnTwoLevels());
		
		System.out.println("Grade level vs no of notebooks map : " + groupingBasedOnTwoLevels_2());
		

		System.out.println("3rd type groupingBy with custom supplier of Linked map : " + groupingBy3Arg() + "\n , type:" + groupingBy3Arg().getClass());
		
		
		System.out.println("grade vs Student with highest gpa :" + getGradeVsTopGPAStudent());
		System.out.println("grade vs Student with lowest gpa :" + getGradeVsLeastGPAStudent());
		

	}

}
