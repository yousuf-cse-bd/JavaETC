package JavaETC;

import java.math.BigDecimal;

/// I = pnr

public class ProfitCalculation {
    public static void main(String[] args) {
        System.out.println(calculateSimpleProfit(5000, 1, 10));
        System.out.println(calculateCircularProfit(5000, 2, 10.50));
    }
    public static BigDecimal calculateSimpleProfit(double principalValue, double timeValueN, double rateOfInterest){
        rateOfInterest = rateOfInterest / 100;
        return BigDecimal.valueOf(principalValue).multiply(BigDecimal.valueOf(timeValueN)).multiply(BigDecimal.valueOf(rateOfInterest));
    }

    public static double calculateCircularProfit(double principalValue, double timeValueN, double rateOfInterest){
        rateOfInterest = rateOfInterest / 100;
        rateOfInterest += 1;
        double c = principalValue * Math.pow(rateOfInterest, timeValueN);
        return (c - principalValue);
    }
}
