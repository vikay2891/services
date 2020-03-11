package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author vikas.bhardwaj3
 * 1/25/20202:05 PM2020
 */
public class Predicate1 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Vikas", "101"),
                new Employee("AJAy", "102")
        );

        Employee employee1 = new Employee("Vikas", "101");
        Predicate<Employee> employeePredicate = employee -> employee.getId().equals("101");
        Predicate<Employee> employeePredicate2 = employee -> employee.getName().equals("Vikas");
        System.out.println(employees.stream().filter(employeePredicate.and(employeePredicate2)).collect(Collectors.toList()));
        System.out.println(employeePredicate.and(employeePredicate2).test(employee1));
        System.out.println(employeePredicate.or(employeePredicate2).test(employee1));
        System.out.println(employeePredicate.or(employeePredicate2).negate().test(employee1));


    }

}
