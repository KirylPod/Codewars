package main.java.kye.seven;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        String[] array = dna.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {

                case "A":
                    array[i] = "T";
                    break;
                case "T":
                    array[i] = "A";
                    break;
                case "C":
                    array[i] = "G";
                    break;
                case "G":
                    array[i] = "C";
                    break;
                default:
                    break;
            }
            sb = sb.append(array[i]);
        }


        return sb.toString();

    }

}
