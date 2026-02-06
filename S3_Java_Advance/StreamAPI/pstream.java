package S3_Java_Advance.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class pstream {
    public static void main(String[] args) {

        int size = 10_000;
        List<Integer> list = new ArrayList<>(size);

        Random r = new Random();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(100));
        }

        int sum1 = list.stream()
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        long start1 = System.currentTimeMillis();
        int sum2 = list.stream()
                .map(n -> {
                    try {Thread.sleep(1);} catch (InterruptedException e) {throw new RuntimeException(e);}
                    return n * 2;
                })
                .mapToInt(i -> i)   //converts Integer -> IntStream
                .sum(); // works only with IntStream.
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int sum3 = list.parallelStream()
                .map(n -> {
                    try {Thread.sleep(1);} catch (InterruptedException e) {throw new RuntimeException(e);}
                    return n * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long end2 = System.currentTimeMillis();

        System.out.println(sum2 +" "+ sum3);
        System.out.println("Sum2: " + (end1 - start1));
        System.out.println("Sum3: " + (end2 - start2));

    }
}
