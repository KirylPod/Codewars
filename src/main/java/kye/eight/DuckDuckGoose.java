package main.java.kye.eight;

public class DuckDuckGoose {

    public static String duckDuckGoose(Player[] players, int goose) {

        String name = "";

        for (int i = 0; i < players.length; i++) {

            if (goose == 1) {

                name = String.valueOf(players[i]);

                break;
            }
            goose--;
            if (i == players.length - 1) {
                i = -1;
            }

        }
        System.out.println(name);
        return name;
    }

}

class Player {

    public Player(String name) {
    }

    private Player[] makePlayerArr(String[] names) {
        Player[] players = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i]);
        }
        return players;
    }

}