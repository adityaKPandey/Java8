package com.java8.streams.terminal;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinByMaxByExample {

	public static Optional<Student>minBy(){
	
		return StudentDataBase.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student :: getGpa)));
		
	}
	
	public static Optional<Student>maxBy(){
		
		return StudentDataBase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student :: getGpa)));
		
	}
	
	public static void main(String[] args) {
		 
		Optional<Student> studentWithMinGPA = minBy();
		if(studentWithMinGPA.isPresent())
			System.out.println("Student with min marks:"+studentWithMinGPA.get());
		
		Optional<Student> studentWithMaxGPA = maxBy();
		if(studentWithMaxGPA.isPresent())
			System.out.println("Student with max marks:"+studentWithMaxGPA.get());
				

	}

}
