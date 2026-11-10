package com.data_base;

import java.util.List;

public class StudentDatabase {

    public static List<Student> getStudents() {

        return List.of(

                new Student(101, "Ravi", 21, "Male", "Hyderabad", "Java", 4, 85.5, "A", true),
                new Student(102, "Priya", 20, "Female", "Chennai", "Python", 3, 91.2, "A+", true),
                new Student(103, "Arjun", 22, "Male", "Bangalore", "Java", 4, 76.5, "B", false),
                new Student(104, "Sneha", 21, "Female", "Pune", "Spring Boot", 4, 88.4, "A", true),
                new Student(105, "Kiran", 19, "Male", "Mumbai", "Python", 2, 72.8, "B", false),

                new Student(106, "Divya", 20, "Female", "Hyderabad", "Java", 3, 94.1, "A+", true),
                new Student(107, "Mahesh", 21, "Male", "Delhi", "React", 4, 68.5, "C", false),
                new Student(108, "Lavanya", 22, "Female", "Chennai", "Java", 4, 89.7, "A", true),
                new Student(109, "Teja", 20, "Male", "Bangalore", "Spring Boot", 3, 82.2, "A", true),
                new Student(110, "Anjali", 19, "Female", "Pune", "Python", 2, 79.1, "B", false),

                new Student(111, "Rahul", 21, "Male", "Mumbai", "Java", 4, 86.3, "A", true),
                new Student(112, "Swathi", 22, "Female", "Hyderabad", "React", 4, 92.6, "A+", true),
                new Student(113, "Vijay", 20, "Male", "Delhi", "Python", 3, 65.0, "C", false),
                new Student(114, "Keerthi", 21, "Female", "Chennai", "Spring Boot", 4, 87.4, "A", true),
                new Student(115, "Sandeep", 22, "Male", "Bangalore", "Java", 4, 74.8, "B", false),

                new Student(116, "Harika", 20, "Female", "Pune", "React", 3, 93.5, "A+", true),
                new Student(117, "Prakash", 21, "Male", "Mumbai", "Spring Boot", 4, 81.4, "A", true),
                new Student(118, "Nandini", 19, "Female", "Hyderabad", "Python", 2, 77.6, "B", false),
                new Student(119, "Ajay", 22, "Male", "Delhi", "Java", 4, 90.5, "A+", true),
                new Student(120, "Bhavya", 21, "Female", "Chennai", "React", 4, 84.2, "A", true)

        );
    }
}