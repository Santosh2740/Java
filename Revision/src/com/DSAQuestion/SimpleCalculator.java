package com.DSAQuestion;

public class SimpleCalculator {

    public void Calculator(int a, int b){
        int sum = a+b;
        int sub = a-b;
        double div = a/b;
        int multi = a*b;

        System.out.println("Sum is " + sum);
        System.out.println("subtraction is "+ sub);
        System.out.println("Division is "+ div);
        System.out.println("Multiplication is" + multi);
    }
    public static void main(String[] args){
        SimpleCalculator cal = new SimpleCalculator();
        cal.Calculator(10,20);

    }
}

