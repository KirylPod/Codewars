package main.java.kye.six;

public class TheSupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int time = 0;

        Integer[] cashier = new Integer[n];

        for (int i = 0; i < customers.length; i++) {
            for (int j = 0; j < cashier.length; j++) {
                cashier[j]=customers[j];
            }

        }


        return 0;
    }
}
