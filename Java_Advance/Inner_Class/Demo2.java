package Java_Advance.Inner_Class;

class A{
    public void show(){
        System.out.println("Inside A");
    }

//    class B{
//        public void show(){
//            System.out.println("Inside B");
//        }
//    }
}

public class Demo2 {
    public static void main(String[] args) {

        A obj = new A()
            {
                public void show() {
                    System.out.println("Inside New Show");
                }
            };      // implementing an inner class with no name of it. ANONYMOUS INNER CLASS.
        obj.show();

        Mammal lion = new Mammal() {
            @Override
            public void Name() {
                System.out.println("Lion");
            }
        };      // here we are not making object of abstract class "Mammal", but we are creating object of an Anonymous class which is overriding the abstract method.

    }
}

abstract class Mammal{
    public abstract void Name();
}
