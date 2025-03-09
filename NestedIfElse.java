package JavaETC;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("\tPositive");
        }
        else{
            if(number < 0){
                System.out.println("\tNegative");
            }
            else {
                System.out.println("\tNeutral");
            }
        }
        scanner.close();
    }
}
