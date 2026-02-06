package S3_Java_Advance.Enums;

//an enum (short for enumeration) is a special kind of class that represents a fixed set of named constants. While it uses the enum keyword instead of class, it shares many characteristics with regular classes and can even contain methods, fields, and constructors.

enum status{    // status is a class here.
    running , failed, pending, success; // "NAMED CONSTANTS".  these are objects of the class status.
}
// by default, enum extends enum class.

public class Demo {
    public static void main(String[] args) {

        status s = status.running;  // type: status.
        System.out.println(s);
        System.out.println(s.ordinal());    // prints no. of that named constant.

        status[] t = status.values();   // returns array of all values.
        for(status stat : t) System.out.println(stat + " : " + stat.ordinal());
    }
}
