package main.java.kye.six;

public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        double priceMonth = savingperMonth;

        double monthCash = 0;
        int[] result = new int[2];

        if (priceOld >= priceNew) {
            result[0] = 0;
            result[1] = (int) (priceOld + monthCash - priceNew);
            return result;
        }
        for (int month = 1; priceOld + monthCash <= priceNew; month++) {
            if (month % 2 == 0) {
                percentLossByMonth = percentLossByMonth + 0.5;
            }
            priceOld = priceOld - (priceOld * (percentLossByMonth / 100));
            priceNew = priceNew - (priceNew * (percentLossByMonth / 100));
            monthCash = monthCash + priceMonth;
            result[0] = month;
            result[1] = (int) Math.round(priceOld + monthCash - priceNew);
        }
        return result;
    }
}
