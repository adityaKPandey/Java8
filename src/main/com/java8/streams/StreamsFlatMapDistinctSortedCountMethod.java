package com.java8.streams;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFlatMapDistinctSortedCountMethod {

	private static List<Student> students =  StudentDataBase.getAllStudents();
	
	public static void printStudentActivities() {
		
		
		Function<List<Student> , List<List<String>>> listOfActivitiesFunc = (studentList) -> {
			List<List<String>>listOfActivities = new ArrayList<List<String>>();
			studentList.forEach((student) -> {
			    listOfActivities.add(student.getActivities());
			});
			return listOfActivities;
		};
		
		;
		
		Set<String> activities = listOfActivitiesFunc.apply(students).stream().flatMap((list) -> list.stream()).collect(Collectors.toSet());
		
		System.out.println(activities.toString());
		
		System.out.println("Set:"+students.stream().map(Student :: getActivities).flatMap(List :: stream).collect(Collectors.toSet()));

		System.out.println("List:"+students.stream().map(Student :: getActivities).flatMap(List :: stream).collect(Collectors.toList()));

		System.out.println("Distinct:"+students.stream().map(Student :: getActivities).flatMap(List :: stream).distinct().collect(Collectors.toList()));
		
		
		
		System.out.println("Sorted:"+students.stream().map(Student :: getActivities).flatMap(List :: stream).sorted().collect(Collectors.toSet()));
		
		
	}
	
	public static long countNoOfActivities() {
		
		return students.stream().map(Student :: getActivities).flatMap(List :: stream).distinct().count();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> listOfnamesList = Arrays.asList(Arrays.asList("Kunal" , "Ramesh" , "Shiv") , Arrays.asList("Qwerty" , "Asdfgh" , "Zxcvb")) ;
		
		Stream<String> namesStream = listOfnamesList.stream().flatMap((list) -> list.stream()) ;
		
		List<String> names =  namesStream.collect(Collectors.toList());
		
		System.out.println(names.size());
		System.out.println(names.toString());
		
		
		printStudentActivities();
		
		System.out.println("Total No Of Activities:"+countNoOfActivities());
		
	}

}
