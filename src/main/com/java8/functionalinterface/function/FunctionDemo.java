package com.java8.functionalinterface.function;

import java.util.function.Function;

public class FunctionDemo {

	//need to specify input and output parameters
	static Function<String , String> toUpperCase = (input) -> input.toUpperCase();
	static Function<String , String> addSomeString = (input) -> input+" somestring" ; 
	
	public static void main(String[] args) {
        
		System.out.println(toUpperCase.apply("radio"));
		System.out.println(addSomeString.andThen(toUpperCase).apply("radio"));
		
		//applied first compose param function and then this function
		System.out.println(addSomeString.compose(toUpperCase).apply("radio"));
		
	}
	
	

}
