package main.java.kye.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelpTheBookseller {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0) {
            return "";
        }
        String RESULT = "(%s : %s)";
        List<String> list = new ArrayList<>();
        Arrays.stream(lstOf1stLetter).forEach(letter -> {
            int quantity = Arrays.stream(lstOfArt).filter(art -> art.substring(0, 1).contains(letter))
                    .mapToInt(art -> Integer.valueOf(art.replaceAll("[A-Z]", "").trim())).sum();
            list.add(String.format(RESULT, letter, quantity));
            quantity = 0;
        });
        StringBuilder sb = new StringBuilder();
        list.forEach(l -> sb.append(l).append(" - "));
        return sb.delete(sb.length() - 3, sb.length()).toString();
    }

}
