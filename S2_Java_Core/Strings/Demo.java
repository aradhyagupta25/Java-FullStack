package S2_Java_Core.Strings;

public class Demo {
    public static void main(String[] args) {

        String n1 = "Aradhya";    // String is a class.
        System.out.println("Name:" + " " + n1);

        String n2 = new String("Gupta");  // correct method to define a String by creating it's object and passing the value to constructor ().
        System.out.println(n1 + " " + n2);
        System.out.println(n1.charAt(6));
        System.out.println(n1.concat(" Gupta")); // No change in the original

        String s1 = "George";
        String s2 = "George";
        System.out.println(s1 == s2); // same ref add for both s1 and s2.

    }
}
