package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;
import com.data_base.Person;
import com.data_base.PersonDatabase;

import java.util.List;

public class FilterFeatureUsing {
    static List<Employee> employees = EmployeeDatabase.getEmployees();
    static List<Person> personList = PersonDatabase.getPersons();

    /*
    Note: filter() is used to eliminate unwanted records and keep only matching records.
    get  IT department Employees list from employee database using filters
     */
    public static List<Employee> getITDepts() {
        List<Employee> itDepEmploees = employees.stream().
                filter(emp -> emp.department()
                        .equalsIgnoreCase("IT")).toList();

        return itDepEmploees;
    }
    /*
    get the female names from persons Database
     */

    public static List<Person> getFemaleNames() {
        List<Person> femaleNames = personList.stream().filter(female -> female.gender()
                        .equalsIgnoreCase("female") && female.city().equalsIgnoreCase("chennai"))
                .toList();
        return femaleNames;

    }


}
