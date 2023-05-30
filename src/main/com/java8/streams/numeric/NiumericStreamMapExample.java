package com.java8.streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NiumericStreamMapExample {

	public static List<Integer> mapToObject(){

		return IntStream.range(1, 5). //intstream
				mapToObj(Integer :: new).  // instead of Integer class , we can have any class to create its object
				collect(Collectors.toList());
	}

	public static long mapToLong() {

		return IntStream.range(1, 5). //intstream
				mapToLong(i -> i).  //longstream
				sum();
	}

	public static double mapToDouble() {

		return IntStream.range(1, 5).mapToDouble(i -> i).sum();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Map to object:" + mapToObject());
		System.out.println("Map to long:" + mapToLong());
		System.out.println("Map to double:" + mapToDouble());
		
	}

}
