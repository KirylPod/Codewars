package main.java.kye.eight;

class RemoveStringSpaces {
    static String noSpace(final String x) {

        String str = x;

        str = str.replaceAll("\\s+", "");


        return str;
    }
}
