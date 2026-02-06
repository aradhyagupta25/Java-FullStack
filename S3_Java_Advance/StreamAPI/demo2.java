package S3_Java_Advance.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {

        List<Integer> nos = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> s1 = nos.stream();   // returns object of Stream. Whatever operation/changes we perform on stream won't affect the nos list. can't use stream more than once. it will give error.
//        //s1.forEach(n -> System.out.println(n));
//        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);    //s1 already used here.
//        Stream<Integer> s3 = s2.map(n -> n * 2);
//        int result = s3.reduce(0,(c,e) -> c+e);
//        System.out.println(result);

        int result = nos.stream()       // short way of doing it using stream().
                        .filter(n -> n % 2 == 0)    //new stream
                        .map(n -> n*2)  //new stream
                        .reduce(0,(c,e) -> c+e);    //new stream
        System.out.println(result);


    }
}
