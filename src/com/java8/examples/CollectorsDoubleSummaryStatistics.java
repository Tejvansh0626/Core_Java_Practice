package com.java8.examples;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDoubleSummaryStatistics {
   static List<Employee> employees= EmployeeDatabase.getEmployees();

   /*
   get the total salary stastics report for Slaray
    */

    public static DoubleSummaryStatistics getStatsticsOfSal(){
        DoubleSummaryStatistics reports= employees.stream().collect(Collectors.summarizingDouble(Employee::salary));
        return reports;
    }
}
