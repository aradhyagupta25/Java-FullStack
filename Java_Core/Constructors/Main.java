package Java_Core.Constructors;

class Car{
    String brand;
    String model;
    int price;

    Car(){
        this.brand = "Car";
        this.model = "Car";
        this.price = 200;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
    }
}
