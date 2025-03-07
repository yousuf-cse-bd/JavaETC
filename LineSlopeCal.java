package JavaETC;

import java.util.Scanner;

/// Calculate slop form two points.

public class LineSlopeCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value x1?: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter value y1?: ");
        int y1 = scanner.nextInt();

        System.out.println("--------------------------");
        System.out.print("Enter value x2?: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter value y2?: ");
        int y2 = scanner.nextInt();

        try{
            double slopeResult = (double) (y2 - y1)/(x2 - x1);
            slopeResult = Math.abs(slopeResult);
            System.out.println(slopeResult);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.toString());
        }


        scanner.close();
    }
}
