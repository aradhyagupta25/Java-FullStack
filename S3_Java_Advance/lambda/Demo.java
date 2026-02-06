package S3_Java_Advance.lambda;
interface A{    //lambda exp only works with the functional interface.
    void show(int i);
}
interface B{
    void run( String s,  int i);
}
interface C{
    int add(int a, int b);
}

//now using lambda expression. "->" is called the lambda. code inside {} is called an expression.
public class Demo {
    public static void main(String[] args) {

        A obj = i -> System.out.println("Showing A " + i);  //not using bracket for only single parameter.
        B obj2 = (s,i) -> System.out.println("Showing B " + i + " " + s);   // using () and 2 parameters. can also use more.

        C obj3 = (a,b) -> (a+b)+2;  //we couldn't use "return" here, writing only the returning statement will work.
        int result = obj3.add(1,2);

        obj.show(3);
        obj2.run("Hello",6);
        System.out.println(result);
    }
}
