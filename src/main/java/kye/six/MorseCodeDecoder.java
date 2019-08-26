package main.java.kye.six;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {

        String[] code = morseCode.split(" ");

        for (int i = 0; i < code.length; i++) {
            if (code[i].equals(".-")) {
                code[i] = "A";
            }
            if (code[i].equals("-...")) {
                code[i] = "B";
            }
            if (code[i].equals("-.-.")) {
                code[i] = "C";
            }
            if (code[i].equals("-..")) {
                code[i] = "D";
            }
            if (code[i].equals(".")) {
                code[i] = "E";
            }
            if (code[i].equals("..-.")) {
                code[i] = "F";
            }
            if (code[i].equals("--.")) {
                code[i] = "G";
            }
            if (code[i].equals("....")) {
                code[i] = "H";
            }
            if (code[i].equals("..")) {
                code[i] = "I";
            }
            if (code[i].equals(".---")) {
                code[i] = "J";
            }
            if (code[i].equals("-.-")) {
                code[i] = "K";
            }
            if (code[i].equals(".-..")) {
                code[i] = "L";
            }
            if (code[i].equals("--")) {
                code[i] = "M";
            }
            if (code[i].equals("-.")) {
                code[i] = "N";
            }
            if (code[i].equals("---")) {
                code[i] = "O";
            }
            if (code[i].equals(".--.")) {
                code[i] = "P";
            }
            if (code[i].equals("--.-")) {
                code[i] = "Q";
            }
            if (code[i].equals(".-.")) {
                code[i] = "R";
            }
            if (code[i].equals("...")) {
                code[i] = "S";
            }
            if (code[i].equals("-")) {
                code[i] = "T";
            }
            if (code[i].equals("..-")) {
                code[i] = "U";
            }
            if (code[i].equals("...-")) {
                code[i] = "V";
            }
            if (code[i].equals(".--")) {
                code[i] = "W";
            }
            if (code[i].equals("-..-")) {
                code[i] = "X";
            }
            if (code[i].equals("-.--")) {
                code[i] = "Y";
            }
            if (code[i].equals("--..")) {
                code[i] = "Z";
            }
            if (code[i].equals("")) {
                code[i] = " ";
            }
            if (code[i].equals("...---...")) {
                code[i] = "SOS";
            }
            if (code[i].equals(".-.-.-")) {
                code[i] = ".";
            }
            if (code[i].equals("--..--")) {
                code[i] = ",";
            }
            if (code[i].equals("..--..")) {
                code[i] = "?";
            }
            if (code[i].equals("-.-.--")) {
                code[i] = "!";
            }
            if (code[i].equals("...---")) {
                code[i] = ":";
            }

        }

        StringBuilder builder = new StringBuilder();
        for (String s : code) {
            builder.append(s);
        }
        String str = builder.toString();
        str = str.replaceAll("\\s+", " ");
        str = str.trim();
        System.out.println(str);
        return str;

    }

}
