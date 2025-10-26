package Java_Core;

class laptop{
    String brand;
    String model;
}

public class toString {
    public static void main(String[] args) {
        laptop lap = new laptop();
        lap.brand = "ASUS";
        lap.model = "TUF";
        System.out.println(lap);
    }
}
