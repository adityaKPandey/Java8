package com.java8.functionalinterface.function;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import com.java8.functionalinterface.predicate.PredicateStudentExample;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FunctionStudentDemo {

	//create a Map<Student,gpa>
	private static Function<List<Student> , HashMap<Student,Double>>studentResult = (students) ->{
		HashMap<Student,Double> studentVsGpa = new HashMap<>();
		students.forEach((student) -> {
		  if(	PredicateStudentExample.isGradeLevelAtLeast3.test(student) )
		    	studentVsGpa.put(student, student.getGpa());
		});
		
		return studentVsGpa;
	};

	public static void main(String[] args) {

        System.out.println(studentResult.apply(StudentDataBase.getAllStudents()));
        
		 
	}

}
