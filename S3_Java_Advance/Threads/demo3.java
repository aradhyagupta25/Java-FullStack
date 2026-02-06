package S3_Java_Advance.Threads;

class E implements Runnable {
    public void run() {
        for(int i = 0 ; i < 5; i++){
            System.out.println("Running E");
        }
    }
}

class F  implements Runnable {
    public void run() {
        for(int i = 0 ; i < 5; i++){
            System.out.println("Running F");
        }
    }
}

public class demo3 {
    public static void main(String[] args) {

        Runnable obj1 = new E();    // we can create a ref of am interface and an object of a class.
        Runnable obj2 = new F();

        Thread t1 = new Thread(obj1);   // Runnable interface doesn't have a start() method so we have to make a Thread object and pass the Runnable ref in the Thread Constructor.
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
