package com.java8.streams.terminal;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartitioningByExample {

	private static Map partitionByGPA() {

		Predicate<Student> gpaMoreThanThreeDot8 = (student) -> student.getGpa() > 3.8;
		Map <Boolean , List<Student>> result = StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy(gpaMoreThanThreeDot8)) ;
		return result;
	}

	private static Map partitionByGPA_2() {

		Predicate<Student> gpaMoreThanThreeDot8 = (student) -> student.getGpa() > 3.8;
		Map <Boolean , Set<Student>> result = StudentDataBase.getAllStudents().stream().collect(
				Collectors.partitioningBy(gpaMoreThanThreeDot8 , Collectors.toSet())) ;
		return result;
	}
	public static void main(String[] args) {

		System.out.println(partitionByGPA());
		
		System.out.println(partitionByGPA_2());
	}
}
