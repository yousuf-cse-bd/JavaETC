package JavaETC;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetExample {
    public static void main(String[] args) {
        final int SIZE = 10;
        BitSet b1 = new BitSet(SIZE);
        BitSet b2 = new BitSet(SIZE);

        for(int i = 0; i < SIZE; i++){
            if(i % 2 == 0){
                b1.set(i);
            }
            if(i % 3 == 0){
                b2.set(i);
            }
        }

        System.out.println("Value of b1: "+b1);
        System.out.println("Value of b2: "+b2);

//        System.out.println("Cardinality of b1: "+b1.cardinality());
//        System.out.println("Cardinality of b2: "+b2.cardinality());

        Scanner scanner = new Scanner(System.in);
        String option = null;
        System.out.println("Enter [AND | OR | XOR] here?: ");
        option = scanner.next().toUpperCase();
        switch (option){
            case "AND" -> setOperationAND(b1, b2);
            case "OR" -> setOperationOR(b1, b2);
            case "XOR" -> setOperationXOR(b1, b2);
            default -> System.out.println("Invalid option");
        }

        scanner.close();
    }

    public static void setOperationAND(BitSet b1, BitSet b2){
        b1.and(b2);
        System.out.println("b1 AND b2: "+b1);
    }

    public static void setOperationOR(BitSet b1, BitSet b2){
        b1.or(b2);
        System.out.println("b1 OR b2: "+b1);
    }

    public static void setOperationXOR(BitSet b1, BitSet b2){
        b1.xor(b2);
        System.out.println("b1 XOR b2: "+b1);
    }
}
