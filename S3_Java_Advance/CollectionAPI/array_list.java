package S3_Java_Advance.CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class array_list {
    public static void main(String[] args) {

        // collection doesn't support index value. Arraylist is a class which implements a list. List provides indexes to work with.
        List<Integer> nos = new ArrayList<>();

        Collection<Integer> nums = new ArrayList<Integer>();      //Collection is an Interface so we are using in-built class "ArrayList" to create an object.

        // without specifying the generics, collection api treats the values as objects of the class.

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        // nums.add("5");  // without mentioning the data type above with collection -> runtime error. after mentioning -> compile time error.

        for(int n : nums){
            int num = (Integer) n;
            System.out.println(n);
        }
        System.out.println(nums);

        // lists supports duplicate elements.
        nos.add(7);
        nos.add(18);
        nos.add(9);
        nos.add(10);
        System.out.println(nos.get(0)); //accessing elements using index values.

        for(Integer i : nos){
            System.out.println(i);
        }

    }
}
