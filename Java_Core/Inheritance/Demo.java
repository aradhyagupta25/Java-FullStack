package Java_Core.Inheritance;

class A{
    A(){
        super();
        System.out.println("A");
    }
    A(int a){
        super();
        System.out.println("A int");
    }
}
class B  extends A{
    B(){
        super();    // calls default constructor of super class by default
        System.out.println("B");
    }
    B(int b){
        super(b);   // calls parameterized when called with arguments
        System.out.println("B int");
    }
}
// Every constructor has an invisible method called super() which calls the constructor of the super class.

public class Demo {
    public static void main(String[] args) {
        B b1 = new B(5);
    }
}
