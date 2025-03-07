package JavaETC;

import java.util.ArrayList;
import java.util.Collections;

/// To make the greatest and smallest number from certain digits

public class MakeGreatestSmallestNumbers {
    public static void main(String[] args) {

        ArrayList <Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(0);
        integerArrayList.add(2);
        integerArrayList.add(9);
        integerArrayList.add(8);
        integerArrayList.add(6);
        integerArrayList.add(4);

        Collections.sort(integerArrayList.reversed());

        System.out.print("Greater number: ");
        for(var x : integerArrayList){
            System.out.print(x);
        }
        final int SIZE = integerArrayList.size();
        System.out.println(" in "+SIZE+" digits.");

        Collections.sort(integerArrayList);
        System.out.print("Smaller number: ");

        if(integerArrayList.getFirst() == 0){
            Integer temp = integerArrayList.getFirst();
            integerArrayList.set(0, integerArrayList.get(1));
            integerArrayList.set(1, temp);
        }

        for(var x : integerArrayList){
            System.out.print(x);
        }
        System.out.println(" in "+SIZE+" digits.");
    }
}
