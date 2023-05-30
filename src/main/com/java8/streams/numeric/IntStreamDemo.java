package com.java8.streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {

	
	private static int sumOfNnumbers(int n) {
		
		List<Integer>numbers = Stream.iterate(1, a -> a+1).limit(n).collect(Collectors.toList());
		System.out.println(numbers.stream().reduce(0, (a,b) -> a+b)); //unboxing to convert Integer to int -> inefficient
		
		return IntStream.range(1, n+1).sum();
		
	}
	
	public static void main(String[] args) {
		 
		System.out.println(sumOfNnumbers(100));
		
	}

}
