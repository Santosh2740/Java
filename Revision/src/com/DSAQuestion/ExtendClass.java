package com.DSAQuestion;

public class ExtendClass {

    void display(){
        System.out.println("This is from main class");
    }
}
class NewExtendClass extends ExtendClass{
    public static void main(String[] args){
        NewExtendClass nee = new NewExtendClass();
        nee.display();
    }
}
