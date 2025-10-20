package Java_Core.Strings;

public class Demo {
    public static void main(String[] args) {

        String name = "Aradhya";    // String is a class.
        System.out.println(name + " " + name);

        String name2 = new String("okay");  // correct method to define a String by creating it's object and passing the value to constructor ().
        System.out.println(name2 + " " + name);
        System.out.println(name.charAt(6));
        System.out.println(name.concat(" Gupta")); // No change in the original


    }
}
