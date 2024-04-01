package com.example.demo.models.factories;

import com.example.demo.models.DTOS.EmployeeDTO;
import com.example.demo.models.entities.Employee;
import com.example.demo.models.entities.External;
import com.example.demo.models.entities.Internal;
import com.example.demo.models.enums.EmployeeType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeFactory {
    public Employee create(EmployeeDTO payload) {
        Map<EmployeeType, Employee> employeeChildren = new HashMap<>();
        employeeChildren.put(EmployeeType.EXTERNAL, new External(payload.getName(), payload.getEmail(), payload.getBasicSalary(), payload.getEntryDate()));
        employeeChildren.put(EmployeeType.INTERNAL, new Internal(payload.getName(), payload.getEmail(), payload.getBasicSalary(), payload.getEntryDate()));

        Employee employee = employeeChildren.get(payload.getType());

        if (employee == null) {
            throw new IllegalArgumentException("Type unrecognized.");
        }

        return employee;
    }
}
