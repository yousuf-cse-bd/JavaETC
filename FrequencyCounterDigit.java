package JavaETC;

//This algorithm used a compound array

public class FrequencyCounterDigit {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 9, 9};

        int[] frequencyCount = new int[10];

        for (int number : numbers) {
            for (int j = 0; j < 10; j++) {
                if (number == j) {
                    frequencyCount[number]++;
                }
            }
        }

        for(int i = 0 ; i < frequencyCount.length; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int j : frequencyCount) {
            System.out.print(j + " ");
        }
    }
}
