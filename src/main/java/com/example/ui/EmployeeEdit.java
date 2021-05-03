package com.example.ui;

import com.example.model.Department;
import com.example.model.Employee;
import com.example.persistence.DepartmentService;
import com.example.persistence.EmployeeService;

import java.util.HashMap;

public class EmployeeEdit {

    EmployeeService employeeService = new EmployeeService();
    DepartmentService departmentService = new DepartmentService();
    HashMap<Long, Employee> employeeHashMap = new HashMap<>();
    HashMap<Long, Department> departmentHashMap = new HashMap<>();

    public void addEmployee(String name, String surname, String departmentName) {
        if (!name.isEmpty() && !surname.isEmpty()) {
            Employee emp = new Employee(name, surname);
            if (findDepartmentByName(departmentName) != null) {
                emp.setDepartment(findDepartmentByName(departmentName));
                findDepartmentByName(departmentName).addEmployee(emp);
                employeeService.add(emp);
                System.out.println("\nEmployee added");
            } else {
                System.out.println("\nDepartment not found");
            }
        } else {
            System.out.println("\nEither name or surname was empty");
        }
    }

    public void removeEmployee(String name, String surname) {
        if (findEmployeeByNameAndSurname(name, surname) != null) {
            employeeService.delete(findEmployeeByNameAndSurname(name, surname));
            System.out.println("\nEmployee removed");
        } else {
            System.out.println("\nEmployee not found");
        }
    }

    public void changeDepartment(String name, String surname, String newDepartmentName) {
        if (findEmployeeByNameAndSurname(name, surname) != null && findDepartmentByName(newDepartmentName) != null) {
            findEmployeeByNameAndSurname(name, surname).setDepartment(findDepartmentByName(newDepartmentName));
            employeeService.update(findEmployeeByNameAndSurname(name, surname));
            System.out.println("\nEmployee department changed");
        } else {
            System.out.println("\nEither employee or department not found");
        }
    }

    private Employee findEmployeeByNameAndSurname(String name, String surname) {
        long foundId = 0;
        for (Employee employee : employeeService.getAll()) {
            if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
                foundId = employee.getId();
            }
        }
        for (Employee employee : employeeService.getAll()) {
            Long employeeIdInLong = employee.getId();
            employeeHashMap.put(employeeIdInLong, employee);
        }
        Long foundEmployeeIdInLong = foundId;
        if (foundId == 0) {
            return null;
        } else {
            return employeeHashMap.get(foundEmployeeIdInLong);
        }
    }

    private Department findDepartmentByName(String depName) {
        long foundId = 0;
        for (Department department : departmentService.getAll()) {
            if (department.getName().equals(depName)) {
                foundId = department.getId();
            }
        }
        for (Department department : departmentService.getAll()) {
            Long employeeIdInLong = department.getId();
            departmentHashMap.put(employeeIdInLong, department);
        }
        Long foundDepartmentIdInLong = foundId;
        if (foundId == 0) {
            return null;
        } else {
            return departmentHashMap.get(foundDepartmentIdInLong);
        }
    }

}
