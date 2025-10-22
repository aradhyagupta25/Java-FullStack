package Java_Core.Static;

class Mobile{
    String brand;
    int price;
    String type;

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class Demo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        m1.type = "Smart";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1000;
        m2.type = "Smart";

        m1.show();
        m2.show();
    }
}
