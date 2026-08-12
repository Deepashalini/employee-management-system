package com.example.employee;

public class Main {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        System.out.println("Employee Management Application Started");
        System.out.println(employeeService.getEmployee());
    }
}
