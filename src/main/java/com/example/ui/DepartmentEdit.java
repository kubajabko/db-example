package com.example.ui;

import com.example.model.Department;
import com.example.persistence.DepartmentService;

import java.util.HashMap;

public class DepartmentEdit {

    DepartmentService departmentService = new DepartmentService();
    HashMap<Long, Department> departmentHashMap = new HashMap<>();

    public void addDepartment(String name) {
        if (!name.isEmpty()) {
            Department dep = new Department(name);
            departmentService.add(dep);
            System.out.println("\nDepartment added");
        } else {
            System.out.println("\nName was empty");
        }
    }

    public void removeDepartment(String name) {
        if (findDepartmentByName(name) != null) {
            departmentService.delete(findDepartmentByName(name));
            System.out.println("\nDepartment removed");
        } else {
            System.out.println("\nDepartment not found");
        }
    }

    public void renameDepartment(String oldDepartmentName, String newDepartmentName) {
        if (findDepartmentByName(oldDepartmentName) != null && !newDepartmentName.isEmpty()) {
            findDepartmentByName(oldDepartmentName).setName(newDepartmentName);
            departmentService.update(findDepartmentByName(newDepartmentName));
            System.out.println("\nDepartment renamed");
        } else {
            System.out.println("\nDepartment not found or new name field was empty");
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
