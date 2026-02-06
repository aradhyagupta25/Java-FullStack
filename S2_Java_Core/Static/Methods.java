package S2_Java_Core.Static;

class Phone{
    String brand;
    int price;
    static String type = "SmartPhone";

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }

    static void show(Mobile Obj){   // can only use static variable inside a static method. because we need objects for different values of non-static variables.
        System.out.println(Obj.brand + " : " + Obj.price + " : " + Obj.type); // we pass the object as arguments and use non-static variables inside static variables.
    }
}

public class Methods {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 100;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 200;

        Phone.show(m1);
        Phone.show(m2); // using class name to call static method and passing object as an argument.

    }
}
