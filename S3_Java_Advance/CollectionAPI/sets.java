package S3_Java_Advance.CollectionAPI;

import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();  // no index values. no duplicate. no sorted order.
        set.add(1);
        set.add(12);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);

        for (Integer i : set) {
            System.out.println(i);
        }

        Set<Integer> nobs = new HashSet<Integer>(); //sorted in order.
        nobs.add(14);
        nobs.add(121);
        nobs.add(3);
        nobs.add(2);
        nobs.add(4);
        nobs.add(5);
        for (Integer i : nobs) {
            System.out.println(i);
        }
    }
}
