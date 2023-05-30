package com.java8.streams;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> stringStream = Stream.of("Adam" , "Bill" , "Danish");
		
		System.out.println("####Of method demo###");
		stringStream.forEach(System.out::println);

		//generates infinite stream using initial seed value and unary operator
		Stream<Integer> iterateIntStream = Stream.iterate(1, (a)->a*2);
	
		System.out.println("####Of method demo###");
		iterateIntStream.limit(10).forEach(System.out :: println);
		
		Supplier<Integer>intSuppler = new Random() :: nextInt;
		
		Consumer<Random> cos = Random :: nextInt;
		
		Stream<Integer> streamGenerate = Stream.generate(intSuppler);
		
		System.out.println("############## generate method ############");
		streamGenerate.forEach(System.out :: println);
		
	}

}
