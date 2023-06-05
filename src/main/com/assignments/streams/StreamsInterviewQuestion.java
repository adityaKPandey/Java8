package com.assignments.streams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/*
    Epam Interview question : 22 May , 2023
    Given list of terms , return a term with unbooked (not fully booked) session terms . If there are more than 1 such term ,
    then return that term which has the earliest start date.
 */
public class StreamsInterviewQuestion {

  private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

  public static void main(String[] args) {

      Supplier<List<Term>> termSupplier = () -> {
        try {
          return Arrays.asList(new Term("1", 10, 12,
                  simpleDateFormat.parse("01-05-2022"),  simpleDateFormat.parse("31-05-2022")),
              new Term("2", 12, 12, simpleDateFormat.parse("01-01-2022"), simpleDateFormat.parse("31-01-2022")),
              new Term("3", 0, 12, simpleDateFormat.parse("01-06-2022"), simpleDateFormat.parse("30-06-2022")));
        } catch (ParseException e) {
          e.printStackTrace();
        }
        return null;
      };

      List<Term> terms = termSupplier.get();
      System.out.println(terms);
      Optional<Term> optionalTerm = terms.stream().filter(term -> term.booked < term.total)
          .max(/*(term1,term2) -> term2.startDate.compareTo(term1.startDate)*/Comparator.comparing(Term::getStartDate).reversed());

      if (optionalTerm.isPresent()) {
        System.out.println(optionalTerm.get());
      }



  }

  static class Term {

    String id;
    int booked;
    int total;
    Date startDate;
    Date endDate;

    public Term(String id, int booked, int total, Date startDate, Date endDate) {
      this.id = id;
      this.booked = booked;
      this.total = total;
      this.startDate = startDate;
      this.endDate = endDate;
    }

    public Date getStartDate() {
      return startDate;
    }

    @Override
    public String toString() {
      return "Term{" +
          "id='" + id + '\'' +
          ", booked=" + booked +
          ", total=" + total +
          ", startDate=" + startDate +
          ", endDate=" + endDate +
          '}';
    }
  }
}
