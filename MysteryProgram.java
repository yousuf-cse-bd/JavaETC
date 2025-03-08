package JavaETC;

//An example for is-else statement.

public class MysteryProgram {
    public static void main(String[] args) {
        int x = 32;
        int y = 8;

        if(x > y){
            System.out.println(x - y);
        }
        else{
            if(x < y){
                System.out.println(y / x);
            }
            else{
                System.out.println(x + y);
            }
        }
    }
}
