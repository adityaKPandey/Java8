package com.java8.functionalinterface.predicate;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

	private static List<Student> students   = StudentDataBase.getAllStudents();	
	public static Predicate<Student>isGradeLevelAtLeast3 = (student) -> student.getGradeLevel() >= 3;
    private static Predicate<Student>isGPAAtLeast3Dot5 = (student) -> student.getGpa() >= 3.5;
    		
	private static void printNamesOfStudentsWithGradeLevel3() {
	
		students.forEach((student) -> {
			  if(isGradeLevelAtLeast3.test(student))
				  System.out.println(student.getName());
			 
		});
		
	}
	
	private static void printNamesOfStudentWithGPA3Dot5() {
		
		students.forEach( (student) -> {
			if(isGPAAtLeast3Dot5.test(student))
				System.out.println(student.getName());
		});
	}
	
	public static void main(String[] args) {
		
		printNamesOfStudentsWithGradeLevel3();
		System.out.println("#########");
		printNamesOfStudentWithGPA3Dot5();
		
	}
	

}
