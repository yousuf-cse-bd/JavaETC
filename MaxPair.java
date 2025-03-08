package JavaETC;

import java.util.ArrayList;

//Find max pair from an array.

public class MaxPair {
    public static void main(String[] args) {
        ArrayList <Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(5);
        integerArrayList.add(4);
        integerArrayList.add(-4);
        integerArrayList.add(3);
        integerArrayList.add(2);

        final int LENGTH = integerArrayList.size();
        int sum = 0;
        int maxSum = 0;
        for(int i = 1; i < LENGTH; i++){
            sum = integerArrayList.get(i-1) + integerArrayList.get(i);
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
