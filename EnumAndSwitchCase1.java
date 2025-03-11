package JavaETC;

import java.util.Scanner;

enum Status{
    Running, Failed, Pending, Success
}

public class EnumAndSwitchCase1 {
    public static void main(String[] args) throws IllegalArgumentException{

        Status[] statusList = Status.values();

        for(final var status : statusList){
            System.out.println(status+": "+status.ordinal());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter status here: ");
        Status status = Status.valueOf(scanner.next());

        switch (status){
            case Pending -> System.out.println("Please Wait!");
            case Running -> System.out.println("Continue...");
            case Failed -> System.out.println("OK, Try Again.");
            case Success -> System.out.println("OK! Done.");
            default -> System.out.println("\nWrong Status.");
        }

        scanner.close();
    }
}
