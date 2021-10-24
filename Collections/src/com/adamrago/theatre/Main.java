package com.adamrago.theatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Theatre theatre = new Theatre("Gárdonyi Géza Színház", 4, 5);
        theatre.getSeats();
        if(theatre.reserveSeat("A03")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken.");
        }*/

        Theatre theatre = new Theatre("Gárdonyi Géza Színház", 4, 5);

        if(theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else{
            System.out.println("Seat already reserved.");
        }

       List<Theatre.Seat> seats = new ArrayList<>(theatre.getSeats());
        printList(seats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

        /*Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);
        Collections.shuffle(theatre.seats);
        System.out.println("Printing theatre.seat shuffled");
        printList(theatre.seats);

        sortList(theatre.seats);
        System.out.println("Printing theatre.seat sorted");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());*/


    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " - " + seat.getPrice() + "$");
        }
        System.out.println();
        System.out.println("================================================================================");
    }

    //Bubble sort
   /* public static void sortList(List<? extends Theatre.Seat> list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i , j);
                }
            }
        }
    }*/


}
