package org.binshow.chapter5;


import java.time.LocalDate;

/**
 * 员工类
 */
public class Employee {

    private String name;
    private double salary;

    private LocalDate hireDay;



    public Employee(String name, double salary,  int year , int month , int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year , month , day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPrecent){
        double raise = salary * byPrecent / 100;
        salary += raise;
    }
}
