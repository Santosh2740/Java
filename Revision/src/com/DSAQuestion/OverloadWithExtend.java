package com.DSAQuestion;

public class OverloadWithExtend {

    void overload(int a, int b){
        System.out.println("This is from First "+a+b);
    }
    void overload(int a, int b, int c){
        System.out.println("This is from first"+ a+b+c);
    }
}
 class NextOverload extends OverloadWithExtend{
    void overload(int a, int b){
        System.out.println("This is from second "+a+b);
    }

    public static void main(String[] args){
        OverloadWithExtend  odd = new NextOverload();
        odd.overload(2,3,5);
    }
}
