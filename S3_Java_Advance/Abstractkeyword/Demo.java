package S3_Java_Advance.Abstractkeyword;

abstract class Car{ // abstract class can have abstract as well as implemented methods.
    public abstract void drive();
    public void playMusic(){
        System.out.println("Music is playing");
    }
}

class Z4 extends Car{   // Z4 must override and define all the abstract method of the abstract class.
    public void drive(){
        System.out.println("Driving the Car");
    }
    public void playMusic(){
        System.out.println("Music");
    }
}

public class Demo {
    public static void main(String[] args) {
        //Car car = new Car();  cannot create object of an abstract class.

        Car obj = new Z4();
        obj.drive();
        obj.playMusic();

    }
}
