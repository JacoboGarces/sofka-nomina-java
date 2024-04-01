package com.example.demo.models.entities;

import java.util.List;

public class Payroll {
    private List<Employee> employees;
    private float total;
    private Float totalBonus;

    public Payroll(List<Employee> employees, float total, Float totalBonus) {
        this.employees = employees;
        this.total = total;
        this.totalBonus = totalBonus;
    }

    public Payroll() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Float getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(Float totalBonus) {
        this.totalBonus = totalBonus;
    }
}
