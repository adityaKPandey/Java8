package com.assignments;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

  public String getFullName(Employee employee) {
    Function<Employee, String> fullName = employee1 -> employee1.getFirstName() + " "
        + employee1.getLastName();
    return fullName.apply(employee);
  }

  public String getManagersLastName(Employee employee) {
    Function<Employee, String> managerLastName = employee1 -> employee1.getManager().getLastName();
    return managerLastName.apply(employee);
  }

  public boolean hasBeenEmployedForMoreThanFiveYears(Employee employee) {
    Function<Employee, Boolean> hasBeenEmployedForMoreThanFiveYears = employee1 ->
        employee1.getYearsOfService() > 5;
    return hasBeenEmployedForMoreThanFiveYears.apply(employee);
  }

  public boolean hasBeenEmployedForMoreThanFiveYearsUsingPredicate(Employee employee) {
    Predicate<Employee> hasBeenEmployedForMoreThanFiveYears = (employee1 ->
        employee1.getYearsOfService() > 5);
    return hasBeenEmployedForMoreThanFiveYears.test(employee);
  }

  public boolean hasMoreThanThreeDirectReports(Employee employee) {
    Function<Employee, Boolean> hasMoreThanThreeDirectReports = employee1 ->
        employee1.getNumberOfDirectReports() > 3;
    return hasMoreThanThreeDirectReports.apply(employee);
  }

  public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
    Predicate<Employee> hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports = (employee1 ->
        employee1.getYearsOfService() > 3 && employee1.getNumberOfDirectReports() > 2);
    return hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
  }



}
