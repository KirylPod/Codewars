package main.java.kye.seven;

public class Isograms {
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();

        char[] chAr = str.toCharArray();

        for (int i = 0; i < chAr.length; i++) {

            char ch1 = chAr[i];

            for (int j = i + 1; j < chAr.length; j++) {

                if (ch1 == chAr[j]) {

                    return false;
                }

            }
        }

        return true;

    }
}
