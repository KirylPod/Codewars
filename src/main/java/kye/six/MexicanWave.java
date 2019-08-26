package main.java.kye.six;

import java.util.ArrayList;
import java.util.Collections;

public class MexicanWave {
    public static String[] wave(String str) {

        String[] temp = str.split("");

        ArrayList<String> wave = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (temp[i].equals(" ")) {
                wave.add("0");
            } else {
                temp[i] = temp[i].toUpperCase();
                wave.add(str.substring(0, i) + temp[i] + str.substring(i + 1, str.length()));
            }
        }
        wave.removeAll(Collections.singleton("0"));
        String[] result = new String[wave.size()];
        for (int i = 0; i < wave.size(); i++) {

            result[i] = wave.get(i);
            System.out.println(result[i]);

        }
        System.out.println(result.length);
        return result;
    }
}
    
