package Java_Core.Arrays;

import javax.print.attribute.EnumSyntax;

public class Demo {
    public static void main(String[] args) {
        String name1[] = {"A", "B", "C", "D" };
        name1[3] = "E";
        System.out.println(name1[2]);
        System.out.println(name1[3]);

        float num1[] = new float[4];    // dynamic allocation
        System.out.println(num1[2]);    // all zero values




    }
}
