package Java_Advance.Threads;

public class demo4 {
    public static void main(String[] args) {
        Runnable obj1 = () ->
        {   // since Runnable is a functional interface, we can use the lambda expression directly instead of creating two classes.
            for (int i = 0; i < 10; i++) {
                System.out.println("Run 1");
                try { Thread.sleep(10); } catch(InterruptedException e) {throw new RuntimeException(e);}
            }
        };

        Runnable obj2 = () ->
        {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Run 2");
                    try { Thread.sleep(10); } catch(InterruptedException e) {throw new RuntimeException(e);}
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.run();
        t2.run();
    }
}
