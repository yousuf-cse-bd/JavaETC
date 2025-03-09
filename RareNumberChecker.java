package JavaETC;

import java.util.Scanner;

/// 65, 621770, 281089082
public class RareNumberChecker {
    public static boolean isRareNumber(long number) {
        long reverseNumber = doReverseNumber(number);
        long sum = number + reverseNumber;
        long sub = number - reverseNumber;

        double root1 = Math.sqrt(sum);
        double root2 = Math.sqrt(sub);

        return (Math.ceil(root1) == Math.floor(root1) && Math.ceil(root2) == Math.floor(root2));
    }
    public static long doReverseNumber(long number){
        long reverseNumber = 0L;
        while(number != 0){
            long digit = number % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            number /= 10;
        }
        return reverseNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number here?: ");
        long number = Math.abs(scanner.nextLong());
        if(isRareNumber(number)){
            System.out.println("That number is RARE number.");
        }
        else {
            System.out.println("That number is NOT rare number.");
        }
        scanner.close();
    }
}
