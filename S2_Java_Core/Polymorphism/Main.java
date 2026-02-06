package S2_Java_Core.Polymorphism;

class A{
    public void show(){
        System.out.println("Inside Show A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Inside Show B");
    }
}
class C extends A{
    public void show(){
        System.out.println("Inside Show C");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();    // Type can be of Parent class but object must be of the child class.
        obj.show();

        obj = new A();  // object changed to be of class A,
        obj.show();

        obj = new C();
        obj.show();
    }
}
