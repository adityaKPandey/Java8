package com.java8.lambda;

public class RunnableInterfaceAsLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread(() -> {System.out.println("Inside run method");});
        t.start();
        
        Runnable oldRunnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Old Run");
			}
		};
		//no need to have curly braces if single line statement 
		Runnable newRunnable = () -> System.out.println("New Java8 way");
        
		new Thread(oldRunnable).start();
		
		new Thread(newRunnable).start();
		
 	}

}
