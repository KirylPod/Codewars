package main.java.kye.six;

public class StopGninnipMyDrow {

    public String spinWords(String sentence) {

        String[] strings = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {

            if (strings[i].length() >= 5) {
                StringBuilder temp = new StringBuilder();
                temp.append(strings[i]).reverse();
                strings[i] = temp.toString();
            }
            stringBuilder.append(strings[i] + " ");
        }
        return stringBuilder.toString().trim();
    }
}
