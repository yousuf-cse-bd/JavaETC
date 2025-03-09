package JavaETC;

import java.util.Scanner;

/// Cover full floor what's the number of tiles?
public class NumberOfTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width value here?: ");
        double width = Math.abs(scanner.nextDouble());
        System.out.print("Enter length value here?: ");
        double length = Math.abs(scanner.nextDouble());

        long longWidth = (long)Math.floor(width);
        long longLength = (long)Math.floor(length);

        long tilesArmSize = doGCD(longWidth, longLength);
        double areOfFloor = calculateArea(width, length);
        long areaOfTiles = calculateArea(tilesArmSize, tilesArmSize);

        System.out.println("The number of tiles: "+countNumberOfTiles(areOfFloor, areaOfTiles));
        System.out.println("*The remainder of area: "+remainderNumberOfTiles(areOfFloor, areaOfTiles));
        System.out.println("Area of floor: "+areOfFloor+" Unit^2");
        System.out.println("Area of tiles: "+areaOfTiles+" Unit^2");

        scanner.close();
    }

    //Applying: Method overloading
    public static double calculateArea(double width, double length){
        return (width * length);
    }
    public static long calculateArea(long width, long length){
        return (width * length);
    }
    public static long doGCD(long number1, long number2){
        while(number2 != 0){
            long temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        return number1;
    }
    public static long countNumberOfTiles(double areaOfFloor, long areaOfTiles){
        return (long) (areaOfFloor / areaOfTiles);
    }
    public static long remainderNumberOfTiles(double areaOfFloor, long areaOfTiles) {
        return (long) (areaOfFloor % areaOfTiles);
    }
}
