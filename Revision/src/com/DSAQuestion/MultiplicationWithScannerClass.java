package com.DSAQuestion;
import java.util.Scanner;

public class MultiplicationWithScannerClass {

    public int calMulti(int a , int b){
        return a*b;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MultiplicationWithScannerClass multi = new MultiplicationWithScannerClass();
        System.out.print("Enter the first value : ");
        int n = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();

        System.out.println( "The Multiplication value is : "+ multi.calMulti(n,b));
    }
}
