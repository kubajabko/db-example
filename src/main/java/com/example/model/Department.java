package com.example.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    public Department (String name, int number) {
        this.name = name;
    }

    @OneToMany(mappedBy = "department")
    Set<Employee> employees = new HashSet<>();

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

}
