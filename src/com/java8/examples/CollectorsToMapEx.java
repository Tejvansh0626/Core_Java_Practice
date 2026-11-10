package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsToMapEx {
    static List<Employee> employees = EmployeeDatabase.getEmployees();
    /*
    get the emp name and their id's

    for ID -> Entire Employee use this one
    Collectors.toMap(Employee::id, Function.identity())
     */

    public static Map<Integer, String> getEmpIdName() {
        Map<Integer, String> idANames = employees.stream().collect(
                Collectors.toMap(Employee::id, Employee::name)
        );
        return idANames;
    }

}
