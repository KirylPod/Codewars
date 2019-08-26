package main.java.kye.seven;

public class BeginnerSeriesSumOfNumbers {
    public int GetSum(int a, int b) {
        int sum = 0;


        if (a < b) {
            while (a <= b) {
                sum += a;
                a++;
            }
        } else {
            while (a >= b) {
                sum += b;
                b++;
            }

        }

        return sum;
    }
}
