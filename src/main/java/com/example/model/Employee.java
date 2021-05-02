package com.example.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @ManyToOne
    @JoinTable(name = "department_employee", joinColumns = {
            @JoinColumn(name = "employee_id")}, inverseJoinColumns = {@JoinColumn(name = "department_id")})
    Department department;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
