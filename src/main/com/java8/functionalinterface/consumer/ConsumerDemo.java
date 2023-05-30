package com.java8.functionalinterface.consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {


	private static Consumer<Student> printName = (student) -> System.out.print(student.getName() +" "); 

	private static Consumer<Student> printActivites = (student) -> System.out.println(" -> " + student.activities);

	private static BiConsumer<String, List<String>> printNameAndActivities = (name,activities) -> System.out.println(name + "->"+activities);
	/*
	  Print names of all Students part of list in StudentDataBase
	 */

	public static void printNames() {

		List<Student> students   = StudentDataBase.getAllStudents();

		//Consumer<List<Student>>printNames = (studentList) -> studentList.forEach((student) -> System.out.println(student.getName()));

		//printNames.accept(students);

		students.forEach(printName);

	}

	/**
	 * 
	 */
	public static void printNameAndActivities() { 

		List<Student> students   = StudentDataBase.getAllStudents();	

		students.forEach(printName.andThen(printActivites)); //Consumer chaining

	}

	public static void printNameAndActivitiesUsingCondition() { 

		List<Student> students   = StudentDataBase.getAllStudents();	

		students.forEach(
				(student) -> {
					if(student.getGradeLevel() >= 3) 
						printName.andThen(printActivites).accept(student);
				}
				); 

	}
	
	public static void printNameAndActivitiesUsingBiConsumer() { 

		List<Student> students   = StudentDataBase.getAllStudents();	

		//students.forEach(printName.andThen(printActivites)); //Consumer chaining
		
		students.forEach((student) -> printNameAndActivities.accept(student.getName(), student.getActivities()) );

	}

	public static void main(String[] args) {

		Consumer<String>toUpperCase = (str) -> System.out.println(str.toUpperCase());

		String input = "asd" ;

		toUpperCase.accept(input); //applies consumer function , doesn't modify input

		System.out.println(input);

		System.out.println("##########################");
		printNames();
		System.out.println();
		System.out.println("###########Name Activities###############");
		printNameAndActivities();

		System.out.println("########Condiiton###########");
		printNameAndActivitiesUsingCondition();
		
		System.out.println("#########BiCOnsumer##########");
		printNameAndActivitiesUsingBiConsumer();
	}

}
