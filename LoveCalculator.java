package JavaETC;

import java.text.DecimalFormat;
import java.util.Scanner;
//Fun project named love calculator
public class LoveCalculator {
    public static String doCalculateLove(String yourName, String partnerName){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        int sum1 = doSumChars(yourName);
        int sum2 = doSumChars(partnerName);
        return "\tYour affairs: #"+decimalFormat.format((sum1 + sum2)%100)+"%";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name here?: ");
        String yourName = scanner.nextLine();

        System.out.print("Enter your partner name?: ");
        String partnerName = scanner.nextLine();

        System.out.println(doCalculateLove(yourName, partnerName));
        scanner.close();
    }
    public static int doSumChars(String string){
        string = string.toUpperCase();
        final int LENGTH = string.length();
        int sum = 0;
        for(int i = 0; i < LENGTH; i++){
            sum += (string.codePointAt(i) % 100);
        }
        return sum;
    }
}
