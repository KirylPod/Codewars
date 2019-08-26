package main.java.kye.seven;

public class PrinterErrors {

    public static String printerError(String s) {
        return (s.length() - s.replaceAll("[n-z]", "").length()) + "/" + s.length();
    }
}
