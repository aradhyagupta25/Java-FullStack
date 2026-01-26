package Java_Advance.Interface;
// All the Interface are Public Abstract.
// Types: Normal, Functional/Single abstract method, Marker.

// Serialization: saving data of any object in hard drive. this can be done using marker interface.

//A functional interface in Java is any interface that contains exactly one abstract method.

@FunctionalInterface
interface A{
    void show();    //only one method for functional Interface.
}

class B implements A{
    public void show(){
        System.out.println("Inside Show");
    }
}
public class Demo1{
    public static void main(String[] args) {
        A obj =new A() {
            @Override
            public void show() {
                System.out.println("Inside show FI");
            }
        };
        obj.show();
    }
}
