package main.java.kye.seven;

public class RegexValidatePINCode {

    public static boolean validatePin(String pin) {

        if (pin.matches("[0-9]+") && pin.length() == 4 | pin.length() == 6) {

            return true;
        }
        return false;
    }

}
