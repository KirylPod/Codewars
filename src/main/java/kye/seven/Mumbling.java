package main.java.kye.seven;

public class Mumbling {

    public static String accum(String s) {
        String temp = new String();

        StringBuilder str = new StringBuilder();

        char[] chArray = s.toCharArray();

        for (int i = 0; i < chArray.length; i++) {

            chArray[i] = Character.toLowerCase(chArray[i]);

            temp = String.valueOf(chArray[i]);

            temp = new String(new char[i + 1]).replace("\0", temp);

            temp = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();

            str = str.append(temp + "-");

        }
        s = str.toString();

        s = str.substring(0, s.length() - 1);

        System.out.println(s);

        return s;

    }

}
