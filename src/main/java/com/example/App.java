package com.example;

import com.example.model.Department;
import com.example.model.Employee;

import com.example.persistence.DepartmentService;
import com.example.persistence.EmployeeService;

public class App {

    //private boolean isOn = true;

    public static void main(String[] args) {
        Employee emp1 = new Employee("Adam", "Kowalski", 1);
        Employee emp2 = new Employee("Jan", "Kowalski", 2);
        Department dep1 = new Department("R&D", 1);
        Department dep2 = new Department("Sales",2);
        EmployeeService employeeService = new EmployeeService();
        DepartmentService departmentService = new DepartmentService();
        employeeService.add(emp1);
        employeeService.add(emp2);
        departmentService.add(dep1);
        departmentService.add(dep2);
    }
}
