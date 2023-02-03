package com.DSAQuestion;

public class UseFinalKeyword {
    final int regNo;

    public UseFinalKeyword(int regNo) {
        this.regNo = regNo;
    }
    void display(){
        System.out.println("Enter Registration no : " +regNo);
    }
    public static void main(String[] agrs){
        UseFinalKeyword key = new UseFinalKeyword(10);
        key.display();
    }
}
