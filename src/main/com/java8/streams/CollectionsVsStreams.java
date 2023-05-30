package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names = new ArrayList<>();
				//Arrays.asList("Adam" , "Brian" , "Charles") ;
		
		names.add("Adam") ;
		names.add("Brian");
		names.remove("Adam") ;
		
		System.out.println(names.toString());
		
		 // names.stream().   //no add,remove method
		                      //no get (index) method
		
		Stream<String> nameStream = names.stream() ; 
		nameStream.forEach(System.out :: println);
		nameStream.forEach(System.out :: println); //accessing stream once again causes java.lang.IllegalStateException
		
		

	}

}
