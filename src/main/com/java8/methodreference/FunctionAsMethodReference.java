package com.java8.methodreference;

import java.util.function.Function;

public class FunctionAsMethodReference {

	static final Function <String , String> toUpperCase = String :: toUpperCase;
	
	static final Function <String , String> toLowerCaseLambda = (s) -> s.toLowerCase() ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(toUpperCase.apply("ram"));
	}

}
