package JavaETC;
//An application of GCD algorithm
public class FractionDivision {
    public static void main(String[] args) {
        long lob = 51;
        long divisor = 51;

        long gcd = doGCD(lob, divisor);
        lob = lob / gcd;
        divisor = divisor / gcd;
        System.out.println(lob);
        System.out.println("----");
        System.out.println(divisor);

        System.out.println("Div Result: "+(double) lob / divisor);
    }

    public static long doGCD(long number1, long number2){
        if( number1 == number2){
//            System.out.println("if");
            return number1;
        }
        while(number2 != 0){
            long temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        return number1;
    }
}
