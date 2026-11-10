package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;
import com.data_base.Person;
import com.data_base.PersonDatabase;

import java.util.List;

public class MapFeatureUsing {
    static List<Employee> employees = EmployeeDatabase.getEmployees();
    static List<Person> persons = PersonDatabase.getPersons();

    /*
    map() transforms one object into another object.
    get the Male Names from Employees
     */
    public static List<String> getMaleNames() {
        List<String> names = employees.stream().filter(male -> male.gender().equalsIgnoreCase("male")).map(Employee::name).toList();
        return names;
    }

    /*
    get the person list from person database
     */
    public static List<String> getPersonNames() {
        List<String> personsNames = persons.stream().map(Person::name).toList();
        return personsNames;

    }



}
