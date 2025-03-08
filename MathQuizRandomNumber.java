package JavaETC;

import java.util.Random;

//Generate a random number simply.

public class MathQuizRandomNumber {

    public static void main(String[] args) {

        final int LIMIT = 10;
        Random random = new Random();
        int number1 = Math.abs(random.nextInt()) % LIMIT; //0 ---> 9
        System.out.println(number1);
    }
}
