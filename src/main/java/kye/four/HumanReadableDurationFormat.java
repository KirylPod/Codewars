package main.java.kye.four;

import java.util.concurrent.TimeUnit;

public class HumanReadableDurationFormat {

    public static String formatDuration(int seconds) {

        long year = TimeUnit.SECONDS.toDays(seconds) / 365;
        long day = TimeUnit.SECONDS.toDays(seconds) - (year * 365);
        long hour = TimeUnit.SECONDS.toHours(seconds) - (TimeUnit.SECONDS.toDays(seconds) * 24);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds) * 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) * 60);

        StringBuilder sb = new StringBuilder();

        sb = year > 1 ? sb.append(year + " years, ") : sb.append(year + " year, ");
        sb = day > 1 ? sb.append(day + " days, ") : sb.append(day + " day, ");
        sb = hour > 1 ? sb.append(hour + " hours, ") : sb.append(hour + " hour, ");
        sb = minute > 1 ? sb.append(minute + " minutes, ") : sb.append(minute + " minute, ");
        sb = second > 1 ? sb.append(second + " seconds, ") : sb.append(second + " second, ");



//        if (seconds >= 30879000 && year > 1) {
//            sb.append(year + " years ");
//            //            System.out.println(year + " years " + day + " days " + hours + " hours " + minute + " minutes " + second + " seconds");
//        } else if (seconds >= 30879000 && year == 1) {
//            sb.append(year + " year ");
//            System.out.println(year + " years " + day + " days " + hour + " hours " + minute + " minutes " + second + " seconds");
//        } else if (seconds >= 84600 && seconds < 30879000) {
//            System.out.println(seconds + " seconds equals to " + hour + " hours " + minute + " minutes " + second + " seconds");
//        } else if (seconds >= 3600 && seconds < 84600) {
//            System.out.println(seconds + " seconds equals to " + hour + " hours " + minute + " minutes " + second + " seconds");
//        } else if (seconds >= 60 && seconds < 3600 && second == 1) {
//            System.out.println(seconds + " seconds equals to " + minute + " minutes " + second + " second");
//        } else if (seconds >= 60 && seconds < 3600 && second > 1) {
//            System.out.println(seconds + " seconds equals to " + minute + " minutes " + second + " seconds");
//        } else if (seconds < 60) {
//            System.out.println(seconds + " seconds equals to seconds");
//        }


System.out.println(sb);

        return "";
    }


}
