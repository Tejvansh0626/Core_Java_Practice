package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortALimtASkip {
    static List<Employee> employees = EmployeeDatabase.getEmployees();

    /*
    find the top 10 employees  high salary from employee DataBase
     */
    public static List<Employee> getToptenEmpHighSal() {
        List<Employee> topTenEmpSal = employees.stream().sorted(Comparator.comparing(Employee::salary).reversed())
                .limit(10).toList();
        return topTenEmpSal;
    }

    public static Optional<Employee> getSecToptenHighSal() {
        Optional<Employee> topSecHighSalEmp = employees.stream().sorted(Comparator.comparing(Employee::salary).reversed())
                .limit(10).skip(1).findFirst();
        return topSecHighSalEmp;
    }
}
