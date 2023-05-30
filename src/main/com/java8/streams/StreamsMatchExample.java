package com.java8.streams;

import com.java8.functionalinterface.consumer.StudentDataBase;

public class StreamsMatchExample {

	public static boolean allMatch() {
		
		//List<Student>students = StudentDataBase.getAllStudents();
	    return StudentDataBase.getAllStudents().stream().allMatch((student) ->  student.getGpa() >= 3.9) ;
	    
	}
	
	public static boolean anyMatch() {
	  
		return StudentDataBase.getAllStudents().stream().anyMatch((student) -> student.getGpa() >= 4.0);
	}
	
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream().anyMatch((student) -> student.getGpa() >= 4.1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("All match result:" + allMatch());
		System.out.println("Any match result:" + anyMatch());
		System.out.println("None match result:" + noneMatch());

	}

}
