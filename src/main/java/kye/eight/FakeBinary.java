package main.java.kye.eight;

import java.util.Arrays;

public class FakeBinary {

    public static String fakeBin(String numberString) {

        String result = Arrays.toString(Arrays.stream(numberString.split("")).
                map(c -> Integer.parseInt(c) < 5 ?
                        c.replaceAll("\\d", "0") :
                        c.replaceAll("\\d", "1")).toArray());

        return result.replaceAll(", ", "").replaceAll("^\\[\\]$", "");
    }

}
