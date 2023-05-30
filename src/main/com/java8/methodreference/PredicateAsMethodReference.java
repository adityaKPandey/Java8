package com.java8.methodreference;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;
import java.util.function.Predicate;

public class PredicateAsMethodReference {

	public static Predicate<Student>isGradeLevelAtLeast3 = (student) -> student.getGradeLevel() >= 3;
	
	public static  Predicate<Student>isGradeLevelAtLeast3MethodReference = PredicateAsMethodReference :: greaterThanGradeLevel;
	
	public static  boolean greaterThanGradeLevel(Student student) {
		return student.getGradeLevel() > 3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isGradeLevelAtLeast3.test(StudentDataBase.studentSupplier.get()));
		
		System.out.println(isGradeLevelAtLeast3MethodReference.test(StudentDataBase.studentSupplier.get()));
		
		
	}

}
