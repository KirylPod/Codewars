package main.java.kye.seven;

public class SquareEveryDigit {

    public int squareDigits(int n) {

        int number = 0;

        StringBuilder sb = new StringBuilder();

        String str = String.valueOf(n);

        String[] array = str.split("");

        int[] numb = new int[str.length()];

        for (int i = 0; i < array.length; i++) {

            numb[i] = Integer.parseInt(array[i]);

            numb[i] = numb[i] * numb[i];

            str = String.valueOf(numb[i]);

            sb = sb.append(str);

            str = String.valueOf(sb);

        }

        number = Integer.parseInt(str);

        System.out.println(number);

        return number;

    }
}
