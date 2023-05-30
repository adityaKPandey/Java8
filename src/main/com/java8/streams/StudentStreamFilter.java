package com.java8.streams;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStreamFilter {
	
	private static List<Student>filterOnlyFemaleStudents(){
		
		return StudentDataBase.getAllStudents().stream().filter((student) -> student.getGender().equals("female")).collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		filterOnlyFemaleStudents().forEach(System.out :: println);
	}

}
