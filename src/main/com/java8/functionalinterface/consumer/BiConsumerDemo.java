package com.java8.functionalinterface.consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {

		BiConsumer<String, String>biConsumer = (a,b) -> System.out.println(a+" " + b);
		
		biConsumer.accept("Hello", "World!");
		
		BiConsumer<Integer , Integer> multiply = (a,b) -> System.out.println(a*b);
		BiConsumer<Integer, Integer> divide = (a,b) -> System.out.println(a/b);
		
		multiply.andThen(divide).accept(3, 2);
		
		
	}

}
