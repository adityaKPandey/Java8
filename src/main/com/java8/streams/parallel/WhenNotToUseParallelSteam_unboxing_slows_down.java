package com.java8.streams.parallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WhenNotToUseParallelSteam_unboxing_slows_down {

	private static int sumSequential(List<Integer>numbers) {
		long timeStarted = System.currentTimeMillis();
		int sum = numbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println("Sequential stream , time taken:" + (System.currentTimeMillis() - timeStarted));
		return sum;
	}
	
	private static int sumParallel(List<Integer>numbers) {
		long timeStarted = System.currentTimeMillis();
		int sum = numbers.parallelStream().
				reduce(0, (a,b) -> a+b); //perform the unboxing from Integer to int - this slows down in case of parallel streams 
		System.out.println("Parallel stream , time taken:" + (System.currentTimeMillis() - timeStarted));
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumSequential(IntStream.rangeClosed(1, 100000).boxed().collect(Collectors.toList()));
		sumParallel(IntStream.rangeClosed(1, 100000).boxed().collect(Collectors.toList()));
		
	}

}
