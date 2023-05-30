package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

	private static Optional<Integer> limitAdd(List<Integer> numbers){

		return numbers.stream().limit(4).reduce((a,b) -> a+b);
	}
	
	private static Optional<Integer> skipAdd(List<Integer> numbers){

		return numbers.stream().skip(4).reduce((a,b) -> a+b);
	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,9,-1,67,-32);
		
		Optional<Integer>limitSum = limitAdd(numbers);
		if(limitSum.isPresent())
			System.out.println("Sum of first 4 numbers:"+ limitSum.get());
		else
			System.out.println("No input is passed");
		
		Optional<Integer>skipSum = skipAdd(numbers);
		if(skipSum.isPresent())
			System.out.println("Sum after skipping first 4 numbers:"+ skipSum.get());
		else
			System.out.println("No input is passed");
		
	}

}
