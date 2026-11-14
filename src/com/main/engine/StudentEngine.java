package com.main.engine;

import com.java8.examples.FlatMapEx;

public class StudentEngine {
    static void main(String[] args) {
        System.out.println("--------student activities--------");
        FlatMapEx.getStdActs().forEach(System.out::println);
        System.out.println("----------std Names and Activities------");
        FlatMapEx.getStdnamesAActs().entrySet().stream().forEach(System.out::println);
    }
}
