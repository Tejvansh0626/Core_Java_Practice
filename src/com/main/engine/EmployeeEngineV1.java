package com.main.engine;

import com.scenario.EmployeedataManiplationV1;

public class EmployeeEngineV1 {
    static void main(String[] args) {
        System.out.println("Dept wise Employee list");
        EmployeedataManiplationV1.getDeptEmpCount().entrySet().forEach(System.out::println);

        System.out.println("<-------------Top Three Employees Slary From Each Dept-------->");
        EmployeedataManiplationV1.getTopThreeSalDept().entrySet().forEach(System.out::println);

        System.out.println("<-------------data is related to count the employees based on gender-------->");
        EmployeedataManiplationV1.getTopThreeSalDept().entrySet().forEach(System.out::println);

        System.out.println("<-------------data is related high Avg Salary from Employees-------->");
        EmployeedataManiplationV1.getHighSalBygender().entrySet().forEach(System.out::println);

        System.out.println("<-------------data is related high avg Salary from Each dept-------->");
        EmployeedataManiplationV1.getDeptWiseAvgHighSal().forEach(System.out::println);
    }

}
