package com.data_base;

public record Employee(
        int id,
        String name,
        String city,
        String department,
        double salary,
        String gender
) {
}