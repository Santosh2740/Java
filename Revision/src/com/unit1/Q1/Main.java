package com.unit1.Q1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students you want to enter : ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll Number : ");
            int roll = sc.nextInt();
            System.out.print("Enter Name : ");
            String name = sc.next();
            System.out.print("Enter Marks : ");
            int marks = sc.nextInt();
            System.out.println("                              ");
            students[i] = new Student(roll, name, marks);
            System.out.println("=================================");
            System.out.println("Student Details : " + (i+1) );
            System.out.println("Student Roll Number : " + roll);
            System.out.println("Student Name : " + name);
            System.out.println("Student Marks: " + marks);
            System.out.println("                          1");
        }
    }
}
