package com.unit1.Q2;

public class Ticket {
    int ticketId;
    int price;
    static public int availableTickets;

    public int calculateTicketCost(int noOfTickets){
        if(noOfTickets <= availableTickets){
            availableTickets -= noOfTickets;
            int amount = noOfTickets*price;
            return amount;
        }else {
            return -1;
        }

    }

}
