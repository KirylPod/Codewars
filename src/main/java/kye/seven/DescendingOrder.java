package main.java.kye.seven;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        int result = 0;
        String str = String.valueOf(num);
        String[] array = str.split("");
        int[] numsArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numsArr[i] = Integer.parseInt(array[i]);

        }

        boolean isSort = false;
        int buf;
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < numsArr.length - 1; i++) {
                if (numsArr[i] < numsArr[i + 1]) {
                    isSort = false;
                    buf = numsArr[i];
                    numsArr[i] = numsArr[i + 1];
                    numsArr[i + 1] = buf;
                }
            }
        }

        for (int i = numsArr.length - 1, n = 0; i >= 0; --i, n++) {
            int pos = (int) Math.pow(10, i);
            result += numsArr[n] * pos;
        }


        return result;

    }
}
