package main.java.kye.six;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class TakeNumberAndSumItsDigitsRaisedToTheConsecutivePowers {

    public static List<Long> sumDigPow(long a, long b) {

        long[] numbers = LongStream.rangeClosed(a, b).toArray();
        long sum = 0;
        ArrayList<Long> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            char[] ch1 = Long.toString(numbers[i]).toCharArray();
            for (int j = 0; j < ch1.length; j++) {
                sum = sum + (long) Math.pow((double) (ch1[j] - 48), (double) j + 1);
            }

            if (numbers[i] == sum) {
                result.add(sum);
            }
            sum = 0;
        }

        return result;

    }
}
