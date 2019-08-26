package main.java.kye.eight;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {

    public static String reverseWords(String str) {

        String[] temp = str.split(" ");
        Collections.reverse(Arrays.asList(temp));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            sb.append(temp[i] + " ");
        }
        str = sb.toString().trim();

        return str;
    }
}
