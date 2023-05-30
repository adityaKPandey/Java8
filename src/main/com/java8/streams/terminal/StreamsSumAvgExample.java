package com.java8.streams.terminal;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.stream.Collectors;

public class StreamsSumAvgExample {

	// sum number of books

	public static int getSumOfBooks() {

		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNotebooks));
	}


	public static double getAverageNumberOfBooks() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNotebooks));
	}


	public static void main(String[] args) {
		
		System.out.println("Total number of books:"+getSumOfBooks());
		
		System.out.println("Average number of books:"+getAverageNumberOfBooks());
	}

}
