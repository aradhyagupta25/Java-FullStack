package Java_Advance.Interface;
// All the Interface are Public Abstract.
// Types: Normal, Functional/Single abstract method, Marker.

// Serialization: saving data of any object in hard drive. this can be done using marker interface.

//A functional interface in Java is any interface that contains exactly one abstract method.

@FunctionalInterface
interface A{
    void show();    //only one method for functional Interface.
}

class B implements A{       // one way of overriding method of interface.
    public void show(){
        System.out.println("Inside Show");
    }
}
public class Demo1{
    public static void main(String[] args) {
        // in case of functional interface we can directly define the abstract method of the interface here.
        A obj =new A() {
            @Override
            public void show() {
                System.out.println("Inside show FI");
            }
        };

        //now using lambda expression. "->" is called the lambda. code inside {} is called an expression.
        A ob2j = ( ) -> {
                System.out.println("Inside show lambda");
            };
        obj.show();
        ob2j.show();
    }
}
