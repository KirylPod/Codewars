package main.java.kye.eight;

public class ILoveYouLittleLotPassionately {
    public static String howMuchILoveYou(int nb_petals) {
        String[] flower = new String[]{"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        String[] temp = new String[nb_petals];
        for (int i = 0, j = 0; i < temp.length && j < flower.length; i++, j++) {
            temp[i] = flower[j];
            if (j == flower.length - 1) {
                j = -1;
            }
        }
        return temp[nb_petals - 1];
    }
}
