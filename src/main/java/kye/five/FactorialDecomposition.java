package main.java.kye.five;

public class FactorialDecomposition {

    public static String decomp(int n) {

        int a = 2;
        int number = 1;

        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact = fact * i;

        }


        while (a<Math.pow(fact, 1.0 / a )){
            Math.pow(a, number);
            number++;
        }

        return "";
    }
}
