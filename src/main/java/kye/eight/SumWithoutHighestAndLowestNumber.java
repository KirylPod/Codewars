package main.java.kye.eight;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {

    public static int sum(int[] numbers) {

        int sum = 0;

        if (numbers == null) {

            return sum;

        }

        Arrays.sort(numbers);

        for (int i = 1; i < numbers.length - 1; i++) {

            sum = sum + numbers[i];

        }

        if (numbers.length == 0 | numbers.length == 1) {
            sum = 0;
        }

        return sum;

    }

}
