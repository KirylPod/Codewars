package main.java.kye.seven;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class TwoToOne {

    public static String longest(String s1, String s2) {

        String str = s1 + s2;

        String[] array = str.split("");

        array = new HashSet<String>(Arrays.asList(array)).toArray(new String[0]);

        Collections.sort(Arrays.asList(array));

        StringBuilder builder = new StringBuilder();
        for (String s : array) {
            builder.append(s);
        }
        str = builder.toString();

        return str;
    }

}
