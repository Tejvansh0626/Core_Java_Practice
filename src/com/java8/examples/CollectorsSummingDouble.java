package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsSummingDouble {
   static List<Employee> employees= EmployeeDatabase.getEmployees();
   /*
   get the budget based on the Dept
    */

    public static Map<String, Double>  getBudgetDept(){
   Map<String, Double>  budgetBasedOnDept= employees.stream().collect(
                Collectors.groupingBy(Employee::department,
                        Collectors.summingDouble(Employee::salary))
        );
   return budgetBasedOnDept;
    }

}
