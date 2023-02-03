package com.DSAQuestion;

import java.util.Scanner;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class SwapTwoNumbers {

    public void swap(int a , int b){
        int temp = a;
         a = b;
         b = temp;
//        return(swap);
        System.out.println("Modified value is " + a +" "+ temp);
    }

    public static void main(String[] args){
        SwapTwoNumbers swap = new SwapTwoNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Original value is " + a +" "+ b);
        swap.swap(a,b);
//        System.out.println("Modofied value is "+swap.swap(a,b));
    }
}
