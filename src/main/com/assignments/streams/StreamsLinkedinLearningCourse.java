package com.assignments.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamsLinkedinLearningCourse {

  public static void main(String [] args){
    List<String> shoppingList = new ArrayList<>();
    shoppingList.add("coffee");
    shoppingList.add("bread");
    shoppingList.add("pineapple");
    shoppingList.add("milk");
    shoppingList.add("pasta");

    shoppingList.stream().sorted().forEach(System.out :: println);

    System.out.println("#####Capitalize and print");
    shoppingList.stream().map(s -> s.toUpperCase(Locale.ROOT)).forEach(System.out :: println);

    System.out.println("####Sort , Capitalize , Filter those starting with letter P and print");
    shoppingList.stream().sorted().map( item -> item.toUpperCase(Locale.ROOT))
        .filter(item -> item.startsWith("P")).forEach(System.out :: println);

    //Streams can only be used once . Reusing old stream throws IllegalStateException

    System.out.println("####Sort , Capitalize , Filter those starting with letter P and store them somewhere");
    List<String> output = shoppingList.stream().sorted().map( item -> item.toUpperCase(Locale.ROOT))
        .filter(item -> item.startsWith("P")).collect(Collectors.toList());
    System.out.println(output);

  }
}
