package main.java.kye.eight;

public class GrasshopperSummation {

    public static int summation(int n) {

        int x = 0;
        int sum = 0;

        while (x < n) {

            x = x + 1;
            sum = sum + x;

        }

        return sum;
    }
}
