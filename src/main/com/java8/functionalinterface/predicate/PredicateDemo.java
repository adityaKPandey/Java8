package com.java8.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		 

		Predicate<Integer>isEvenNumber = (num) -> num%2 == 0 ;
		
		System.out.println(isEvenNumber.test(20));
		System.out.println(isEvenNumber.test(3));
		
		Predicate<Integer>isGreaterThanZero = (num) -> { 
			  if(num > 0) 
				 return true ;
			  else
				 return false;
		} ;
		
		
		System.out.println(isGreaterThanZero.and(isEvenNumber).test(10));
		
		System.out.println(isGreaterThanZero.and(isEvenNumber).test(-10));
		
		System.out.println(isGreaterThanZero.or(isEvenNumber).test(-10));
		
		System.out.println(isGreaterThanZero.negate().test(-10));
	}

}
