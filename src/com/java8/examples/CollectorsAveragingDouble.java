package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsAveragingDouble {
   static List<Employee> employees= EmployeeDatabase.getEmployees();
   /*
   Average Salary by Department
    */
    public static Map<String, Double> getAvgSalBasedOndept(){
   Map<String, Double> avgSalBasedOnDept= employees.stream().collect(Collectors.groupingBy(
                Employee::department, Collectors.averagingDouble(Employee::salary)

        ));
   return  avgSalBasedOnDept;
    }
}
