package com.java8.streams;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapMethodDemo {

	private static List<Student>students = StudentDataBase.getAllStudents();
	
	private static List<String> getAllNames () {
		
		List<String> names = students.stream().map(Student :: getName).map(String :: toUpperCase). collect(Collectors.toList());
		return names;
	}
	
	public static void main(String[] args) {

		System.out.println(getAllNames().toString());

	}

}
