package main.java.kye.six;

import java.util.concurrent.TimeUnit;

public class TortoiseRacing {

    public static int[] race(int v1, int v2, int g) {
        int[] times = new int[3];
        if (v1 < v2) {
            double time = (double) g / ((double) v2 - (double) v1) * 3600;
            long hour = TimeUnit.SECONDS.toHours((long) time);
            long minute = TimeUnit.SECONDS.toMinutes((long) time) - (TimeUnit.SECONDS.toHours((long) time) * 60);
            long second = TimeUnit.SECONDS.toSeconds((long) time) - (TimeUnit.SECONDS.toMinutes((long) time) * 60);
            times[0] = (int) hour;
            times[1] = (int) minute;
            times[2] = (int) second;
        } else {
            return null;
        }

        return times;
    }
}
