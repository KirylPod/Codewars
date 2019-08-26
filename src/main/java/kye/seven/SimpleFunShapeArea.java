package main.java.kye.seven;

public class SimpleFunShapeArea {

    public static int shapeArea(int n) {

        int i = 0;
        int result = 1;

        while (i <= n - 1) {
            result = 4 * i + result;
            i++;
        }

        return result;

    }

}
