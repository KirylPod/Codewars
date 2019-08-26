package main.java.kye.seven;

public class JadenCasingStrings {

    public String toJadenCase(String phrase) {

        if (phrase != null && !phrase.equals("")) {
            String[] array = phrase.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; i++) {

                array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);

                sb.append(array[i] + " ");

            }
            phrase = sb.toString().trim();

            return phrase;

        } else {

            return null;
        }

    }
}
