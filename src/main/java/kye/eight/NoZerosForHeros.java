package main.java.kye.eight;

public class NoZerosForHeros {

    public static int noBoringZeros(int n) {

    return n>0?Integer.parseInt(String.valueOf(n).replaceAll("0*$", "")):0;

    }
}
