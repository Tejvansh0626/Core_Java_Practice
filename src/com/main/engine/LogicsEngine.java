package com.main.engine;

import com.logics.ListOfNumberStatistics;
import com.logics.StringManiplation;

import java.util.Arrays;

public class LogicsEngine {
    static void main(String[] args) {
        System.out.println(" find duplicates here using \\s+");
        StringManiplation.findDuplicateInString("I , am gain , 987java 88Knowledge").forEach(System.out::println);

        System.out.println("get the occurence of letters in String ");
        StringManiplation.findOccur("I , am gain , 987java 88Knowledge").entrySet().forEach(System.out::println);

        System.out.println("get the non rep Chars from the String ");
        StringManiplation.findNonRepChar("I , am gain , 987java 88Knowledge").forEach(System.out::println);

        System.out.println("get the 1st Reepated character");
        System.out.println(StringManiplation.FstNonChar("I , am gain , 987java 88Knowledge").get());

        System.out.println("get the Max Number ");
        System.out.println(ListOfNumberStatistics.getHighNum(Arrays.asList(1, 2, 48, 67, 99, 675, 342, 90)).get());

        System.out.println("get sec Max Number ");
        System.out.println(ListOfNumberStatistics.getSecHighNum(Arrays.asList(1, 2, 48, 67, 99, 675, 342, 90)).get());

        System.out.println("get min  Number ");
        System.out.println(ListOfNumberStatistics.getMinNum(Arrays.asList(1, 2, 48, 67, 99, 675, 342, 90)).get());

        System.out.println("get sec Min  Number ");
        System.out.println(ListOfNumberStatistics.getSecMinNum(Arrays.asList(1, 2, 48, 67, 99, 675, 342, 90)).get());


    }

}
