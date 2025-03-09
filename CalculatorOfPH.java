package JavaETC;

import java.util.Scanner;

public class CalculatorOfPH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String solutionType = "Unknown";
        double phLevel = scanner.nextDouble();

        if(phLevel == 7){
            solutionType = "Neutral";
        }
        else{
            if(phLevel < 7){
                solutionType = "Acidic";
            }
            else {
                solutionType = "Basic";
            }
        }
        System.out.println(solutionType);

        scanner.close();
    }

}
