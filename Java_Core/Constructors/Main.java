package Java_Core.Constructors;

class Car{
    String brand;
    String model;
    int price;

    Car(){      // never returns anything
        this.brand = "Car";
        this.model = "Car";
        this.price = 200;
        System.out.println("Inside Constructor");
        System.out.println(this.brand + " : " + this.model + " : " + this.price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        //System.out.println(car.brand + " " +  car.model + " " + car.price);
        car.brand = "BMW";
        car.model = "3 Series";
        car.price = 50_000;
        System.out.println(car.brand + " " +  car.model + " " + car.price);

    }
}
