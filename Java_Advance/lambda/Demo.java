package Java_Advance.lambda;
interface A{
    void show(int i);
}
interface B{
    void run( String s,  int i);
}

public class Demo {
    public static void main(String[] args) {

        A obj = i -> System.out.println("Showing A " + i);
        B obj2 = (s,i) -> System.out.println("Showing B " + i + " " + s);

        obj.show(3);
        obj2.run("Hello",6);
    }
}
