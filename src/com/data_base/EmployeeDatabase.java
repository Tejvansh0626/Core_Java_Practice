package com.data_base;

import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> getEmployees() {

        return List.of(

                new Employee(101, "Ravi", "Hyderabad", "IT", 75000, "Male"),
                new Employee(102, "Priya", "Chennai", "HR", 65000, "Female"),
                new Employee(103, "Arjun", "Bangalore", "IT", 90000, "Male"),
                new Employee(104, "Sneha", "Pune", "Finance", 85000, "Female"),
                new Employee(105, "Kiran", "Mumbai", "IT", 78000, "Male"),
                new Employee(106, "Divya", "Hyderabad", "Testing", 60000, "Female"),
                new Employee(107, "Ramesh", "Delhi", "Support", 55000, "Male"),
                new Employee(108, "Anjali", "Chennai", "HR", 68000, "Female"),
                new Employee(109, "Vijay", "Bangalore", "Finance", 95000, "Male"),
                new Employee(110, "Keerthi", "Hyderabad", "IT", 82000, "Female")
        );
    }
}