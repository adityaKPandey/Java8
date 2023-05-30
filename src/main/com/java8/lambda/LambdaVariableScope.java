package com.java8.lambda;

import java.util.function.Consumer;

public class LambdaVariableScope {

	private static int staticI = 9;
	
	private int memberI = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1; //local variable
		
		LambdaVariableScope lambdaVariableScope = new LambdaVariableScope();
		
		//not allowed to use same variable  defined in method scope
		Consumer<Integer> add1 = (i1) -> {
			 //i = 2; //can't change value of any local variable i - treated as effectively final
			
			staticI++;
			lambdaVariableScope.memberI++; //No restrictions for accessing instance variables or class variables inside Lambda expression
			System.out.println(i); 
			System.out.println(i1+1);
			
			System.out.println("We can change value of static variables inside Lambda expression :" + staticI);
			System.out.println("We can change value of member variables inside Lambda expression :" + lambdaVariableScope.memberI);
		} ;
		
		
		add1.accept(2);
		
		
	}

}
