package com.java8.streams.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamParallelDemo {

	private static int sumSequentialStreams() {
		return IntStream.rangeClosed(1, 1000000).sum();
	}
	
	private static int sumParallelStreams() {
		return IntStream.rangeClosed(1, 1000000).parallel().sum();
	}
	
	private static long checkResult(Supplier<Integer> supplier , int noOfTimes) {
	
		long timeStarted = System.currentTimeMillis();
		for(int i = 0 ; i < noOfTimes ; i++) {
			supplier.get();
			//System.out.println(supplier.get());
		}
		
		return System.currentTimeMillis() - timeStarted;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Available processors:"+Runtime.getRuntime().availableProcessors());
		
		System.out.println("Time taken by sequential streams :"+ checkResult (StreamParallelDemo :: sumSequentialStreams , 20));
		 
		System.out.println("Time taken by parallel streams:"+ checkResult (StreamParallelDemo :: sumParallelStreams , 20));


	}

}
