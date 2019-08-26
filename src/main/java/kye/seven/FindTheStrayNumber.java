package main.java.kye.seven;

import java.util.Arrays;

class FindTheStrayNumber {
    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return (numbers[0] == numbers[1]) ? numbers[numbers.length - 1] : numbers[0];
    }
}
