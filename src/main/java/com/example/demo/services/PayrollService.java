package com.example.demo.services;


import com.example.demo.models.DTOS.EmployeeDTO;
import com.example.demo.models.entities.Employee;
import com.example.demo.models.entities.Payroll;
import com.example.demo.models.factories.EmployeeFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PayrollService {
    private final EmployeeFactory factory;

    public PayrollService(EmployeeFactory factory) {
        this.factory = factory;
    }

    public Employee calculateTotalSalary(EmployeeDTO payload) {
        Employee employee = factory.create(payload);
        employee.calculateSalary();
        return employee;
    }

    public Payroll calculatePayroll(List<EmployeeDTO> payload) {
        List<Employee> employees = payload.stream()
                .map(factory::create)
                .collect(Collectors.toList());

        float totalSalary = 0;
        float totalBonus = 0;

        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
            totalBonus += employee.getBonus();
        }

        return new Payroll(employees, totalSalary, totalBonus);
    }
}
