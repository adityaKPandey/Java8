package com.java8.functionalinterface.function.binary;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	//useful when all 3 : 2 inputs and output are of same type.
	private static BinaryOperator<Integer>add = (a,b) -> a+b;
	private static Comparator<Integer> ascendingOrder = (a,b) -> a.compareTo(b);
	private static Comparator<Integer> descendingOrder = (a,b) -> b.compareTo(a);
	
	public static void main(String[] args) {
		
	    System.out.println(add.apply(10, 20));	
	    System.out.println(BinaryOperator.maxBy(ascendingOrder).apply(10, 20));
	    System.out.println(BinaryOperator.minBy(ascendingOrder).apply(10, 20));
	    System.out.println("#########");
	    System.out.println(BinaryOperator.maxBy(ascendingOrder).apply(20, 10));
	    System.out.println(BinaryOperator.minBy(ascendingOrder).apply(20, 10));

	    
	    System.out.println("#########");
	    System.out.println(BinaryOperator.maxBy(descendingOrder).apply(10, 20));
	    System.out.println(BinaryOperator.minBy(descendingOrder).apply(10, 20));
	    
	    

	}

}
