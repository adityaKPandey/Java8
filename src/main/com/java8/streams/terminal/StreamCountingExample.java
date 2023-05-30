package com.java8.streams.terminal;

import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.stream.Collectors;

public class StreamCountingExample {

	private static long countElementsInStream() {
		return StudentDataBase.getAllStudents().stream().
				filter((stud) -> stud.getGpa() >= 3.9).
				collect(Collectors.counting());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("No of elements in stream: "+ countElementsInStream());
	}

}
