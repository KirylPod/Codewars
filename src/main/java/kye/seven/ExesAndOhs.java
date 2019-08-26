package main.java.kye.seven;

public class ExesAndOhs {

    public static boolean getXO(String str) {

        str = str.toLowerCase();
        int countX = 0;
        int countO = 0;

        String[] array = str.split("");

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("x")) {
                countX++;
            }
            if (array[i].equals("o")) {
                countO++;
            }
        }

        if (countO == countX) {

            return true;

        } else {

            return false;
        }


    }

}
