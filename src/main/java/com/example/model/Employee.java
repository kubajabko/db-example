package com.example.model;

import javax.persistence.*;

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

    @Column
    private int departmentNumber;

    public Employee(String name, String surname, int departmentNumber) {
        this.name = name;
        this.surname = surname;
        this.departmentNumber = departmentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }
}
