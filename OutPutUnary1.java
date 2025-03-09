package JavaETC;

public class OutPutUnary1 {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;
        System.out.printf("%d %d %d %d %d\n", i++, i--, ++i, --i, i);
        System.out.println(j++ +" "+j-- + " " + ++j + " " + --j +" "+ j);
    }
}
