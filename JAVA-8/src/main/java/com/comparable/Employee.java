package com.comparable;

import java.util.Objects;

/**
 * @author vikas.bhardwaj3
 * 2/22/20208:41 PM2020
 */
public class Employee {

    private String employeeName;
    private int employeeSalary;

    public Employee(String employeeName, int employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployeeSalary() == employee.getEmployeeSalary() &&
                getEmployeeName().equals(employee.getEmployeeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeeSalary);
    }

    @Override
    public String toString() {
        return "Name: " + this.employeeName + " -- salary " + this.getEmployeeSalary();
    }
}
