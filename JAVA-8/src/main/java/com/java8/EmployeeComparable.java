package com.java8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author vikas.bhardwaj3
 * 1/30/20207:20 PM2020
 */
public class EmployeeComparable  {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("vika","12"));
        employeeArrayList.add(new Employee("Bali","13"));
        employeeArrayList.add(new Employee("kuma","14"));
        employeeArrayList.add(new Employee("Ajay","15"));
        Collections.sort(employeeArrayList);

        for (Employee e:employeeArrayList){
            System.out.println(e.getName()+" "+e.getId());
        }

    }
}
