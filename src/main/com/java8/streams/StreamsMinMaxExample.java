package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {


	public static Integer max(List<Integer> numbers) {

		return numbers.stream().reduce(0, (a,b) -> a > b ? a : b);
	}

	public static Optional<Integer> maxAsOptional(List<Integer> numbers) {

		return numbers.stream().reduce((a,b) -> a > b ? a : b);
	}

	public static Integer min(List<Integer> numbers) {
		return numbers.stream().reduce(Integer.MIN_VALUE, (a,b) -> a < b ? a: b);
	}

	public static Optional<Integer> minAsOptional(List<Integer>numbers) {
		return numbers.stream().reduce((a,b)  -> a < b ? a : b );
	}


	public static void main(String[] args) {

		List<Integer>numbers = Arrays.asList(-1,4,-5,8 ,-100 );
		System.out.println("Max:"+numbers.stream().reduce((a,b) -> { 
			if(a.compareTo(b) > 0)
				return a;
			return b;


		}).get());



		System.out.println("Max:"+max(numbers));



		Optional<Integer> maxOptional = maxAsOptional(numbers);
		if(maxOptional.isPresent())
			System.out.println("Max:"+maxOptional.get());
		else
			System.out.println("Empty list");

		numbers = new ArrayList<>();

		System.out.println("Max:"+max(numbers));



		Optional<Integer> maxOptional2 = maxAsOptional(numbers);
		if(maxOptional2.isPresent())
			System.out.println("Max:"+maxOptional2.get());
		else
			System.out.println("Empty list");


		numbers = Arrays.asList(-1,4,-5,8 ,-100 );

		System.out.println("Min:" + min(numbers));

		Optional<Integer> minOptional = minAsOptional(numbers);
		if(minOptional.isPresent())
			System.out.println("Min:"+minOptional.get());
		else
			System.out.println("Empty list");


		numbers = new ArrayList<>();
		System.out.println("Min:" + min(numbers));

		Optional<Integer> minOptional2 = minAsOptional(numbers);
		if(minOptional2.isPresent())
			System.out.println("Min:"+minOptional2.get());
		else
			System.out.println("Empty list");


	}

}
