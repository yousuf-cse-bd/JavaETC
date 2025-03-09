package JavaETC;

//Best swapping technique using X-OR operator without third variable

public class SwapUsingXOR {
    public static void main(String[] args) {
        int number1 = Integer.MAX_VALUE;
        int number2 = Integer.MIN_VALUE;

        System.out.println("Number1: "+number1);
        System.out.println("Number2: "+number2);

        System.out.println("--------------------");

        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        System.out.println("Number1: "+number1);
        System.out.println("Number2: "+number2);
    }
}
