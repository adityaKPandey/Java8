package com.java8.optional;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.Optional;

public class OptionalDemo {

	public static String getStudentName() {
		Student student = StudentDataBase.studentSupplier.get();
		
		if(student != null)
			return student.getName();
		
		return null;
	}
	
	//It's a good practice to return Optional instead of null.
	public static Optional<String> getStudentNameOptional(){

		Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.
				get());
		
		if(student.isPresent())
		  return student.map(Student :: getName);
		
		
		  return Optional.empty();

		
	}
	
	
	public static void main(String[] args) {

		 // code without Optional
		 String name = getStudentName();
		 if(name != null)
			 System.out.println("Name of student:"+name);
		 else
			 System.out.println("Name of student is null !!");
         
		 
		 // code with optional
		 Optional<String> optionalName = getStudentNameOptional();
		 if(optionalName.isPresent())
			 System.out.println("Name of student:"+name);
		 else
			 System.out.println("Name of student is null !!");
	}

}
