package S3_Java_Advance.Inner_Class;

class Animal{   // outer class can't be made static if it consists of an inner class.
    public void eat() {
        System.out.println("Animals");
    }

    class Tiger{
        public void name(){
            System.out.println("Tiger");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal.Tiger cat = animal.new Tiger();  // object of outer class is reqd to create object of inner class.
        cat.name();

        //Animal.Tiger lion = new Animal.Tiger();   only works when the inner class is static.
    }
}
