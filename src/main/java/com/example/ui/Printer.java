package com.example.ui;

import com.example.model.Department;
import com.example.model.Employee;
import com.example.persistence.DepartmentService;
import com.example.persistence.EmployeeService;

public class Printer {

    public void printEmployees() {
        EmployeeService employeeService = new EmployeeService();
        for (Employee employee : employeeService.getAll()) {
            System.out.println("- " + employee.getName() + " " + employee.getSurname() + " - " + employee.getDepartment().getName());
        }
    }

    public void printDepartments() {
        DepartmentService departmentService = new DepartmentService();
        for (Department department : departmentService.getAll()) {
            System.out.println("----- " + department.getName() + " -----");
            for (Employee employee : department.getEmployees()) {
                System.out.println("- " + employee.getName() + " " + employee.getSurname());
            }
        }
    }
}
