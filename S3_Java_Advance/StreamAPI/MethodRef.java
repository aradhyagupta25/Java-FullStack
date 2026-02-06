package S3_Java_Advance.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hello", "World");

        List<String> ulist = list.stream()
                .map(String::toUpperCase)   // passing function to a function. toUpperCase belongs to String class. it is called Method Referencing.
                .toList();

        ulist.forEach(System.out::println); // just provide class / object name of the method to use the Method Referencing.
    }
}
