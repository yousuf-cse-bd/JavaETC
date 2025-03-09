package JavaETC;

import java.util.ArrayList;

public class VerifyingAlgo {
    public static void main(String[] args) {
        ArrayList <Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(5);
        integerArrayList.add(3);
        integerArrayList.add(2);
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(7);

        ArrayList <Integer> integerArrayList1 = new ArrayList<>();
        for(var x : integerArrayList){
            if(x % 5 == 0){
                integerArrayList1.add(x);
            }
        }
        System.out.println(integerArrayList1);
    }
}
