package com.java8.streams;

import com.java8.functionalinterface.consumer.Student;
import com.java8.functionalinterface.consumer.StudentDataBase;

public class StreamMapReduce {

	private static int findTotalNumberOfNotebooks() {

		return StudentDataBase.getAllStudents().stream().map(Student:: getNotebooks).reduce( 0 , Integer ::sum);
	}

	private static int findTotalNumberOfNotebooksForStudentsOfGradeLevelGE3() {

		return StudentDataBase.getAllStudents().stream().filter((s) -> s.getGradeLevel() >= 3).map(Student :: getNotebooks).reduce( 0 , Integer ::sum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Total number of notebooks: "+findTotalNumberOfNotebooks());
		
		System.out.println("Total number of notebooks for students with grade level greater than or equal to 3: "+findTotalNumberOfNotebooksForStudentsOfGradeLevelGE3());
	}

}
