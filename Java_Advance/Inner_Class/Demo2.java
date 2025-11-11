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
        {   // implementing an inner class with no name of it. ANONYMOUS INNER CLASS.
            public void show() {
                System.out.println("Inside New Show");
            }
        };
        obj.show();
    }
}
