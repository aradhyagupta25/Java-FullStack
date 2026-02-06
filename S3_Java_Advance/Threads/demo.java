package S3_Java_Advance.Threads;

// threads are light-weight and run for short period of time, executing multiple small tasks or programs.

// threads share the resources with other threads as well.

class A extends Thread {    // extending an ordinary class with "Thread" will make the class a Thread.
    public void run() {     // every thread must have a run() method.
        for(int i = 0 ; i < 15; i++ ){
            System.out.println("Hey");
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0 ; i < 15; i++ ){
            System.out.println("Hello");
        }
    }
}

public class demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();   // start() method will always execute the run method.
        obj2.start();
    }
}

// OS -> SCHEDULAR: it manages execution of each thread. allows threads to execute.

// OS -> CPU -> cores: no. of cores decide no. of threads which can be executed at a same time.

// schedular will decide which thread will execute at the same time according to the cores present in the CPU.