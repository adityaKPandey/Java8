package com.assignments.functions;


import com.assignments.functions.Employee;
import com.assignments.functions.EmployeeUtils;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

  private EmployeeUtils employeeUtils = new EmployeeUtils();

  @Test
  public void testEmployeeFullName(){
    Employee employee = new Employee();
    employee.setFirstName("Jerome");
    employee.setLastName("Donaldson");

    String actual = employeeUtils.getFullName(employee);
    Assert.assertEquals(actual,"Jerome Donaldson");
  }

  @Test
  public void testEmployeeManagerLastName(){
    Employee employee = new Employee();
    employee.setFirstName("Jerome");
    employee.setLastName("Donaldson");

    Employee manager = new Employee();
    manager.setLastName("Westbay");
    employee.setManager(manager);

    String actual = employeeUtils.getManagersLastName(employee);
    Assert.assertEquals(actual,"Westbay");
  }

  @Test
  public void testEmployeeInEmploymentLongerThanFiveYears(){
    Employee employee = new Employee();
    employee.setYearsOfService(10);

    Assert.assertTrue(employeeUtils.hasBeenEmployedForMoreThanFiveYears(employee));
  }

  @Test
  public void testEmployeeInEmploymentLongerThanFiveYearsPredicate(){
    Employee employee = new Employee();
    employee.setYearsOfService(10);

    Assert.assertTrue(employeeUtils.hasBeenEmployedForMoreThanFiveYearsUsingPredicate(employee));
  }

}
