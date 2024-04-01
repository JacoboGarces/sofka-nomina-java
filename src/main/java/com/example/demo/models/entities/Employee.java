package com.example.demo.models.entities;

import java.time.LocalDate;

public abstract class Employee {
    protected String name;
    protected String email;
    protected float basicSalary;
    protected float totalSalary;
    protected int bonus;
    protected LocalDate entryDate;
    protected final float INCREMENT_PERCENTAGE = 50;
    protected final float DAYS_TO_START_HOURS_WORKED = 1;

    public Employee(String name, String email, float basicSalary, LocalDate entryDate) {
        this.name = name;
        this.email = email;
        this.basicSalary = basicSalary;
        this.entryDate = entryDate;
    }

    public Employee() {
    }

    public abstract float calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
}

