package main.java.kye.five;

import java.util.Arrays;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {

        String N = "NORTH";
        String S = "SOUTH";
        String W = "WEST";
        String E = "EAST";
        String temp = Arrays.toString(arr).replaceAll(",", "").replaceAll("\\[", "").replaceAll("\\]", "");
        String[] r = new String[1];

        while ((temp.contains(N + " " + S)) | (temp.contains(S + " " + N)) | (temp.contains(W + " " + E)) | (temp.contains(E + " " + W))) {
            temp = temp.replaceAll(N + " " + S, "").trim();
            temp = temp.replaceAll(S + " " + N, "").trim();
            temp = temp.replaceAll(W + " " + E, "").trim();
            temp = temp.replaceAll(E + " " + W, "").trim();
            temp = temp.replaceAll("\\s+", " ").trim();
        }

        if (temp.length() == 0) return new String[0];

        if (temp.length() <= 5 && temp.length() > 0) {
            r[0] = temp;
            return r;
        } else {
            arr = temp.split(" ");
            return arr;
        }

    }
}
