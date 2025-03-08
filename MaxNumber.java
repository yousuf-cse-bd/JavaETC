package JavaETC;

import java.util.Scanner;

/// Find the max number from three numbers (just if-else).

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a here: ");
        int a = scanner.nextInt();

        System.out.print("Enter b here: ");
        int b = scanner.nextInt();

        System.out.print("Enter c here: ");
        int c = scanner.nextInt();

        System.out.println(maxNumber(a, b, c));

        scanner.close();
    }

    public static String maxNumber(long a, long b, long c){
        if(a > b){
            if(a > c){
                return ("Max, a: "+a);
            }
            else{
                return ("Max, c: "+c);
            }
        }
        else{
            if(b > c){
                return ("Max, b: "+b);
            }
            else{
                return("Max, c: "+c);
            }
        }
    }
}
