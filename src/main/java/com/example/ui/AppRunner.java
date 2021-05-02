package com.example.ui;

import java.util.Scanner;

public class AppRunner {

    private boolean isOn = true;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (isOn) {
            System.out.println("\nChoose data to display (type number)" +
                    "\n1 - Employees list with assigned department" +
                    "\n2 - Departments list with assigned employees" +
                    "\nx - to exit the app");
            String userInput = scanner.nextLine().trim();
            Printer printer = new Printer();
            switch (userInput) {
                case "1":
                    printer.printEmployees();
                    break;
                case "2":
                    printer.printDepartments();
                    break;
                case "x":
                    isOn = false;
                    break;
                default:
                    System.out.println("Please choose 1/2/x");
            }
        }
    }
}