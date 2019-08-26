package main.java.kye.six;

public class EqualSidesOfAnArray {

    private static int sumLeft;
    private static int sumRight;
    private static int e;

    public static int findEvenIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                rightSum(array, i);
            } else {
                leftSum(array, i);
                rightSum(array, i);
            }

            if (i == array.length) {
                leftSum(array, i);
            }

            if (sumLeft == sumRight) {
                e = i;
                break;
            } else {
                e = -1;
            }

        }
        return e;
    }

    private static int rightSum(int[] array, int i) {
        sumRight = 0;
        for (; i < array.length - 1; i++) {
            sumRight = sumRight + array[i + 1];
        }
        return sumRight;
    }

    private static int leftSum(int[] array, int i) {
        sumLeft = 0;
        for (int j = 0; j < i; j++) {
            sumLeft = sumLeft + array[j];
        }
        return sumLeft;
    }
}
