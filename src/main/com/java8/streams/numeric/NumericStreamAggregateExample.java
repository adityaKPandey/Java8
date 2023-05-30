package com.java8.streams.numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {

		//sum max count min avg
		System.out.println("Sum: "+IntStream.rangeClosed(1, 50).sum());
		
		OptionalInt max =  IntStream.range(1, 50).max();
		
		System.out.println("Is max present:"+max.isPresent());
		
		System.out.println("Max alue in stream:"+ (max.isPresent()?max.getAsInt():null));
		
		System.out.println("Count :"+IntStream.rangeClosed(1, 1000).count());
		
		OptionalLong min = LongStream.rangeClosed(1, 100).min();
	
		System.out.println("Is min present:"+min.isPresent());
		
		System.out.println("Min value in stream:"+(min.isPresent() ? min.getAsLong():null));
		
		OptionalDouble average = IntStream.range(1, 51).average();
		
		System.out.println("Average of int stream:" + (average.isPresent() ? average.getAsDouble() : null ));
		
	}

}
 