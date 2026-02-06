package S3_Java_Advance.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> pred = n -> n % 2 == 0;
        Function<Integer, Integer> func = n -> n * 2;

        int result = list.stream()
                .filter(pred)   // passing the object of predicate to continue or stop the flow of values according to the specified conditions.
                .map(func)
                .reduce(0,(c,e) -> c+e);
        System.out.println(result);

        Stream<Integer> sorting = list.stream()     // use can also use list.parallelStream() to make the filtering faster with multiple threads, but it's not suitable for sorting.
                .filter(n -> n % 2 != 0)
                .sorted();
        sorting.forEach(n -> System.out.println(n));
    }
}
