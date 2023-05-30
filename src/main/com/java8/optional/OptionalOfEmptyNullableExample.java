package com.java8.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	
	public static Optional<String> ofNullable(){
		Optional<String>stringOptional = Optional.ofNullable(null);
		System.out.println("str optional:" + stringOptional.toString());
		return stringOptional;
	}
	
	public static Optional<String> of(){
		Optional<String> stringOptional = Optional.of("Hello") ; // if passed null , it throws Null Pointer Exception
		System.out.println("str of optional:" + stringOptional.toString());
		return stringOptional;
	}
	
	//useful where return type is Optional and we don't want to return null
	public static Optional<String> empty() {
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ofNullable method:"+ofNullable());
		
		System.out.println("Of method:"+of());
		
		System.out.println("empty method:"+empty());
	}

}
