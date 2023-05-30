package com.java8.functionalinterface.supplier;

import com.java8.functionalinterface.consumer.Student;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentSupplierDemo {

	// functional interface that takes nothing as input parameter and creates Object of specified type
	static final Supplier <Student> studentSupplier = () -> new Student("Aditya", 4, 4.5, "male", Arrays.asList("swimming", "basketball","volleyball") , 30);
	
	static final Supplier<List<Student>>allStudentsSupplier = () -> Arrays.asList(new Student("Aditya", 4, 4.5, "male",
			Arrays.asList("swimming", "basketball","volleyball") , 30 )
			, new Student("Barkha", 3, 3.8, "female", Arrays.asList("swimming", "dancing","football") , 40));
	
	public static void main(String[] args) {
		 
		System.out.println(studentSupplier.get());
		
		System.out.println(allStudentsSupplier.get());
		
		int [] array = new int [2];
		
		Integer[] input = Arrays.stream(array).boxed().toArray(Integer[]::new);
		Arrays.sort(input, (a, b) -> array[b]-array[a]);
		
		List<Student>students = allStudentsSupplier.get();
		//Collections.so
	}

}
