package main.java.kye.five;

import java.util.Arrays;

public class Max {

    public static int sequence(int[] arr) {

        if (Arrays.stream(arr).allMatch(value -> value < 0) || arr.length == 0) {
            return 0;
        }
        int maxSum = Arrays.stream(arr).sum();
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            if (temp > maxSum) {
                maxSum = temp;
            }
            for (int j = i + 1; j < arr.length; j++) {
                temp = temp + arr[j];
                if (temp > maxSum) {
                    maxSum = temp;
                }
            }
            temp = 0;
        }

        return maxSum;
    }
}
