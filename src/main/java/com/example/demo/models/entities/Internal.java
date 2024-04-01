package com.example.demo.models.entities;

import java.time.LocalDate;

public class Internal extends Employee {
    public Internal() {
    }

    public Internal(String name, String email, float basicSalary, LocalDate entryDate) {
        super(name, email, basicSalary, entryDate);
    }

    @Override
    public float calculateSalary() {
        totalSalary = basicSalary * (1 + INCREMENT_PERCENTAGE / 100);
        LocalDate today = LocalDate.now();
        float totalDays = today.toEpochDay() - entryDate.toEpochDay() + DAYS_TO_START_HOURS_WORKED;
        float totalHours = totalDays * 8;

        if (totalHours < 8760) {
            bonus = 100000;
        } else if (totalHours < 17520) {
            bonus = 500000;
        } else if (totalHours < 26280) {
            bonus = 800000;
        } else {
            bonus = 1200000;
        }

        totalSalary += bonus;

        return totalSalary;
    }
}
