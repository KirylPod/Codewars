package main.java.kye.seven;

import java.util.ArrayList;

class NumberOfPeopleInTheBus {

    public static int countPassengers(ArrayList<int[]> stops) {
        int into = 0, off = 0;
        int pas = 0;

        for (int i = 0; i < stops.size(); i++) {

            into = stops.get(i)[0];
            off = stops.get(i)[1];
            pas = pas + into - off;

        }

        return pas;

    }
}
