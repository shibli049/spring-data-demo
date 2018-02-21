package com.elegantly.rocks.springdatademo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by github.com/shibli049 on 2/22/18.
 */

@Entity
@Table(name="employee")
public class Employee {

  @Id
  @GeneratedValue
  private Integer id;

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private Integer salary;

  public Employee() {
  }

  public Employee(String firstName, String lastName, Integer salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", salary=" + salary +
        '}';
  }
}
