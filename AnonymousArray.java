package JavaETC;

public class AnonymousArray {

    public static void arrayPrint(int[] array){
        for(final int x: array){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        arrayPrint(new int[] {1, 2, 3, 4}); //Anonymous array in argument
    }
}
