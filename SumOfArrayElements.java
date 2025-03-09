package JavaETC;

public class SumOfArrayElements {
    public static int sumOfArrayElements(final int[] array, final int i){
        int sum = array[i];
        if(i > 0){
            sum += sumOfArrayElements(array, i - 1);
        }
        return sum;
    }
    public static void main(String[] args) {
        final int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: "+sumOfArrayElements(array, 4));
    }
}
