package com.data_base;

import java.util.List;

public class PersonDatabase {

    public static List<Person> getPersons() {

        return List.of(

                new Person(101, "Ravi", 25, "Male", "Hyderabad", "Software Engineer", 85000, false),
                new Person(102, "Priya", 28, "Female", "Chennai", "Teacher", 50000, true),
                new Person(103, "Arjun", 32, "Male", "Bangalore", "Doctor", 120000, true),
                new Person(104, "Sneha", 27, "Female", "Pune", "HR Manager", 75000, false),
                new Person(105, "Kiran", 30, "Male", "Mumbai", "Software Engineer", 95000, true),

                new Person(106, "Divya", 24, "Female", "Hyderabad", "Tester", 60000, false),
                new Person(107, "Rahul", 35, "Male", "Delhi", "Police Officer", 70000, true),
                new Person(108, "Anjali", 26, "Female", "Chennai", "Teacher", 55000, false),
                new Person(109, "Vijay", 40, "Male", "Bangalore", "Business Analyst", 130000, true),
                new Person(110, "Keerthi", 29, "Female", "Hyderabad", "Software Engineer", 90000, true),

                new Person(111, "Mahesh", 31, "Male", "Mumbai", "Doctor", 150000, true),
                new Person(112, "Swathi", 23, "Female", "Pune", "Student", 0, false),
                new Person(113, "Prakash", 38, "Male", "Delhi", "Lawyer", 110000, true),
                new Person(114, "Lavanya", 25, "Female", "Chennai", "Software Engineer", 85000, false),
                new Person(115, "Sandeep", 34, "Male", "Bangalore", "Architect", 98000, true),

                new Person(116, "Bhavya", 22, "Female", "Hyderabad", "Student", 0, false),
                new Person(117, "Ajay", 29, "Male", "Mumbai", "Tester", 65000, false),
                new Person(118, "Nandini", 33, "Female", "Pune", "Doctor", 140000, true),
                new Person(119, "Teja", 26, "Male", "Delhi", "Teacher", 52000, false),
                new Person(120, "Harika", 27, "Female", "Bangalore", "Business Analyst", 92000, true)

        );
    }
}