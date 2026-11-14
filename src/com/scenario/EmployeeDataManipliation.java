package com.scenario;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDataManipliation {

    static List<Employee> employees = EmployeeDatabase.getEmployees();

    /*
    get the Depts and Emp Names
     */

    public static Map<String, List<String>> getDeptEmpNames() {
        Map<String, List<String>> deptsAndNames = employees.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.mapping(list -> list.name(), Collectors.toList())));
        return deptsAndNames;
    }

    /*
    Max salary from the Emp DataBase
     */
    public static Optional<Employee> getMaxSalfrmEMpDb() {
        Optional<Employee> maxSal = employees.stream().max(Comparator.comparingDouble(Employee::salary));
        return maxSal;
    }

    /*
    2nd Max Salary from the Employee Database
     */

    public static Optional<Employee> getSecMaxSal() {
        Optional<Employee> secMaxSal = employees.stream().sorted(Comparator.comparingDouble(Employee::salary)
                .reversed()).skip(1).findFirst();
        return secMaxSal;
    }

    /*
    get the Min sal from Employee Database
     */

    public static Optional<Employee> getMinSal() {
        Optional<Employee> minSal = employees.stream().min(Comparator.comparingDouble(Employee::salary));
        return minSal;

    }

    /*
    get the sec min Salary from the Emp
     */
    public static Optional<Employee> getSecMinSal() {
        Optional<Employee> secMinSal = employees.stream().sorted(Comparator.comparingDouble(Employee::salary)).skip(1).findFirst();
        return secMinSal;
    }

    /*
    get the Max Sal from Each Dep
     */

    public static Map<String, Optional<Employee>> getMaxSalDept() {
        Map<String, Optional<Employee>> maxSalDept = employees.stream().collect(
                Collectors.groupingBy(Employee::department,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::salary))));
        return maxSalDept;
    }

    /*
      get the Sec High Salary from each Dept
     */

    public static Map<String, Optional<Employee>> getTheSecHighSalDept() {
        Map<String, Optional<Employee>> secMaxSalDept = employees.stream().collect(Collectors.groupingBy(
                Employee::department, Collectors.collectingAndThen(
                        Collectors.toList(), list -> list.stream()
                                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                                .skip(1).findFirst())));
        return secMaxSalDept;
    }


}
