package Java_Advance.Interfaces;

// class - class -> extends.
// class - interface -> implement.
// interface - interface -> extends.

interface A{ // interface is not a clas like abstract class. and by default every method of interface is "public abstract".

    int year = 2027;    // interface variables are by default final and static.
    String city = "SF";
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{
    void stop(int y);   // can pass arguments.
}

class B implements A, Y{   // defining methods of interface A in B otherwise B will become abstract class. "implements" are only for methods.
    public void show(){
        System.out.println("Inside Show");
    }
    public void config(){
        System.out.println("Inside Config");
    }
    public void run(){  // can de defined as Y inherited X.
        System.out.println("Inside Run");
    }
    public void stop(int y){
        System.out.println("Inside Stop: " + y );
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new B();    // type A : object of B
        obj.show();
        obj.config();

        Y obj2 = new B();      // type Y : object of B
        obj2.run();
        obj2.stop(7);
        System.out.println(A.year);
        System.out.println(A.city);

        //A.year = 2026;
    }
}
