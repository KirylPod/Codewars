package main.java.kye.eight;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {

        String repeated = new String();

        if (repeat > 0) {
            repeated = new String(new char[repeat]).replace("\0", string);
        } else {
            repeated = "";
        }
        return repeated;
    }
}
