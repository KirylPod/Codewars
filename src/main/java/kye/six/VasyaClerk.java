package main.java.kye.six;

public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {

        int cash25 = 0;
        int cash50 = 0;
        int cash100 = 0;

        String result = "";

        for (int i = 0; i < peopleInLine.length; i++) {

            switch (peopleInLine[i]) {

                case 25: {
                    cash25 += 1;
                    result = "YES";
                }
                break;

                case 50: {
                    cash50 += 1;
                    if (cash25 >= 1) {
                        cash25 -= 1;
                        result = "YES";
                    } else {
                        result = "NO";
                    }
                }
                break;

                case 100: {
                    cash100 += 1;
                    if (cash50 >= 1 && cash25 >= 1) {

                        cash50 -= 1;
                        cash25 -= 1;
                        result = "YES";
                    } else if (cash25 >= 3) {
                        cash25 -= 3;
                        result = "YES";

                    } else {
                        result = "NO";
                    }
                }
                break;
            }

            if (result.equals("NO")) {
                break;
            }
        }

        return result;
    }
}
