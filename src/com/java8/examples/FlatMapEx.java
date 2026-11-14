package com.java8.examples;

import com.data_base.Student;
import com.data_base.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapEx {
    static List<Student> students = StudentDatabase.getStudents();

    /*
    get the student Activities
     */
    public static List<String> getStdActs() {
        List<String> stdActs = students.stream().map(Student::activities).flatMap(List::stream).distinct().toList();
        return stdActs;
    }

    /*
    get the Student Names their Activities
     */
    public static Map<String, List<String>> getStdnamesAActs() {
        Map<String, List<String>> stdNamesAndActs = students.stream().collect(Collectors.groupingBy(Student::name,
                Collectors.flatMapping(list -> list.activities().stream(), Collectors.toList())));
        return stdNamesAndActs;
    }
}
