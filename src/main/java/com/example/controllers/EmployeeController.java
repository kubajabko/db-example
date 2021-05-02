package com.example.controllers;

import com.example.model.Employee;
import com.example.persistence.EmployeeService;

public class EmployeeController {

    EmployeeService employeeService;

    public void addEmployeeToDB (Employee employee) {
        employeeService.add(employee);
    }
}
