package main.java.kye.eight;

public class TransportationOnVacation {

    public static int rentalCarCost(int d) {

        int totalRent;

        if (d < 3) {
            totalRent = 40*d;
        } else if (d >= 3 & d < 7) {
            totalRent = 40*d - 20;
        } else {
            totalRent = 40*d - 50;

        }
            return totalRent;
        }
    }
