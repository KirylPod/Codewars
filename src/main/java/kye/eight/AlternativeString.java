package main.java.kye.eight;

public class AlternativeString {

    public static String toAlternativeString(String string) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            sb.append(Character.toString(Character.isUpperCase(string.charAt(i)) ?
                    Character.toLowerCase(string.charAt(i)) :
                    Character.toUpperCase(string.charAt(i))));
        }

        return sb.toString();
    }

}
