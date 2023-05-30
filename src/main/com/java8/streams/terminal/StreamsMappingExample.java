package com.java8.streams.terminal;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMappingExample {

	public static Collection<String> mapping() {
		
		return StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName	, Collectors.toSet()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> namesList = StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName	, Collectors.toList()));
		System.out.println("Student names set:" + mapping());
		System.out.println("Student names list:" + namesList);
	}

}
