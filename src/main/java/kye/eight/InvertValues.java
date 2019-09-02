package main.java.kye.eight;

import java.util.Arrays;

public class InvertValues {

    public static int[] invert(int[] array) {

        Arrays.stream(array).map(num -> num = num * -1).toArray();

        return null;
    }
}
