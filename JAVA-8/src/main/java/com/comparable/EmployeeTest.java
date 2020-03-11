package com.comparable;

import java.util.*;

/**
 * @author vikas.bhardwaj3
 * 2/22/20208:46 PM2020
 */
public class EmployeeTest{ //implements Comparator<Employee> {

    public static void main(String[] args) {

   /*     TreeSet<Employee> employees = new TreeSet<>(new EmployeeTest());
        employees.add(new Employee("ram", 3000));
        employees.add(new Employee("ram", 3000));
        employees.add(new Employee("john ", 6000));
        employees.add(new Employee("kuta", 20000));
        employees.add(new Employee("chutiya", 10000));
        employees.add(new Employee("kalu", 10000));

        System.out.println(employees);
*/

        Set<Employee> employees = new HashSet<>();
        Employee employee = new Employee("ram", 10000);
        Employee employee1 = new Employee("ram", 10000);
        Employee employee2 = new Employee("vikas", 10000);
        Employee employee3 = new Employee("asasa", 10000);
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employee.equals(employee1));
        System.out.println(employees);

    }


   /* @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getEmployeeSalary() > o2.getEmployeeSalary()) {
            System.out.println("sorting based on employee salary ");
            return 1;
        } else
            System.out.println("sorting based on name when salary is equal");
        return o1.getEmployeeName().compareTo(o2.getEmployeeName());
    }*/
}
