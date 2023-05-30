package com.java8.streams.terminal;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJoiningExample {

	//concatenate all names of Students
	public static String joinNamesOfStudents() {
		List<Student>students = StudentDataBase.getAllStudents();
		  
		return students.stream().map(Student :: getName).collect(Collectors.joining());
		//return students.stream().map(Student :: getName).collect(Collectors.joining(","));
	}
	
	public static String joinNamesOfStudentsWithDelimiter() {
		List<Student>students = StudentDataBase.getAllStudents();
		  
		//return students.stream().map(Student :: getName).collect(Collectors.joining());
		return students.stream().map(Student :: getName).collect(Collectors.joining(","));
	}
	
	public static String joinNamesOfStudentsWithPrefix() {
		List<Student>students = StudentDataBase.getAllStudents();
		  
		//return students.stream().map(Student :: getName).collect(Collectors.joining());
		return students.stream().map(Student :: getName).collect(Collectors.joining(",", "Students ", "#"));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Student names:  " + joinNamesOfStudents());
		System.out.println("Student names with delimiter:  " + joinNamesOfStudentsWithDelimiter());
		System.out.println("Student names with prefix,delimiter,suffix:  "+joinNamesOfStudentsWithPrefix());
		
	}

}
