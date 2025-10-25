package Java_Core.Inheritance;

class Parent{
    void show(){
        System.out.println("Inside Parent");
    }
    void config(){
        System.out.println("Inside Parent Config");
    }
}

class Child extends Parent{
    @Override
    void config() {
        System.out.println("Inside Child config");
    }
}

public class Overrideing {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
        c1.config();

        Parent p1 = new Parent();
        p1.show();
        p1.config();
    }
}
