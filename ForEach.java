package JavaETC;

public class ForEach {
    public static void main(String[] args) {
        String[] strings = {"A", "b", "C", "d", "e"};
        int count = 0;

        for(var string : strings){
            if(!string.equals(string.toUpperCase())){
                count++;
            }
        }
        System.out.println(count);
    }
}
