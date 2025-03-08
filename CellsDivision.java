package JavaETC;

//Do number twice but missing 3, 6, 9 digits
public class CellsDivision {
    public static void main(String[] args) {
        long longNumber = 1;
       for(int i = 1; i <= 15; i++){
           System.out.println(longNumber +" -> "+doSumDigitWised(longNumber));
           longNumber <<= 1;
       }
    }
    public static long doSumDigitWised(long number){
        if(number > 9){
            long sum = 0;
            while(number != 0) {
                long digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return doSumDigitWised(sum);
        }
        return number;
    }
}
