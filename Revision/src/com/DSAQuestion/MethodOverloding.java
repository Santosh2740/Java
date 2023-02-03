package com.DSAQuestion;

public class MethodOverloding {

    void overloading(int a, int b){
        System.out.println(a*b);
    }
    void  overloading(int a , int b, int c){
        System.out.println(a*b*c);

    }
    public static void main(String[] args){
        MethodOverloding over = new MethodOverloding();
        over.overloading(2,5);
        over.overloading(2,4,6);

    }
}
