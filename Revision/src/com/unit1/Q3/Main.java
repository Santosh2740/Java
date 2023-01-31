package com.unit1.Q3;

import java.util.Scanner;

public class Main {
    public static Laptop getLaptop(String laptopPurpose) {
        Laptop laptop = new Laptop();
        CPU cpu = new CPU();
        GraphicCard GraphCard = new GraphicCard();
        if (laptopPurpose.equals("gaming")) {
            laptop.color = "Black";
            laptop.companyName = "Radeon";
            laptop.name = "Acer";
            laptop.purpose = "gaming";

            cpu.manufacturer = "Radeon";
            cpu.processor = "Ryzen 9 5800H";
            cpu.clockSpeed = 3200.0;

            GraphCard.manufacturer = "Radeon";
            GraphCard.series = "RTX 3050 Ti";
            GraphCard.capacity = "16GB";
        } else if (laptopPurpose.equals("business")) {
            laptop.color = "Rose Gold";
            laptop.companyName = "HP";
            laptop.name = "Aero 13";
            laptop.purpose = "business";

            cpu.manufacturer = "Intel";
            cpu.processor = "i5 10210U";
            cpu.clockSpeed = 2800.0;

            GraphCard.manufacturer = "Intel";
            GraphCard.series = "Iris Xe";
            GraphCard.capacity = "Integrated";
        } else if (laptopPurpose.equals("entertainment")) {
            laptop.color = "Bussy Blue";
            laptop.companyName = "Lenovo";
            laptop.name = "IdeaPad Slim3";
            laptop.purpose = "entertainment";

            cpu.manufacturer = "Intel";
            cpu.processor = "i3 10210U";
            cpu.clockSpeed = 1800.0;

            GraphCard.manufacturer = "Intel";
            GraphCard.series = "Intel";
            GraphCard.capacity = "Integrated";
        } else {
            return null;
        }
        laptop.cpu = cpu;
        laptop.graphicCard = GraphCard;
        return laptop;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter laptop purpose (gaming/business): ");
        String laptopPurpose = sc.nextLine();

        Laptop gamingLaptop = getLaptop(laptopPurpose);
        if (gamingLaptop != null) {
            gamingLaptop.displayDetails();
        } else {
            System.out.println("Invalid laptop purpose.");
        }

        System.out.print("Enter laptop purpose (gaming/business): ");
        laptopPurpose = sc.nextLine();
        Laptop businessLaptop = getLaptop(laptopPurpose);
        if (businessLaptop != null) {
            businessLaptop.displayDetails();
        } else {
            System.out.println("Invalid laptop purpose.");
        }
        System.out.print("Enter laptop purpose (gaming/business/entertainment): ");
        laptopPurpose = sc.nextLine();
//        Laptop businessLaptop = getLaptop(laptopPurpose);
        Laptop Elaptop=getLaptop(laptopPurpose);
        if (Elaptop != null) {
            Elaptop.displayDetails();
        } else {
            System.out.println("Invalid laptop purpose.");
        }
        sc.close();

    }
}
