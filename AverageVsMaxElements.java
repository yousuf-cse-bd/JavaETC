package JavaETC;

import java.util.Random;
//Average the array elements
public class AverageVsMaxElements {
    public static int[] createRandomElements(final int size){
        Random random = new Random();
        int[] randomElements = new int[size];
        for(int i = 0; i < size; i++){
            randomElements[i] = Math.abs(random.nextInt() % 100);
        }
        return randomElements;
    }
    public static void main(String[] args) {
        int[] array = createRandomElements(30);
        showElements(array);
        System.out.println("Average: "+doAverageOfArray(array));

    }
    public static void showElements(int[] array){
        for(int x : array){
            System.out.print(x+"\t");
        }
        System.out.println();
    }
    public static double doAverageOfArray(int[] array){
        long sum = 0;
        for(int x : array){
            sum += x;
        }
        return (double) (sum / array.length);
    }
}
