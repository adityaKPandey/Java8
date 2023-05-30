package com.java8.functionalinterface.function.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	//useful when input and output are of same type
	private static final UnaryOperator<String>toUpperCase = (input) -> input.toUpperCase();
	
	public static void main(String[] args) {


		System.out.println(toUpperCase.apply("Hala Madrid"));

	}

}
