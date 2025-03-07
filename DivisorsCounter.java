package JavaETC;

import java.util.Scanner;

public class DivisorsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number here: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        System.out.println("Total distinct divisors of "+number+" are: "+divisorCount(number));
        
        scanner.close();
    }

    public static int divisorCount(final int n){
        int divisors = 0;
        final double N = Math.sqrt(n);

        for(int i = 1; i <= N; i++){
            if(n % i == 0){
                if(n / i == i) {// If divisors are equal, count only one
                    divisors++;
                }
                else{ //Otherwise count both
                    divisors += 2;
                }
            }
        }
        return divisors;
    }
}
