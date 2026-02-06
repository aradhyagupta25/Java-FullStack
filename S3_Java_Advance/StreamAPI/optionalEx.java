package S3_Java_Advance.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalEx {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Arasya", "Kamini", "jhon", "ajax", "connor");

        String name = list.stream()
                .filter(s -> s.contains("x"))
                .findFirst()
                .orElse("Not Found");   // remove the "Optional<String> and use sout(name);
        //System.out.println(name.get()); // if we don't have any name having "x", it will give error( Null Point exception).
        System.out.println(name);
        //System.out.println(name.orElse("Not Found"));
    }
}
