package com.data_base;

public record Student(
        int id,
        String name,
        int age,
        String gender,
        String city,
        String course,
        int year,
        double percentage,
        String grade,
        boolean placed
) {
}
