package com.java8.examples;

import com.data_base.Student;
import com.data_base.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMappingEx {
    static List<Student> students = StudentDatabase.getStudents();
    /*
    get the student names course wise
     */

    public static Map<String, List<String>> getStdNamesCourseWIse() {
        Map<String, List<String>> stdNamesCouseWise = students.stream().collect(Collectors.groupingBy(
                Student::course, Collectors.mapping(Student::name, Collectors.toList())

        ));
        return stdNamesCouseWise;
    }
}
