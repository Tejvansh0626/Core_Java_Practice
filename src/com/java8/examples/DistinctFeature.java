package com.java8.examples;

import com.data_base.Person;
import com.data_base.PersonDatabase;
import com.data_base.Student;
import com.data_base.StudentDatabase;

import java.util.List;

public class DistinctFeature {
    static List<Student> students = StudentDatabase.getStudents();
    static List<Person> persons = PersonDatabase.getPersons();

  /*
  Duplicate cities remove చేస్తుంది
   */

    public static List<String> getUniQCourses() {
        List<String> uniqCourses = students.stream().map(Student::course).distinct().toList();
        return uniqCourses;

    }

    public static List<String> getUniqCities() {
       List<String> unqiecities= persons.stream().map(Person::city).distinct().toList();
       return unqiecities;

    }
}
