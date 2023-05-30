package com.java8.functionalinterface.predicate;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicate {

	//grade level >= 3
	private Predicate<Student>isGradeLevel = (student) -> student.getGradeLevel() >= 3;
	
	//gpa >= 3.9
	private Predicate<Student>isGpa = (student) -> student.getGpa() >= 3.9 ;
	
	private Consumer<Student> printNamesForGradeLevelAndGpaCondition = (student) -> {
		if(isGradeLevel.and(isGpa).test(student))
			System.out.println(student.getName());
	};
	
	/*
	private Consumer<Student> printNamesForGpaCondition = (student) -> {
		if(isGpa.test(student))
			System.out.println(student.getName());
	};
	*/
	
	private BiConsumer<String,List<String>>printNameAndActivites = (name,activities) -> System.out.println(name + "->" + activities.toString());
	 
	private Consumer<Student> printNameActivitesForGradeLevelAndGpaCondition = (student) -> {
		if(isGradeLevel.and(isGpa).test(student))
			printNameAndActivites.accept(student.getName(), student.getActivities());
	};
	
	
	public static void main(String[] args) {
	   
		
		List<Student>students = StudentDataBase.getAllStudents();
		ConsumerPredicate consumerPredicate = new ConsumerPredicate();
		
		students.forEach(consumerPredicate.printNamesForGradeLevelAndGpaCondition);
		System.out.println("###################");
		//students.forEach(consumerPredicate.printNamesForGradeLevelCondition);
		students.forEach(consumerPredicate.printNameActivitesForGradeLevelAndGpaCondition);
	}

}
