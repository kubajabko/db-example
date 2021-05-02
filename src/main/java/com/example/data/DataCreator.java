package com.example.data;

import com.example.model.Department;
import com.example.model.Employee;
import com.example.persistence.DepartmentService;
import com.example.persistence.EmployeeService;

import java.util.ArrayList;

public class DataCreator {

    public void createDataAndFillDB() {
        ArrayList<Employee> employeesList = new ArrayList<>();
        ArrayList<Department> departmentList = new ArrayList<>();
        Department dep1 = new Department("R&D", 1);
        departmentList.add(dep1);
        Department dep2 = new Department("Sales", 2);
        departmentList.add(dep2);
        Department dep3 = new Department("Production", 3);
        departmentList.add(dep3);
        Department dep4 = new Department("Buyers", 4);
        departmentList.add(dep4);
        Employee emp1 = new Employee("Adam", "Kowalski", 1);
        employeesList.add(emp1);
        Employee emp2 = new Employee("Jan", "Nowak", 1);
        employeesList.add(emp2);
        Employee emp3 = new Employee("Piotr", "Wójcik", 2);
        employeesList.add(emp3);
        Employee emp4 = new Employee("Paweł", "Kamiński", 1);
        employeesList.add(emp4);
        Employee emp5 = new Employee("Michal", "Lewandowski", 3);
        employeesList.add(emp5);
        Employee emp6 = new Employee("Wojciech", "Zieliński", 2);
        employeesList.add(emp6);
        Employee emp7 = new Employee("Agnieszka", "Szymańska", 1);
        employeesList.add(emp7);
        Employee emp8 = new Employee("Kamil", "Woźniak", 2);
        employeesList.add(emp8);
        Employee emp9 = new Employee("Karolina", "Dąbrowska", 4);
        employeesList.add(emp9);
        Employee emp10 = new Employee("Michał", "Jankowski", 4);
        employeesList.add(emp10);
        Employee emp11 = new Employee("Tomasz", "Wojciechowski", 3);
        employeesList.add(emp11);
        Employee emp12 = new Employee("Damian", "Mazur", 3);
        employeesList.add(emp12);
        Employee emp13 = new Employee("Patryk", "Krawczyk", 3);
        employeesList.add(emp13);

        EmployeeService employeeService = new EmployeeService();
        DepartmentService departmentService = new DepartmentService();

        for (Department dep : departmentList) {
            departmentService.add(dep);
        }
        for (Employee emp : employeesList) {
            employeeService.add(emp);
        }
    }
}
