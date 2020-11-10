package com.codecool.concert.concerts;

import java.util.Random;

public abstract class Concert {
    protected int capacity;
    protected double length;
    protected int ticketPrice;
    protected int beerPrice;
    protected boolean canceled;

    public Concert() {
        this.ticketPrice = generateTicketPrice();
    }

    public int generateTicketPrice() {
        Random random = new Random();
        return random.nextInt(15000 - 12000) + 12000;
    }

    public int ifItsNotFull() {
        Random random = new Random();
        return random.nextInt(81 - 69) + 69;
    }

    public boolean isFull() {
        Random random = new Random();
        int num = random.nextInt(80) + 1;
        return num >= 20;
    }

    public int generatePeoples() {
        if (isFull()) {
            return this.capacity;
        } else {
            return (this.capacity * ifItsNotFull()) / 100;
        }
    }

    public double moneyFromBeer() {
        return ((this.length / 0.5) * this.beerPrice) * generatePeoples();
    }

    public int calculateIncome() {
        if (!this.canceled) {
            return (int) (moneyFromBeer() + incomeFromTickets());
        } else {
            return 0;
        }
    }

    public int incomeFromTickets() {
        return ((this.ticketPrice * generatePeoples()) * 40) / 100;
    }

    public void itsCanceled() {
        if (this.canceled) {
            System.out.println("Sorry, the concert is canceled because of the rain!");
            this.capacity = 0;
        }
    }

    @Override
    public String toString() {
        return "Concert{" +
                "capacity=" + capacity +
                ", length=" + length +
                ", ticketPrice=" + ticketPrice +
                ", beerPrice=" + beerPrice +
                ", numberOfPeople = " + generatePeoples() +
                ", canceled = " + canceled +
                ", income = " + calculateIncome() +
                '}';
    }
}
