package main.java.kye.eight;

public class CountOddNumbersBelow {

    public static int oddCount(int n){

        int count = 0;
        int odd = 1;

        while (odd < n){
            odd = odd+2;
            count++;
        }

        return count;
    }

}
