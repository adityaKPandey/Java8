package com.java8.streams.numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {

	public static void intStreamRangeDemo() {
		System.out.println("Integer stream range");
		System.out.println("Range count:"+ IntStream.range(1, 50).count());
		
		IntStream.range(1, 50).forEach((val) -> System.out.print(val+","));
		
		System.out.println();
		System.out.println("Closed range count:" + IntStream.rangeClosed(1, 50).count());
		
		IntStream.rangeClosed(1, 50).forEach((val) -> System.out.print(val+","));
	}
	
	public static void longStreamRangeDemo() {
		System.out.println();
	    System.out.println("###################  Long stream range ##################"); 
		System.out.println("Range count:" + LongStream.range(1, 50).count());
		
		LongStream.range(1, 50).forEach((val) -> System.out.print(val+","));
		
		System.out.println();
		System.out.println("Closed range count:" + LongStream.rangeClosed(1, 50).count());
		
		LongStream.rangeClosed(1, 50).forEach((val) -> System.out.print(val+","));
	}
	
	public static void doubleStreamRangeDemo() {
		System.out.println();
		System.out.println("################# Double stream range ###################");
		
		//DoubleStream class doesn't have range method - but IntStream and LongStream have asDoubleStream method
		LongStream.range(1, 50).asDoubleStream().forEach((val) -> System.out.print(val+","));
		IntStream.range(1, 50).asDoubleStream();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		intStreamRangeDemo();
		longStreamRangeDemo();
		doubleStreamRangeDemo();
		
	}

}
