package main.java.kye.eight;

public class AreYouPlayingBanjo {

    public static String areYouPlayingBanjo(String name) {

        return name.toUpperCase().startsWith("R") ? name + " plays banjo" : name + " does not play banjo";
    }

}
