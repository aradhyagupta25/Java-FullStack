package Java_Advance.Abstractkeyword;

abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Music is playing");
    }
}

class Z4 extends Car{   // Z4 must override and define the abstract method.
    public void drive(){
        System.out.println("Driving the Car");
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
