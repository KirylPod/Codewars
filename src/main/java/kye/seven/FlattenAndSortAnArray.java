package main.java.kye.seven;

import java.util.ArrayList;
import java.util.Collections;

public class FlattenAndSortAnArray {

    public static int[] flattenAndSort(int[][] array) {

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                nums.add(array[i][j]);
            }
        }
        Collections.sort(nums);
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }

        return arr;
    }
}
