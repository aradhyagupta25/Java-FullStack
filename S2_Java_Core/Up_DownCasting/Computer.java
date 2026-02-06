package S2_Java_Core.Up_DownCasting;

class Laptop{
    public void show1(){
        System.out.println(" Inside Laptop");
    }
}
class PC extends Laptop{
    public void show2(){
        System.out.println(" Inside PC");
    }
}

public class Computer {
    public static void main(String[] args) {

        Laptop lap =  new PC(); // up casting to parent class type.
        lap.show1();
        //lap.show2(); Can't use method of PC when the type of ref var is Laptop.

        PC pc = (PC) lap;
        pc.show2(); // Down Casting to child class type.
    }
}
