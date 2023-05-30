package com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceAsLambda {

	public static void main(String[] args) {
		
		Comparator<Integer> ascendingComparator = ( a,  b) -> a.compareTo(b);
		
		Comparator<Integer> descendingComparator = ( a,  b) -> b.compareTo(a);
		
		List<Integer> list = Arrays.asList(4,1,5,80,12,50,90);
		
		Collections.sort(list, ascendingComparator);

		System.out.println("Ascending order sorted : "+ list.toString());
		
		Collections.sort(list, descendingComparator);
		
		System.out.println("Descending order sorted : "+ list.toString());

	}

}
