package JavaETC;

import java.util.ArrayList;

public class DifferenceMaxMin {
    public static ArrayList <Integer> createIntList(){
        ArrayList <Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(10);
        integerArrayList.add(3);
        integerArrayList.add(5);
        integerArrayList.add(6);

        return integerArrayList;
    }
    public static void main(String[] args) {
        ArrayList <Integer> integerArrayList = createIntList();
        System.out.println("Difference: "+doDifferenceMaxMin(getMin(integerArrayList), getMax(integerArrayList)));
    }

    public static int getMax(ArrayList <Integer> arrayList){
        int max = Integer.MIN_VALUE;
        for(var x : arrayList){
            max = Math.max(max, x);
        }
        return max;
    }
    public static int getMin(ArrayList <Integer> arrayList){
        int min = Integer.MAX_VALUE;
        for(var x : arrayList){
            min = Integer.min(min, x);
        }
        return min;
    }
    public static int doDifferenceMaxMin(int min, int max){
        return Math.abs(max - min);
    }
}
