package com.assignments.streams;

import java.util.List;
import java.util.Locale;

public class StreamsDemo {

  public void printCountriesAfterCapitalizingAndFilteringSorting(List<String> countries) {
    countries.stream().map(c -> c.toUpperCase(Locale.ROOT)).filter(c -> c.startsWith("C")).sorted()
        .forEach(c -> System.out.println(c));
  }
}
