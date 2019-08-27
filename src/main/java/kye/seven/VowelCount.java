package main.java.kye.seven;

public class VowelCount {

    public static int getCount(String str) {
        int vowelsCount = 0;
        String[] letters = str.split("");

        for (int i = 0; i < letters.length; i++) {

            if (letters[i].equals("a")) {
                vowelsCount++;
            }
            if (letters[i].equals("e")) {
                vowelsCount++;
            }
            if (letters[i].equals("i")) {
                vowelsCount++;
            }
            if (letters[i].equals("o")) {
                vowelsCount++;
            }
            if (letters[i].equals("u")) {
                vowelsCount++;
            }
        }


        return vowelsCount;
    }
}
