package main.java.kye.eight;

import java.util.Arrays;

public class FindMaximumAndMinimumValues {

    public static int min(int[] list) {

        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {

        return Arrays.stream(list).max().getAsInt();
    }
}
