package JavaETC;

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius value here?: ");

        double  radius = Math.abs(scanner.nextFloat());
        System.out.println(calculateSphereVolume1(radius));
        System.out.println(calculateSphereVolume2(radius));

    }
//    public static double calculateSphereVolume1(double radius){
//        return (4.0/3 * 3.14159 * radius * radius * radius); //BeeCrowd Solution
//    }
    public static double calculateSphereVolume1(double radius){
        return (4.0/3 * 3.14159 * Math.pow(radius, 3));
    }
    public static double calculateSphereVolume2(double radius){
        final double PI = 3.14159;
        return (4.0/3 * PI * Math.pow(radius, 3));
    }
}
