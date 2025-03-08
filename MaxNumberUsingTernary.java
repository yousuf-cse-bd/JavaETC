package JavaETC;

import java.util.Scanner;

/*****
 * Finding MAX number from three numbers using TERNARY operator
 * without logical operator
 */
public class MaxNumberUsingTernary {
    public static int maxNumber(final int a, final int b, final int c){
        return ( (a > b)? ((a > c)? a : c) : (b > c)? b : c  );
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a here: ");
        int a = scanner.nextInt();

        System.out.print("Enter b here: ");
        int b = scanner.nextInt();

        System.out.print("Enter c here: ");
        int c = scanner.nextInt();

        System.out.println("Max: "+maxNumber(a, b, c));

        scanner.close();
    }
}
