package com.java8.streams;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.Optional;

public class StreamFindFirstAnyExample {

	public static Optional<Student> findAnyStudentWithGPAge3Dot9(){

		//iterates in sequence and returns first element matching criteria
		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9).findAny();
	}

	// same output as findAny for non-parallel stream
	public static Optional<Student> findFirstStudentWithGPAge3Dot9(){

		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9).findFirst();

	}

	public static void main(String[] args) {
		Optional<Student> anyStudent = findAnyStudentWithGPAge3Dot9();

		if(anyStudent.isPresent())
			System.out.println("Any student with gpa greater than or equal to 3.9:"+anyStudent.get().toString());
		else
			System.out.println("No such student");

		Optional<Student> firstStudent = findFirstStudentWithGPAge3Dot9();

		if(firstStudent.isPresent())
			System.out.println("First student with gpa greater than or equal to 3.9:"+firstStudent.get().toString());
		else
			System.out.println("No such student");


	}

}
