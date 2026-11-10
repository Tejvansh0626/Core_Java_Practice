package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.util.List;
import java.util.Optional;

public class FiindFristAcount {
    static List<Employee> employees = EmployeeDatabase.getEmployees();

    public static Optional<Employee> getFstEMployeeFromHydACount() {
        Optional<Employee> fstEmployee = employees.stream()
                .filter(emp -> emp.city()
                        .equalsIgnoreCase("Hyderabad"))
                .findFirst();
        return fstEmployee;
    }
}
