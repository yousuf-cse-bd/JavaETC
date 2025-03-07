package JavaETC;

import java.util.Scanner;

public class AdultTest {
    public static boolean isAdult1(int age){
        return age >= 18;
    }
    public static boolean isAdult2(int age){
        return !(age < 18);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age here?: ");
        int age = scanner.nextInt();
        System.out.println(isAdult1(age));
        System.out.println(isAdult2(age));
    }
}
