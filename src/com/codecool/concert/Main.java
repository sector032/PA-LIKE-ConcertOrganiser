package com.codecool.concert;

import com.codecool.concert.concerts.Concert;
import com.codecool.concert.concerts.Festival;
import com.codecool.concert.concerts.Indoor;
import com.codecool.concert.concerts.Outdoor;

public class Main {
    public static void main(String[] args) {
        ConcertOrganizer organizer = new ConcertOrganizer();
        Indoor i = new Indoor();
        Outdoor o = new Outdoor();
        Festival f = new Festival();
//        Indoor i2 = new Indoor();
//        Outdoor o2 = new Outdoor();
//        Outdoor o3 = new Outdoor();
//        Festival f2 = new Festival();

        organizer.addToList(i);
        organizer.addToList(o);
        organizer.addToList(f);
//        organizer.addToList(i2);
//        organizer.addToList(o2);
//        organizer.addToList(o3);
//        organizer.addToList(f2);


        for (Concert concert : organizer.getConcertList()) {
            concert.itsCanceled();
            organizer.addIncome(concert.calculateIncome());

        }
        System.out.println(organizer.getTotalIncome() + " HUF");
    }
}
