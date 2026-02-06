package S3_Java_Advance.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class demo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        for(int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }   // it goes to each index and fetches the elements.

//        for( int n : nums){
//            System.out.println(n);
//        }   //nums gives value to n.

        //nums.forEach(n -> System.out.println(n));   // using the streamAPI

        Consumer<Integer> cons = n -> System.out.println(n);    // using Consumer Interface.
        nums.forEach(cons);


    }


}
