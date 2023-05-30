package com.java8.streams;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/*
  reduce applies the operation on each element of the stream and then returns the final result;
 */

public class StreamReduceExample {

	
	private static long multiply(List<Integer>numbers) {
	
		  return numbers.stream().reduce(1, (a,b) -> a*b ) ;
	}
	
	private static long multiplyWithoutIdentity(List<Integer>numbers) {
		
		  Optional<Integer> result =  numbers.stream().reduce( (a,b) -> a*b );
		  
		  if(result.isPresent())
			  return result.get() ;
		  
		  return 0;
	}
	
	private static Optional<Student> getHighestGPAStudent(){
	   
		List<Student>students = StudentDataBase.getAllStudents() ;
		
		//return students.stream().max((a,b) -> Double.compare( a.getGpa() , b.getGpa() ));
		
		return students.stream().reduce((a,b) -> {
			if( Double.compare( a.getGpa() , b.getGpa()) > 0) 
				return a ;
		    else return b;
	});
		
	}
	
	public static void main(String[] args) {
	
		 List<Integer>numbers = Arrays.asList(1,2,3,-1) ;
		 
		 System.out.println(multiply(numbers));

		 System.out.println(multiplyWithoutIdentity(numbers));
		 
		 System.out.println(multiply(new ArrayList<>()));

		 System.out.println(multiplyWithoutIdentity( (List<Integer>)(((Supplier) ( ArrayList :: new )).get())     )) ;  // new ArrayList<>()
		 
		 Optional<Student> student = getHighestGPAStudent();
		 if(student.isPresent())
			 System.out.println("Highest GPA student :" + student.toString());
	}

}
