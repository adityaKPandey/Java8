package com.assignments;

import com.assignments.streams.StreamsDemo;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class StreamsTest {

  StreamsDemo streamsDemo = new StreamsDemo();

  @Test
  public void test(){
    List<String> countries = Arrays.asList("India","China","Chile","Canada","USA");

    streamsDemo.capitalizingAndFilteringSorting(countries);
    System.out.println("Test over");
  }
}
