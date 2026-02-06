package S2_Java_Core.WrapperClass;

public class Demo {
    public static void main(String[] args) {

        int num = 7;
        System.out.println(num + " Primitive");
        Integer num1 = 8;
        System.out.println(num1 + " Object");
        Integer num2 = num;     // Converting Primitive type to object type: Auto-Boxing
        System.out.println(num2 + " Object");

        int num3 = num1;
        System.out.println(num3 + " Primitive");    // Auto-UnBoxing

        String str = "25";
        int num4 = Integer.parseInt(str);
        System.out.println((num4 * 2) + " String -> Integer");
    }   // Object Class -> Integer class -> int data type
}
