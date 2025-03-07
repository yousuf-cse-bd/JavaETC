package JavaETC;

import java.util.ArrayList;
import java.util.Scanner;

//Factors(Limited) for GCD and Multiplications(INF) for LCM

public class FactorAndMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number here?: ");
        long number = Math.abs(scanner.nextLong());
        System.out.println(number+" factors: "+doFactors(number));
        System.out.println();
        System.out.println(number+" multiplications: "+doMultiplications(number));
        scanner.close();
    }

    public static ArrayList <Long> doFactors(final long NUMBER){
        ArrayList <Long> longFactors = new ArrayList<>();
        for(long factor = 1; factor <= NUMBER; factor++){
            if(NUMBER % factor == 0){
                longFactors.add(factor);
            }
        }
        return longFactors;
    }

    public static ArrayList <Long> doMultiplications(final long NUMBER){
        ArrayList <Long> longMultiplications = new ArrayList<>();

        for(long i = 1; i <= 10; i++){
            longMultiplications.add((NUMBER * i));
        }

        return longMultiplications;
    }
}
