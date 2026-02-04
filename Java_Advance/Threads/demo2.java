package Java_Advance.Threads;
// Thread Priority: we can't control the Schedular but give a thread a priority.

class C extends Thread {
    public void run() {
        for(int i = 0; i < 15; i++ ){
            System.out.println("Heyy");
            try {
                Thread.sleep(10);   //asking the thread to wait for 10ms after each execution.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class D extends Thread {
    public void run() {
        for(int i = 0; i < 15; i++ ){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class demo2 {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();

        System.out.println(c.getPriority());    // gives priority of a thread. we have a range of priority of thread form 0 -> 10. 5 is the default priority.

        d.setPriority(Thread.MIN_PRIORITY + 5);     // we are just suggesting the Schedular to keep this thread im high priority.
        c.setPriority(Thread.MAX_PRIORITY);
        System.out.println(c.getPriority());
        System.out.println(d.getPriority());

        c.start();
        try {       // two threads can go back to schedular at the same and schedular may give priority to the same as last thread which could lead to printing of same thing twice. to avoid this, we use Thread.sleep() to increase time b/w two threads execution.
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        d.start();

    }
}
