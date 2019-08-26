package main.java.kye.eight;

public class ConvertNumberToReversedArrayOfDigits {

    public static int[] digitize(long n) {

        String str = Long.toString(n);

        String[] temp = str.split("");

        int[] array = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {

            array[i] = Integer.parseInt(temp[i]);

        }
        for (int i = 0; i < array.length / 2; i++) {

            int tmp = array[i];

            array[i] = array[array.length - i - 1];

            array[array.length - i - 1] = tmp;

        }

        return array;

    }
}
