package Java_Core.Strings;

public class Demo {
    public static void main(String[] args) {

        String name1 = "Aradhya";    // String is a class.
        System.out.println(name1 + " " + name1);

        String name2 = new String("okay");  // correct method to define a String by creating it's object and passing the value to constructor ().
        System.out.println(name2 + " " + name1);
        System.out.println(name1.charAt(6));
        System.out.println(name1.concat(" Gupta")); // No change in the original


    }
}
