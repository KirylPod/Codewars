package main.java.kye.six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if ((strarr.length == 0) || (k > strarr.length) || (k <= 0)) {
            return "";
        } else {
            ArrayList<String> word = new ArrayList<>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < strarr.length - (k - 1); i++) {
                for (int j = 0; j < k; j++) {
                    sb.append(strarr[i + j]).toString();
                }
                word.add(sb.toString());
                sb.setLength(0);
            }

            return word.stream()
                    .filter(w -> w.equals(Collections.max(word, Comparator.comparing(String::length))))
                    .findFirst().get();
        }
    }
}
