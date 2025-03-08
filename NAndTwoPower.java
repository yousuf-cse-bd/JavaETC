package JavaETC;

//N to the power N vs 2 to the power N

public class NAndTwoPower {
    public static void main(String[] args) {
        System.out.println("n^n\t2^n");
        System.out.println("-------------------------");
        for(int n = 0; n <= 20; n++){
            System.out.println(Math.pow(n, n) +"\t"+ Math.pow(2, n));
        }
    }
}
