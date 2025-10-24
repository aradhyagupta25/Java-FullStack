package Java_Core.Constructors;

class Car{
    String brand;
    String model;
    int price;

    Car(String brand, String model, int price){      // never returns anything
        this.brand = brand;
        this.model = model;
        this.price = price;
        System.out.println("Inside Constructor");
        System.out.println(this.brand + " : " + this.model + " : " + this.price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("FERRARI", "458 ITALIA", 1000000);
        System.out.println(car.brand + " " +  car.model + " " + car.price);
        car.brand = "BMW";
        car.model = "3 Series";
        car.price = 50_000;
        System.out.println(car.brand + " " +  car.model + " " + car.price);

    }
    // camel casing
    // class and interface: Calc, Runnable
    // variable and methods: marks, show();
    // constants: PIE, BRAND

    // showMyMarks()
    // MyData

}
