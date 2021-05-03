package com.example.ui;

import java.util.Scanner;

public class AppRunner {

    private boolean isOn = true;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (isOn) {
            while (isOn) {
                System.out.println("\nMenu" +
                        "\n1 - Display employees/departments" +
                        "\n2 - Employee edit menu" +
                        "\n3 - Department edit menu" +
                        "\nx - to exit the app");
                String userMenuInput = scanner.nextLine().trim();
                switch (userMenuInput) {
                    case "1":
                        System.out.println("\nChoose data to display (type number)" +
                                "\n1 - Employees list with assigned department" +
                                "\n2 - Departments list with assigned employees" +
                                "\nb - to go back to previous menu" +
                                "\nx - to exit the app");
                        String userDisplayInput = scanner.nextLine().trim();
                        Printer printer = new Printer();
                        switch (userDisplayInput) {
                            case "1":
                                printer.printEmployees();
                                break;
                            case "2":
                                printer.printDepartments();
                                break;
                            case "b":
                                break;
                            case "x":
                                isOn = false;
                                break;
                            default:
                                System.out.println("Please choose 1/2/b/x");
                        }
                        break;
                    case "2":
                        System.out.println("\nChoose employee option" +
                                "\n1 - Add employee" +
                                "\n2 - Remove employee" +
                                "\n3 - Assign different department for employee" +
                                "\nb - to go back to previous menu" +
                                "\nx - to exit the app");
                        String userEmployeeInput = scanner.nextLine().trim();
                        EmployeeEdit employeeEdit = new EmployeeEdit();
                        switch (userEmployeeInput) {
                            case "1":
                                System.out.println("Enter employee name:");
                                String addName = scanner.nextLine();
                                System.out.println("Enter employee surname");
                                String addSurname = scanner.nextLine();
                                System.out.println("Enter department name - must be existing");
                                String addDepartmentName = scanner.nextLine();
                                employeeEdit.addEmployee(addName, addSurname, addDepartmentName);
                                break;
                            case "2":
                                System.out.println("Enter employee name:");
                                String removeName = scanner.nextLine();
                                System.out.println("Enter employee surname");
                                String removeSurname = scanner.nextLine();
                                employeeEdit.removeEmployee(removeName, removeSurname);
                                break;
                            case "3":
                                System.out.println("Enter employee name:");
                                String cdName = scanner.nextLine();
                                System.out.println("Enter employee surname");
                                String cdSurname = scanner.nextLine();
                                System.out.println("Enter department name - must be existing");
                                String cdDepartmentName = scanner.nextLine();
                                employeeEdit.changeDepartment(cdName, cdSurname, cdDepartmentName);
                                break;
                            case "b":
                                break;
                            case "x":
                                isOn = false;
                                break;
                            default:
                                System.out.println("Please choose 1/2/3/b/x");
                        }
                        break;
                    case "3":
                        System.out.println("\nChoose department option" +
                                "\n1 - Add department" +
                                "\n2 - Remove department" +
                                "\n3 - Change department name" +
                                "\nb - to go back to previous menu" +
                                "\nx - to exit the app");
                        String userDepartmentInput = scanner.nextLine().trim();
                        DepartmentEdit departmentEdit = new DepartmentEdit();
                        switch (userDepartmentInput) {
                            case "1":
                                System.out.println("Enter department name:");
                                String addName = scanner.nextLine();
                                departmentEdit.addDepartment(addName);
                                break;
                            case "2":
                                System.out.println("Enter department name - must be existing:");
                                String removeName = scanner.nextLine();
                                departmentEdit.removeDepartment(removeName);
                                break;
                            case "3":
                                System.out.println("Enter department name - must be existing");
                                String oldDepartmentName = scanner.nextLine();
                                System.out.println("Enter new department name:");
                                String newDepartmentName = scanner.nextLine();
                                departmentEdit.renameDepartment(oldDepartmentName, newDepartmentName);
                                break;
                            case "b":
                                break;
                            case "x":
                                isOn = false;
                                break;
                            default:
                                System.out.println("Please choose 1/2/3/b/x");
                        }
                        break;
                    case "x":
                        isOn = false;
                        break;
                    default:
                        System.out.println("Please choose 1/2/3/x");
                }
            }
        }
    }
}