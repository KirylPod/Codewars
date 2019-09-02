package main.java.kye.eight;

import java.util.Arrays;

public class SentenceSmash {

    public static String smash(String... words) {

        return Arrays.toString(words).replaceAll("[\\[\\],]", "");
    }

}
