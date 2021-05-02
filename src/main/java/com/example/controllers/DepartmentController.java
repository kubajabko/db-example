package com.example.controllers;

import com.example.model.Department;
import com.example.persistence.DepartmentService;

public class DepartmentController {

    DepartmentService departmentService;

    public void addDepartmentToDB(Department department) {
        departmentService.add(department);
    }
}
