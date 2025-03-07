package JavaETC;

import java.util.Scanner;

/// Is it possible to make a triangle or not?

public class IsRightTriangle {
    public static void main(String[] args) {
        int perpendicular;
        int base;
        int hypotenuse;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter perpendicular here: ");
        perpendicular = scanner.nextInt();

        System.out.print("Enter base here: ");
        base = scanner.nextInt();

        System.out.print("Enter hypotenuse here: ");
        hypotenuse = scanner.nextInt();

        System.out.println(isRightTriangle(perpendicular, base, hypotenuse));
        scanner.close();
    }

    public static boolean isRightTriangle(int perpendicular, int base, int hypotenuse){
        perpendicular *= perpendicular;
        base *= base;
        hypotenuse *= hypotenuse;

        return hypotenuse == (perpendicular + base);
    }
}
