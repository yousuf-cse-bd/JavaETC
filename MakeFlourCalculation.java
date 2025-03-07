package JavaETC;

import java.util.Scanner;

//Calculate system loss to make flour from raw crops.

public class MakeFlourCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter System Loss Amount Per Mon?: ");
        double systemLoss = scanner.nextDouble();

        System.out.print("Total Weight of Raw Material?: ");
        final double RAW_MATERIAL = scanner.nextDouble();

        systemLoss = (systemLoss / 40.0) * RAW_MATERIAL;

        double givenFlour = RAW_MATERIAL - systemLoss;

        System.out.println("Before Flour: "+RAW_MATERIAL+((RAW_MATERIAL > 1)? " KGs":" KG"));
        System.out.println("After Flour: "+givenFlour+((givenFlour > 1)? " KGs":" KG"));
        System.out.println("System Loss: "+systemLoss+((systemLoss > 1)? " KGs":" KG"));

        scanner.close();
    }
}
