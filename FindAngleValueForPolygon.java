package JavaETC;

import java.text.DecimalFormat;
import java.util.Scanner;
//Find internal & external angles value from number of arms.

public class FindAngleValueForPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter arms number here:? ");
        long armNumber = Math.abs(scanner.nextInt());

        DecimalFormat decimalFormat = new DecimalFormat("##.00");

        System.out.println("Internal Angle Value: "+decimalFormat.format(findAngleValueInternally(armNumber))+" in Degree.");
        System.out.println("External Angle Value: "+decimalFormat.format(findAngleValueExternally(armNumber))+" in Degree.");

        scanner.close();
    }

    public static double findAngleValueInternally(long armNumbers){
//        double internalAngelValues = (double) ((armNumber - 2) * 180 ) / armNumber;
        double internalAngelValues = (double) (360 / armNumbers);
        internalAngelValues = 180 - internalAngelValues;
        return internalAngelValues;
    }

    public static double findAngleValueExternally(long armNumbers){
        //Complete the code here
        return (double) (360 / armNumbers);
    }
}
