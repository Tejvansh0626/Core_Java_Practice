package com.main.engine;

import com.java8.examples.FlatMapEx;
import com.scenario.EmployeeDataManipliation;
import com.scenario.EmployeedataManiplationV1;

public class EmployeeEngine {
    static void main(String[] args) {
        System.out.println(" <-----This Data related to Depts and emp Names----->");
        EmployeeDataManipliation.getDeptEmpNames().entrySet().forEach(System.out::println);
        System.out.println("<------- this Data related to Max Sal from Emp database------->");
        System.out.println(EmployeeDataManipliation.getMaxSalfrmEMpDb().get());
        System.out.println("<------- this Data is Sec Max Salary from Emp DataBase----->");
        System.out.println(EmployeeDataManipliation.getSecMaxSal().get());
        System.out.println("<------- this Data is Min Salary from Emp DataBase----->");
        System.out.println(EmployeeDataManipliation.getMinSal().get());

        System.out.println("<------- this Data is Sec Min Salary from Emp DataBase----->");
        System.out.println(EmployeeDataManipliation.getSecMinSal().get());

        System.out.println("--------this Data Related to Max Salary from the Each Dept");
        EmployeeDataManipliation.getMaxSalDept().entrySet().forEach(System.out::println);

        System.out.println("--------this Data Related to sec Max Salary from the Each Dept");
        EmployeeDataManipliation.getTheSecHighSalDept().entrySet().forEach(System.out::println);

        System.out.println("--------above Avg salary from Employees--------");
        EmployeedataManiplationV1.getEmpAbvAvgSal().forEach(System.out::println);

    }


}
