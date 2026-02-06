package S2_Java_Core.Static;

class Student{
    String name;
    int age;
    static String school = "KPS";

    Student(){
        name = " ";
        age = 18;
        //school = "KPS";
        System.out.println("Inside Constructor");
    }

    static{
        System.out.println("Inside Static Block");
    }
    // class loader -> load class first -> initialize static block first just once -> object created -> constructor initialized .
}

public class Block {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Student");   // Loads class. also initialize the static block.

        //Student s1 = new Student();
        //s1.name = "Aradhya";
        //s1.age = 19;
        //System.out.println(s1.age);

        //Student s2 = new Student();
        //s2.name = "Ayush";
        //System.out.println(s2.age);
    }
}
