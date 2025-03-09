package JavaETC;

public class NearSquaredNumber {
    public static void main(String[] args) {
        int number = 50;
        for(int i = number; i>=2; i--){
            int squared = i * i;
            if(squared <= number) {
                System.out.println(number+" root squared number: "+i+" and its squared "+squared);
                break;
            }
        }
    }
}
