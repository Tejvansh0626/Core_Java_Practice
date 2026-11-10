package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningEx {
    static List<Employee> employees = EmployeeDatabase.getEmployees();
    /*
    get the emp names with Commas
     */

    public static String getNamesSepWithComma() {
        String names = employees.stream().map(Employee::name).collect(Collectors.joining(",")
        );
        return names;
    }
}
