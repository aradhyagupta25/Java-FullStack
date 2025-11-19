package Java_Advance.Interfaces;

interface A{ // interface is not a clas like abstract class. and by default every method of interface is "public abstract".

    void show();
    void config();
}

class B implements A{   // defining methods of interface A in B otherwise B will become abstract class.
    public void show(){
        System.out.println("Inside Show");
    }
    public void config(){
        System.out.println("Inside Config");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
    }
}
