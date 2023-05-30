package com.java8.methodreference;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAsMethodReference {

	private static Consumer<Student> printStudentLambda = (student) -> System.out.println(student.getName() +" ");
	
	private static Consumer<Student> printStudentMethodReference = System.out :: println ;
	
	//print only the list of activities
	private static Consumer<Student> printActivitiesMethodReference = Student :: printActivities ;
	
	//private static Consumer<List<String>> printStudentActivitiesMethodReference = System.out :: print ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students   = StudentDataBase.getAllStudents();
		
		students.forEach(printStudentMethodReference);
		
		System.out.println("##############################");
		
		students.forEach(  printActivitiesMethodReference );
		
	}

}
