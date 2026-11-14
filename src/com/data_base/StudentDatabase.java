package com.data_base;

import java.util.List;

public class StudentDatabase {

    public static List<Student> getStudents() {

        return List.of(

                new Student(101, "Ravi", 21, "Male", "Hyderabad", "Java", 4,
                        85.5, "A", true,
                        List.of("Cricket", "Coding", "Chess")),

                new Student(102, "Priya", 20, "Female", "Chennai", "Python", 3,
                        91.2, "A+", true,
                        List.of("Reading", "Dance", "Music")),

                new Student(103, "Arjun", 22, "Male", "Bangalore", "Java", 4,
                        76.5, "B", false,
                        List.of("Cricket", "Football", "Gaming")),

                new Student(104, "Sneha", 21, "Female", "Pune", "Spring Boot", 4,
                        88.4, "A", true,
                        List.of("Coding", "Reading", "Yoga")),

                new Student(105, "Kiran", 19, "Male", "Mumbai", "Python", 2,
                        72.8, "B", false,
                        List.of("Chess", "Gaming", "Music")),

                new Student(106, "Divya", 20, "Female", "Hyderabad", "Java", 3,
                        94.1, "A+", true,
                        List.of("Coding", "Dance", "Music")),

                new Student(107, "Mahesh", 21, "Male", "Delhi", "React", 4,
                        68.5, "C", false,
                        List.of("Football", "Gaming", "Cricket")),

                new Student(108, "Lavanya", 22, "Female", "Chennai", "Java", 4,
                        89.7, "A", true,
                        List.of("Reading", "Coding", "Yoga")),

                new Student(109, "Teja", 20, "Male", "Bangalore", "Spring Boot", 3,
                        82.2, "A", true,
                        List.of("Cricket", "Music", "Gaming")),

                new Student(110, "Anjali", 19, "Female", "Pune", "Python", 2,
                        79.1, "B", false,
                        List.of("Dance", "Reading", "Painting")),

                new Student(111, "Rahul", 21, "Male", "Mumbai", "Java", 4,
                        86.3, "A", true,
                        List.of("Coding", "Cricket", "Football")),

                new Student(112, "Swathi", 22, "Female", "Hyderabad", "React", 4,
                        92.6, "A+", true,
                        List.of("Yoga", "Music", "Reading")),

                new Student(113, "Vijay", 20, "Male", "Delhi", "Python", 3,
                        65.0, "C", false,
                        List.of("Gaming", "Chess", "Football")),

                new Student(114, "Keerthi", 21, "Female", "Chennai", "Spring Boot", 4,
                        87.4, "A", true,
                        List.of("Dance", "Coding", "Painting")),

                new Student(115, "Sandeep", 22, "Male", "Bangalore", "Java", 4,
                        74.8, "B", false,
                        List.of("Cricket", "Chess", "Gaming")),

                new Student(116, "Harika", 20, "Female", "Pune", "React", 3,
                        93.5, "A+", true,
                        List.of("Yoga", "Reading", "Music")),

                new Student(117, "Prakash", 21, "Male", "Mumbai", "Spring Boot", 4,
                        81.4, "A", true,
                        List.of("Football", "Coding", "Chess")),

                new Student(118, "Nandini", 19, "Female", "Hyderabad", "Python", 2,
                        77.6, "B", false,
                        List.of("Painting", "Dance", "Music")),

                new Student(119, "Ajay", 22, "Male", "Delhi", "Java", 4,
                        90.5, "A+", true,
                        List.of("Cricket", "Coding", "Football")),

                new Student(120, "Bhavya", 21, "Female", "Chennai", "React", 4,
                        84.2, "A", true,
                        List.of("Reading", "Yoga", "Painting"))
        );
    }
}