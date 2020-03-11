package com.java8;

/**
 * @author vikas.bhardwaj3
 * 1/25/20202:06 PM2020
 */

public class Employee implements Comparable<Employee> {

    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


    public int compareTo(Employee employee) {

        return this.name.compareTo(employee.name);
    }
}
