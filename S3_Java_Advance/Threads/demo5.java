package S3_Java_Advance.Threads;
// if working with threads, amke sure to work with data which are immutable. since two threads working on same data simultaneously can cause inconsistencies.

// Thread Safe: only one thread can work with one method/data at a time.

class Counter{

    int count;  //instance variable -> by default value = 0.
    public synchronized void increment() {      // "synchronized" keyword will make sure that only one thread reaches the method and increment the count. resulting in consistent accurate answer.
        count++;
    }
}

public class demo5 {
    public static void main(String[] args) {

        Counter c =  new Counter();

        Runnable obj1 = () ->
        {
            for(int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for(int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();  //wait, but do NOT synchronize increment.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c.count);

    }
}

// what was happening without join(): the "main" was printing the value of count even b4 the Threads even started to increment it or finished the process. resulting in inconsistent result.
