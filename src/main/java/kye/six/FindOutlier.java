package main.java.kye.six;

public class FindOutlier {

    static int find(int[] integers) {

        int c = 0;
        int k = 0;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even = integers[i];
                c++;
            }
            if (integers[i] % 2 != 0) {
                odd = integers[i];
                k++;
            }
        }
        return c < k ? even : odd;

    }
}
