package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMaxByEx {
    static List<Employee> employees = EmployeeDatabase.getEmployees();
  /*
  get the max salary from the employees list
   */

    public static Map<String, Optional<Employee>> getMaxSalFrmEmplDb() {
        Map<String, Optional<Employee>> maxSalfrmDept = employees.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.maxBy(Comparator.comparingDouble(Employee::salary))));
        return maxSalfrmDept;
    }

    public static Map<String, Optional<Employee>> getMinSalFrmEmplDb() {
        Map<String, Optional<Employee>> minSalfrmDept = employees.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.minBy(Comparator.comparingDouble(Employee::salary))));
        return minSalfrmDept;
    }

}
