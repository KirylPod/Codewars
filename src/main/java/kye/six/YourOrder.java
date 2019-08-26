package main.java.kye.six;

public class YourOrder {

    public static String order(String words) {
        if (words.equals("")) {
            return "";
        } else {
            String[] str = words.split(" ");
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str.length; j++) {
                    if (str[j].contains(Integer.toString(i + 1))) {
                        stringBuilder.append(str[j] + " ");
                    }
                }
            }
            return stringBuilder.toString().trim();
        }
    }
}
