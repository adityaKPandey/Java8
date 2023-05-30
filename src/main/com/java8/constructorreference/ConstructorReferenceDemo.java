package com.java8.constructorreference;

import com.java8.functionalinterface.consumer.Student;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceDemo {

	static Supplier<Student> studentSupplier = Student :: new; //default(no-arg) constructor is must to use this
	
	static Function<String , Student> studentFunction = Student :: new ;
	
	public static void main(String[] args) {
		 
		System.out.println(studentSupplier.get());

		System.out.println(studentFunction.apply("Ramesh"));
	}

}
