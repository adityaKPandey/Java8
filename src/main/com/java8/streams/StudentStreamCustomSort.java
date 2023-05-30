package com.java8.streams;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStreamCustomSort {

	private static List<Student> students =  StudentDataBase.getAllStudents();
	
	private static List<Student> sortBasedOnName(){
	   
		return students.stream().sorted(Comparator.comparing(Student :: getName)).collect(Collectors.toList());
	}
	
	private static List<Student> sortBasedOnGPADesc(){
		
		return students.stream().sorted(Comparator.comparing(Student :: getGpa , Comparator.reverseOrder() )).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		 
		sortBasedOnName().forEach(System.out :: println);
		System.out.println("###########################");
		sortBasedOnGPADesc().forEach(System.out :: println);

	}

}
