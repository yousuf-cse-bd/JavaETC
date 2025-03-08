package JavaETC;

/// 9 independent digit and 3 & 6 interactive each other

public class DoDoubleOfDigit {
    public static void main(String[] args) {
        long number = 9; //Same for 6
        for(int i = 0; i < 15; i++){
            System.out.println(number +" --> "+doSumDigit(number));
            number <<= 1;
        }
    }
    public static long doSumDigit(long number){
        if(number > 9){
            long sum  = 0;
            while(number != 0){
                long digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return doSumDigit(sum);
        }
        return number;
    }
}
