package main.java.kye.six;

public class PlayingWithDigits {

    public static long digPow(int n, int p) {
        double k = 0;
        double temp1 = 1;
        double temp2 = 0;
        String str = Integer.toString(n);
        String[] array = str.split("");

        int[] numb = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {

            numb[i] = Integer.parseInt(array[i]);

            for (int j = 1; j <= p + i; j++) {
                temp1 = temp1 * numb[i];
            }
            temp2 = temp2 + temp1;
            temp1 = 1;
        }

        k = temp2 / n;

        if (k >= 1 & k % 1 == 0) {
            System.out.println(k);
            return (long) k;
        } else {
            System.out.println("-1");
            return -1;

        }


    }

}
