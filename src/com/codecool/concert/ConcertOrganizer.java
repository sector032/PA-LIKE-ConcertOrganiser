package com.codecool.concert;

import com.codecool.concert.concerts.Concert;

import java.util.ArrayList;

public class ConcertOrganizer {
    private int totalIncome;
    private ArrayList<Concert> concertList;
    protected ArrayList<Band> mainBandList;
    protected ArrayList<Band> warmUpBandList;

    public ConcertOrganizer() {
        this.concertList = new ArrayList<>();
        this.mainBandList = new ArrayList<>();
        this.warmUpBandList = new ArrayList<>();
    }

    public void addToList(Concert concert) {
        concertList.add(concert);
    }

    public void addIncome(int income) {
        this.totalIncome += income;
    }

    public ArrayList<Concert> getConcertList() {
        return concertList;
    }

    public int getTotalIncome() {
        return totalIncome;
    }

}
