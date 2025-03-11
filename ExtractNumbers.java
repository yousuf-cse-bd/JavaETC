package JavaETC;

import java.util.*;
import java.util.regex.*;
//String to numbers

public class ExtractNumbers {
    public static List<Integer> extractNumbers(String string) {
        List<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        return numbers;
    }

    public static void main(String[] args) {
        String input = "(12, 14; 54, 32 55)";
        List<Integer> numbers = extractNumbers(input);
        System.out.println(numbers);
    }
}