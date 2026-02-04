package Java_Advance.Threads;

class A extends Thread {    // extending an ordinary class with "Thread" will make the class a Thread.
    public void run() {
        for(int i = 0 ; i < 10; i++ ){
            System.out.println("Hey");
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0 ; i < 10; i++ ){
            System.out.println("Hello");
        }
    }
}

public class demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.run();
        obj2.run();
    }
}
