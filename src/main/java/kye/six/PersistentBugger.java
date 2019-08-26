package main.java.kye.six;

import java.util.ArrayList;
import java.util.Collections;

class PersistentBugger {
    public static int persistence(long n) {
        long pr = 1;
        int m = 0;
        while (n >= 10) {
            for (int i = 0; i < numberToArray(n).size(); i++) {
                pr = pr * numberToArray(n).get(i);
            }
            n = pr;
            pr = 1;
            m++;
        }
        System.out.println(m);
        return m;
    }

    private static ArrayList<Long> numberToArray(long n) {
        ArrayList<Long> array = new ArrayList<Long>();
        do {
            array.add(n % 10);
            n /= 10;
        } while (n > 0);
        Collections.reverse(array);
        return array;
    }
}
