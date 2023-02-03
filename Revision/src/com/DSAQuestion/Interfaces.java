package com.DSAQuestion;

import java.util.Scanner;

public class Interfaces {

    int reg_id;
    String course;

    Scanner sc = new Scanner(System.in);

    void getVal() {
        reg_id = sc.nextInt();
        course = sc.next();
    }
    void display(){
        System.out.println("Registration id is : "+ reg_id);
        System.out.println("The courde name is : "+ course);
    }

}

class NewInterface extends Interfaces {

}
