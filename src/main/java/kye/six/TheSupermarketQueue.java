package main.java.kye.six;

import java.util.ArrayList;

public class TheSupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int time = 0;

        Integer[] tills = new Integer[n];

        ArrayList<Integer> arrayCustomers = new ArrayList<>();

        for (int i = 0; i < customers.length; i++) {
            arrayCustomers.add(customers[i]);
        }

        for (int i = 0; i < arrayCustomers.size(); i++) {}

            while (!arrayCustomers.isEmpty()) {
                for (int j = 0; j < tills.length; j++) {
                    if (tills[j] == null || tills[j] == 0) {
                        tills[j] = arrayCustomers.get(j);
                    } else {
                        tills[j] = tills[j] - 1;
                        time++;
                    }
                }
                // блок уменьшения очереди без IndexOutOfBoundsException
                int countDel = tills.length;
                while (countDel != 0) {
                    int del = 0;
                    arrayCustomers.remove(del);
                    countDel--;
                }
//                i = 0;
            }


        return 0;
    }
}
