package JavaETC;

import java.util.Scanner;

public class DecimalToBinaryFractionNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double decimal = Math.abs(scanner.nextDouble()); //Make sure positive

        int integralPart = (int) decimal;
        decimal = decimal - integralPart;

        //Decimal to Binary Integral Part
        String binary = Integer.toBinaryString(integralPart);
        //Decimal to Binary Fraction Part
        if(decimal > 0){
            binary += decimalToBinaryInFractionPart(decimal);
        }

        System.out.println("Binary representation: "+binary);
        scanner.close();
    }

    public static String decimalToBinaryInFractionPart(double decimal){
        String binary = ".";
        while (decimal > 0){
            double temp = decimal * 2;
            int bit = (int) temp;
            if(bit == 1){
                decimal = temp - bit;
                binary += "1";
            }
            else {
                decimal = temp;
                binary += "0";
            }
        }
        return binary;
    }
}
