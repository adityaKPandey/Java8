package com.java8.streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

	public static List<Integer> boxing() {
	  
		return IntStream.range(1, 50).
				//nt
				boxed().
				//Integer
				collect(Collectors.toList());
	}
	
	public static int unBoxing(List<Integer>list) {
		  
		return ( list.
				 stream().
				 //Wrapper to int
				 mapToInt(Integer::intValue). // return IntStream whose input is int value of Integer wrapper class
				 sum() );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Boxing:"+boxing());
		System.out.println("Sum:"+unBoxing(boxing()));
		
	}

}
