package main.java.kye.eight;

public class StringyStrings {

    public static String stringy(int size) {

        String[] str = new String[size];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            stringBuilder = i%2 == 0?stringBuilder.append("1"):stringBuilder.append("0");
        }

        return stringBuilder.toString();
    }
}