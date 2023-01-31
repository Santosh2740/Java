package com.unit1.Q4;

import java.util.Scanner;

public class Main {

    public static Employee getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter Id : ");
        employee.setEmployeeId(sc.nextInt());
        System.out.print("Enter Name : ");
        employee.setEmployeeName(sc.next());
        System.out.print("Enter salary : ");
        employee.setSalary(sc.nextDouble());
        System.out.print("Enter the Pf percentage : ");
        double PfPercentage = sc.nextDouble();
        employee.calculateNetSalary((int)PfPercentage);
        return employee;

    }

    public static void main(String[] args) {
        Employee employee = getEmployeeDetails();
        System.out.println("Id  : " + employee.getEmployeeId());
        System.out.println("Name : " + employee.getEmployeeName());
        System.out.println("Salary : " + employee.getSalary());
        System.out.println("Net Salary : " + employee.getNetSalary());


    }
}
