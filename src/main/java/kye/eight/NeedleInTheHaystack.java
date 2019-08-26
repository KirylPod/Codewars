package main.java.kye.eight;

import java.util.Arrays;
import java.util.List;

public class NeedleInTheHaystack {

    public static String findNeedle(Object[] haystack) {

        List<Object> array = Arrays.asList(haystack);

        return "found the needle at position" + " " + array.indexOf("needle");

    }
}
