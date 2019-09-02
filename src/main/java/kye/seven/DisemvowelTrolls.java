package main.java.kye.seven;

public class DisemvowelTrolls {

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
