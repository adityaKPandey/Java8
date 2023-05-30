package com.assignments.functions;

public class Employee {

  private String firstName;
  private String lastName;
  private int yearsOfService;
  private Employee manager;
  private int numberOfDirectReports;

  public String getFirstName() {
    return firstName;
  }

  public Employee setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public Employee setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public int getYearsOfService() {
    return yearsOfService;
  }

  public Employee setYearsOfService(int yearsOfService) {
    this.yearsOfService = yearsOfService;
    return this;
  }

  public Employee getManager() {
    return manager;
  }

  public Employee setManager(Employee manager) {
    this.manager = manager;
    return this;
  }

  public int getNumberOfDirectReports() {
    return numberOfDirectReports;
  }

  public Employee setNumberOfDirectReports(int numberOfDirectReports) {
    this.numberOfDirectReports = numberOfDirectReports;
    return this;
  }
}
