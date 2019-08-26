package main.java.kye.six;

public class Multiples {

    public int solution(int number) {
        int sum3 = 0, sum5 = 0;
        int three = 0;
        int five = 0;

        while (three + 3 < number) {
            three = three + 3;
            sum3 = sum3 + three;
        }
        while (five + 5 < number) {
            five = five + 5;
            if (five % 3 != 0) {
                sum5 = sum5 + five;
            }
        }
        System.out.println(sum3 + sum5);
        return sum3 + sum5;

    }

}
