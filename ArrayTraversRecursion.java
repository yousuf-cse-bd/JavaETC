package JavaETC;

//Recursion but ASCENDING_ORDERED!

public class ArrayTraversRecursion {
    public static void arrayTraversing(final int[] array, final int i) {
        if(i > 0){
            //Reverse Order: 4, 3, 2, 1
            arrayTraversing(array, i - 1);
            //Ascending: 1, 2, 3, 4
        }
        else{
            //Only: 0
        }
        //Ascending: 0, 1, 2, 3, 4
        System.out.print(array[i]+" "); //Array's elements
    }
    public static void main(String[] args) {
        final int[] array = {1, 2, 3, 4, 5};
        arrayTraversing(array,array.length-1);
    }
}
