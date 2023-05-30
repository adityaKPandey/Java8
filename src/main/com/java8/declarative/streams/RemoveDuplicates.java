package com.java8.declarative.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 List<Integer>numbers = Arrays.asList(1,2,3,4,5,10,2,4,10);
		 
		 System.out.println(numbers.stream().distinct().collect(Collectors.toList()).toString());

	}

}
