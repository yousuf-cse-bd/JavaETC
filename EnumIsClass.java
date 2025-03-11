package JavaETC;

enum Laptop{
    MacBook(2000), DellXPS(2200), Surface(1500), ThinkPad(1800);
    private int price;
    Laptop(int price) { // enum constructor
        setPrice(price);
    }
    int getPrice(){
        return price;
    }
    void setPrice(int price){
        this.price = price;
    }
}

public class EnumIsClass {
    public static void main(String[] args) {
//        Laptop laptop = Laptop.MacBook;
//        System.out.println(laptop.getClass().getSuperclass());

        Laptop laptop1 = Laptop.MacBook;
        System.out.println(laptop1+" "+laptop1.getPrice());

        System.out.println("--------------------");

        Laptop laptop2 = Laptop.DellXPS;
        System.out.println(laptop2+" "+laptop2.getPrice());

        System.out.println("#############################");
        for (final Laptop laptop : Laptop.values()){
            System.out.println(laptop +" "+laptop.getPrice());
        }
    }
}
