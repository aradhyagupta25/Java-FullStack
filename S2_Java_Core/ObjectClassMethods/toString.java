package S2_Java_Core.ObjectClassMethods;

import java.util.Objects;

class laptop{
    String brand;
    String model;

    // Can override and define Object Class Methods.
    @Override
    public String toString() {      // generated
        return "laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    //    public boolean equals(laptop obj) {     //  two objs are only equals if they have same value and hashcode.
//        if( this.brand.equals(obj.brand) && this.model.equals(obj.model) ) {
//            return true;
//        }
//        return false;
//    }

    @Override   // using generate -> checks value and hashcode.
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        laptop laptop = (laptop) o;
        return Objects.equals(brand, laptop.brand) && Objects.equals(model, laptop.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}

public class toString {
    public static void main(String[] args) {
        laptop lap = new laptop();
        lap.brand = "ASUS";
        lap.model = "TUF";
        System.out.println(lap.toString()); // toString() automatically called everytime.

        laptop lap2 = new laptop();
        lap2.brand = "ASUS";
        lap2.model = "TUF";

        boolean res = lap.equals(lap2); // giving false when not defined in laptop class.
        System.out.println(res);
    }
}
