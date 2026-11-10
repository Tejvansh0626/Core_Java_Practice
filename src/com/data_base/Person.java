package com.data_base;

public record Person(
        int id,
        String name,
        int age,
        String gender,
        String city,
        String profession,
        double salary,
        boolean married
) {
}
