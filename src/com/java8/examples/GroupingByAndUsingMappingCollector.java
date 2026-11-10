package com.java8.examples;

import com.data_base.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByAndUsingMappingCollector {
    static List<Employee> employees = EmployeeDatabase.getEmployees();
    static List<Student> students = StudentDatabase.getStudents();
    static List<Person> persons = PersonDatabase.getPersons();

    // get the dept and employees names
    public static Map<String, List<String>> getDeptAndNames() {
        Map<String, List<String>> deptsAndNames = employees.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.mapping(list -> list.name(), Collectors.toList())));
        return deptsAndNames;


    }
    /*
    get the Student Names and Courses
    by using grouping and mapping collector
     */

    public static Map<String, List<String>> getStdNamesAndCourses() {
        Map<String, List<String>> stdNamesAndCourse = students.stream().collect(Collectors.groupingBy(
                Student::course, Collectors.mapping(list -> list.name(), Collectors.toList())

        ));
        return stdNamesAndCourse;
    }

    /*
    get person names and Base locations using GroupingBy and mapping collector
     */
    public static Map<String, List<String>> getPersonNamesAndLocation() {
        Map<String, List<String>> personNamesAndLoc = persons.stream().collect(Collectors.groupingBy(
                Person::city, Collectors.mapping(list -> list.name(), Collectors.toList())
        ));
        return personNamesAndLoc;
    }
}
