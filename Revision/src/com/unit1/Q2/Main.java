package com.unit1.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no Bookings : ");
        int n = sc.nextInt();
        System.out.print("Enter the Available ticket : ");
        Ticket.availableTickets = sc.nextInt();
        Ticket[] tickets = new Ticket[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the ticketid: ");
            int ticketid = sc.nextInt();
            System.out.print("Enter the price: ");
            int price = sc.nextInt();
            System.out.print("Enter the no of tickets: ");
            int noOfTickets = sc.nextInt();
            tickets[i] = new Ticket();
            tickets[i].ticketId = ticketid;
            tickets[i].price = price;
            int totalAmount = tickets[i].calculateTicketCost(noOfTickets);
            System.out.println("==============================================");
            System.out.println("Ticket Id is :" + ticketid);
            System.out.println("Ticket Price is : " + price);
            System.out.println("Available tickets: " + Ticket.availableTickets);
            if (totalAmount == -1) {
                System.out.println("Tickets not available");
            } else {
                System.out.println("Total amount is :" + totalAmount);
            }
            System.out.println("                                  ");

        }

    }
}
