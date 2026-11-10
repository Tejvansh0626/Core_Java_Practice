package com.main.engine;

import com.java8.examples.*;

public class Engine {
    static void main(String[] args) {
        System.out.println("get employee names dep wise ----->");
        GroupingByAndUsingMappingCollector.getDeptAndNames().entrySet().forEach(System.out::println);

        System.out.println("get female employees list dep wise using collectors.grouping By  ----->");
        CollectorsGroupingEx.getGenderWise().entrySet().forEach(System.out::println);

        System.out.println("<------  get the Student Names based on courses  ----->");
        CollectorsMappingEx.getStdNamesCourseWIse().entrySet().forEach(System.out::println);

        System.out.println("<------  get the Students count based on courses   ----->");
        CollectorsCounting.getStdCountBasedDept().entrySet().forEach(System.out::println);


        System.out.println("<------  Average Salary by Department wise   ----->");
        CollectorsAveragingDouble.getAvgSalBasedOndept().entrySet().forEach(System.out::println);

        System.out.println("<------  get the Department Salary Budget  ----->");
        CollectorsSummingDouble.getBudgetDept().entrySet().forEach(System.out::println);

        System.out.println("<------  get the max salary from depts  ----->");

        CollectorsMaxByEx.getMaxSalFrmEmplDb().entrySet().forEach(System.out::println);

        System.out.println("<------  get the min salary from depts  ----->");

        CollectorsMaxByEx.getMinSalFrmEmplDb().entrySet().forEach(System.out::println);

        System.out.println("<------  get Employee names sperated  ----->");

        System.out.println(CollectorsJoiningEx.getNamesSepWithComma());

        System.out.println("<------  Map Emp Id And Names  ----->");
        CollectorsToMapEx.getEmpIdName().entrySet().forEach(System.out::println);

        System.out.println("<------  Total reports  ----->");

        System.out.println(CollectorsDoubleSummaryStatistics.getStatsticsOfSal());





      /*  System.out.println("Students Names with their courses---->>>>>");
        GroupingByAndUsingMappingCollector.getStdNamesAndCourses()
                .entrySet().forEach(System.out::println);
        System.out.println("get the person names base Locations ---------------->>..");
        GroupingByAndUsingMappingCollector.getPersonNamesAndLocation().entrySet().forEach(System.out::println);*/



        /*System.out.println("<---------get the IT dept employee names -----> ");
        FilterFeatureUsing.getITDepts().forEach(System.out::println);

        System.out.println("<----------get the famle names from the Person Database--->>>>");
        FilterFeatureUsing.getFemaleNames().forEach(System.out::println);*/

        /*System.out.println("get Names from Employees using Map");
        MapFeatureUsing.getMaleNames().forEach(System.out::println);
        System.out.println("<----------get the persons names from the Database --------------->");
        MapFeatureUsing.getPersonNames().forEach(System.out::println);*/

       /* System.out.print("<----------print the unique courses from student Databases--------->");
        DistinctFeature.getUniQCourses().forEach(System.out::println);

        System.out.print("<----------print the unique cities from person Databases--------->");
        DistinctFeature.getUniqCities().forEach(System.out::println);*/

       /* System.out.print("<-----------list of top 10 high salaried employees in emp database ----------->");
        SortALimtASkip.getToptenEmpHighSal().forEach(System.out::println);

        System.out.print("<-----------list of top 10 2nd high salaried employees in emp database ----------->");
        System.out.println(SortALimtASkip.getSecToptenHighSal().orElse(null));
        System.out.println("<------fst employee from the Hyd location in LTM is ------>");
        System.out.println(FiindFristAcount.getFstEMployeeFromHydACount().orElse(null));*/


    }
}
