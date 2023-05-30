package com.java8.declarative.streams;

import java.util.stream.IntStream;

public class Sum100Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long timeStarted = System.currentTimeMillis() ;
		System.out.println(IntStream.range(0, 101).sum());
		System.out.println("Time taken: "+(System.currentTimeMillis() - timeStarted)/1000.0);
		timeStarted = System.currentTimeMillis() ;
		System.out.println(IntStream.range(0, 101).parallel().sum());
		System.out.println("Time taken: "+(System.currentTimeMillis() - timeStarted)/1000.0);
		
	
	}

}
