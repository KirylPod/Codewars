package main.java.kye.six;

public class TakeTenMinuteWalk {
    public static boolean isValid(char[] walk) {

        if (walk.length != 10) return false;

        int x = 0;
        int y = 0;
        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case ('n'):
                    y++;
                    break;
                case ('s'):
                    y--;
                    break;
                case ('w'):
                    x--;
                    break;
                case ('e'):
                    x++;
                    break;
            }
        }
        return (x == 0 & y == 0) ? true : false;
    }
}
