package S3_Java_Advance.ExceptionHandling;

class A{
    public void show() throws ClassNotFoundException {
//        try {
//            Class.forName("demo5");
//        }
//        catch (ClassNotFoundException e) {
//            System.out.println("Class not found: " + e);
//        }

        Class.forName("demo5");
    }
}

public class demo5 {
    static{
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {    // can't throw the exception here cuz it will redirect it to JVM -> stops the program execution.
        A obj = new A();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();    // prints the whole class stack.
        }

        System.out.println("Reached the end.");
    }
}
