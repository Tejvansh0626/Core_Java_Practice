package com.java8.examples;

import com.data_base.Student;
import com.data_base.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsCounting {
    static List<Student> students = StudentDatabase.getStudents();

  /*
  get the students counting from course wise
   */

    public static Map<String, Long> getStdCountBasedDept() {
        Map<String, Long> stdCount = students.stream().collect(Collectors.groupingBy(Student::course, Collectors.counting()));
        return stdCount;

    }
}
