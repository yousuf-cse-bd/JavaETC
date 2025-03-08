package JavaETC;

///Do digit half and its sum the digits but result missing 3, 6, 9 digits!

public class DoDigitHalf {
    public static void main(String[] args) {
        double number = 1;
        long longNumber;
        String string;
        for(int i = 1; i < 10; i++){
            number /= 2;
            string = String.valueOf(number);
            string = string.substring(2);
            longNumber = Long.parseLong(string);
            System.out.println(longNumber +" -> "+ doSumDigitWised(longNumber));
        }
    }

    public static long doSumDigitWised(long number){
        if(number > 9){
            long sum = 0;
            while(number != 0){
                long digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return doSumDigitWised(sum);
        }
        return number;
    }
}
