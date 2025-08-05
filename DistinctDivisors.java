package JavaETC;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integral number here?: ");
        long longNumber = Math.abs(scanner.nextLong());
        System.out.println("Divisors: "+ findDistinctDivisors(longNumber));
        System.out.println("Counter: "+countDistinctDivisors(longNumber));
        scanner.close();
    }

    public static ArrayList <Long> findDistinctDivisors(long longNumber){
        ArrayList <Long> longArrayList = new ArrayList<>();

        for(long i = 1; i <= longNumber; i++){
            if(longNumber % i == 0){
                longArrayList.add(i);
            }
        }
        return longArrayList;
    }
    public static long countDistinctDivisors(long longNumber){
        long divisorsCount = 0;
        for(long i = 1; (i * i) <= longNumber; i++){
            if(longNumber % i == 0){
                if(longNumber / i == i){
                    divisorsCount++;
                }
                else{
                    divisorsCount += 2;
                }
            }
        }
        return divisorsCount;
    }
}
