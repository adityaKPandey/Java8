package com.java8.functionalinterface.predicate;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateDemo {
	
	private BiPredicate<Integer, Double>gradeLevelGpaCondition = (gradeLevel , gpa) -> gradeLevel >= 3 && 
			gpa >= 3.9 ;
	
	private BiConsumer<String , List<String>> printNameActivities = (name , activities) -> System.out.println(name+" -> "+activities.toString()) ;		
			
    private Consumer<Student> printNameForGradeLevelGpaCondn = (student) -> {
    
    	if(gradeLevelGpaCondition.test(student.getGradeLevel(), student.getGpa()))
    		printNameActivities.accept(student.getName(), student.getActivities());
    		
    
    };
	

	
	public static void main(String[] args) {
		
		List<Student>students = StudentDataBase.getAllStudents();
		BiPredicateDemo biPredicateDemo = new BiPredicateDemo();
		
        students.forEach(biPredicateDemo.printNameForGradeLevelGpaCondn);
		
	}

}
