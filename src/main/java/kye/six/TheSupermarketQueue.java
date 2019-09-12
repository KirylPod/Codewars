package main.java.kye.six;

import java.util.Arrays;

public class TheSupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int[] time = new int[n];

        for (int i = 0; i < customers.length; i++) {

            time[0] = time[0] + customers[i];

            Arrays.sort(time);

        }

        return time[n - 1];
    }
}

