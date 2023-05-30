package com.java8.streams.parallel;

import java.util.stream.IntStream;

public class WhenNotToUseParallelStream_mutable_methods {

	public static void main(String[] args) {
		Sum parallelSum = new Sum();
		
		IntStream.rangeClosed(1, 1000).parallel().forEach(parallelSum :: performSum);

		System.out.println(parallelSum.getSum()); // every time , this gives different result - as we are concurrently updating same sum/total variable
		// to fix it and still use parallel stream - it would need us to add synchronized method unnecessarily
		
		Sum sequentialSum = new Sum();
		
		IntStream.rangeClosed(1, 1000).forEach(sequentialSum :: performSum);

		System.out.println(sequentialSum.getSum());

	}

}
