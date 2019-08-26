package main.java.kye.six;

public class Dubstep {
    public static String SongDecoder(String song) {
        return song.replaceAll("WUB", " ").replaceAll("\\s+", " ").trim();
    }
}
