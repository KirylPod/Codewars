package main.java.kye.four;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class HumanReadableDurationFormat {

    public static String formatDuration(int seconds) {

        String time = "";
        ArrayList<String> temp = new ArrayList<>();
        long year = TimeUnit.SECONDS.toDays(seconds) / 365;
        long day = TimeUnit.SECONDS.toDays(seconds) - (year * 365);
        long hour = TimeUnit.SECONDS.toHours(seconds) - (TimeUnit.SECONDS.toDays(seconds) * 24);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds) * 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) * 60);

        StringBuilder sb = new StringBuilder();

        if (seconds == 0) {
            return "now";
        }
        if (year > 0) {
            temp.add(year > 1 ? String.valueOf(year) + " years" : String.valueOf(year) + " year");
        }
        if (day > 0) {

            temp.add(day > 1 ? String.valueOf(day) + " days" : String.valueOf(day) + " day");

        }
        if (hour > 0) {

            temp.add(hour > 1 ? String.valueOf(hour) + " hours" : String.valueOf(hour) + " hour");

        }
        if (minute > 0) {

            temp.add(minute > 1 ? String.valueOf(minute) + " minutes" : String.valueOf(minute) + " minute");

        }
        if (second > 0) {

            temp.add(second > 1 ? String.valueOf(second) + " seconds" : String.valueOf(second) + " second");
        }


        for (int i = 0; i < temp.size(); i++) {

            if (temp.size() == 1) {
                sb.append(temp.get(i));
                time = sb.toString();
                break;
            } else if (temp.size() == 2) {
                sb.append(temp.get(i) + " and " + temp.get(i + 1));
                time = sb.toString();
                break;
            } else if (temp.size() > 2) {
                sb.append(temp.get(i));
                if(i < temp.size() - 2){
                    sb.append(", ");
                }else{
                    sb.append(" and ");

                }
                time = sb.toString();
                time = time.substring(0, time.length() - 4).trim();
            }
        }

        return time;

    }
}
