package JavaETC;

public class Perimeter {
    public static double perimeter1(double length, double width){
        return 2*(length + width);
    }
    public static void main(String[] args) {
        final double length = 93;
        final double width = 13;
        System.out.println(perimeter1(length, width));
        System.out.println(perimeter2(length, width));
        System.out.println(perimeter3(length, width));
    }
    public static double perimeter2(double length, double width){
        return 2*length + 2*width;
    }
    public static double perimeter3(double length, double width){
        return (2*length) + (2*width);
    }
}
