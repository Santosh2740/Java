package com.unit1.Q3;

class CPU {
    String manufacturer;
    String processor;
    double clockSpeed;
}

class GraphicCard {
    String manufacturer;
    String capacity;
    String series;

}

public class Laptop {
    String color;
    String companyName;
    String name;
    String purpose;
    CPU cpu;
    GraphicCard graphicCard;

    void displayDetails() {
        System.out.println("===================================");
        System.out.println("Laptop Company Name" + companyName);
        System.out.println("Laptop Name "+ name);
        System.out.println("Laptop Color " + color);
        System.out.println("Laptop Purpose "+ purpose);
        System.out.println("Graphic card's Manufacturing" + graphicCard.manufacturer);
        System.out.println("Graphic card's Capacity" + graphicCard.capacity);
        System.out.println("Graphic card's Series "+ graphicCard.series);
        System.out.println("Cpu's Manufacture" + cpu.manufacturer);
        System.out.println("Cpu's processor" +cpu.processor);
        System.out.println("Cpu's clockSpeed"+ cpu.clockSpeed);

    }

}



