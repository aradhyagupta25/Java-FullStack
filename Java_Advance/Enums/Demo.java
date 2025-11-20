package Java_Advance.Enums;

//an enum (short for enumeration) is a special kind of class that represents a fixed set of named constants. While it uses the enum keyword instead of class, it shares many characteristics with regular classes and can even contain methods, fields, and constructors.

enum status{    // status is a class here.
    running , failed, pending, success; // these are objects of the class status.
}

public class Demo {
    public static void main(String[] args) {

        status s = status.running;  // type: status.
        System.out.println(s);
    }
}
