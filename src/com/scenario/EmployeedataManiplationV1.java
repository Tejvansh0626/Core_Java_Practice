package com.scenario;

import com.data_base.Employee;
import com.data_base.EmployeeDatabase;

import java.lang.classfile.Opcode;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeedataManiplationV1 {
    static List<Employee> employees = EmployeeDatabase.getEmployees();

    /*
     find Department Wise Employee Count
     */
    public static Map<String, Long> getDeptEmpCount() {
        Map<String, Long> deptEmpCount = employees.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.counting()));
        return deptEmpCount;

    }
    /*
    level-1
    2. Department Wise Average Salary -> groupingBy + averagingDouble
    3. Department Wise Total Salary -> groupingBy + summingDouble
    4. Department Wise Employee Names -> groupingBy + mapping
     */

    // level-2

    /*
     Department Wise Top 3 Salaries
     */
    public static Map<String, List<Employee>> getTopThreeSalDept() {
        Map<String, List<Employee>> toThreeEmpDept = employees.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.collectingAndThen(Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(Employee::salary).reversed()).limit(3).toList())));
        return toThreeEmpDept;
    }

    /*
    Employee Count by Gender
     */

    public static Map<String, Long> getEmpCountGender() {
        Map<String, Long> empcountBaseOngender = employees.stream().collect(Collectors.groupingBy(Employee::gender, Collectors.counting()));
        return empcountBaseOngender;
    }

    /*
    Highest Salary by Gender
     */
    public static Map<String, Optional<Employee>> getHighSalBygender() {
        Map<String, Optional<Employee>> highSalByGender = employees.stream()
                .collect(Collectors.groupingBy(Employee::gender, Collectors.maxBy(Comparator.comparingDouble(Employee::salary))));
        return highSalByGender;

    }

    /*
  Employees Above Average Salary
   */
    public static List<Employee> getEmpAbvAvgSal() {
        Double avgSalary = employees.stream().collect(Collectors.averagingDouble(Employee::salary));
        List<Employee> abvAvgSal = employees.stream().filter(avgSal -> avgSal.salary() > avgSalary).toList();
        return abvAvgSal;
    }

    /*
    Department-wise Employees Above Department Average
     */
    public static   List<Employee> getDeptWiseAvgHighSal() {
        Map<String, Double> deptAvgSalary =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::department,
                                Collectors.averagingDouble(Employee::salary)
                        ));
        List<Employee> result = employees.stream().filter(emp -> emp.salary() > deptAvgSalary.get(emp.department())).toList();
  return  result;

    }
}
