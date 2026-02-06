package S3_Java_Advance.CollectionAPI.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students> {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name  = name;
    }
    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students that) {
        if(this.age > that.age) return 1;       // we are defining the method within the class so we can use "this" keyword since, compareTo method takes only 1 argument.
        else return -1;
    }
}

public class demo {
    public static void main(String[] args) {

        Comparator<Integer> comp = (Integer i, Integer j) ->      // Comparator is used for sorting in customized way.
            {      // collection works with the wrapper classes(Integer).
                if( i % 10 > j % 10)
                    return 1;
                else return -1;
            };

        List<Integer> nums = new ArrayList<>();
        nums.add(69);
        nums.add(87);
        nums.add(34);
        nums.add(48);
        nums.add(42);

        System.out.println(nums);
        Collections.sort(nums, comp);   //needs a comparator always.
        System.out.println(nums);

        // StudentS
        List<Students> studs = new ArrayList<>();
        studs.add(new Students(21, "Aradhya"));
        studs.add(new Students(20, "Raj"));
        studs.add(new Students(23, "Ayush"));
        studs.add(new Students(24, "Abhishek"));
        studs.add(new Students(21, "Rohan"));

        //System.out.println(studs);
//        for(Students s :  studs) {
//            System.out.println(s);
//        }

        Comparator<Students> comp1 = ( s1,  s2)  -> s1.age >  s2.age ? 1 : -1;

        Collections.sort(studs, comp1);   // using comparator.

        //Collections.sort(studs);    // using comparable.
        for(Students s :  studs) {
            System.out.println(s);
        }
    }   // sort() method works with Integer class without passing a Comparator because Integer class implements a "Comparable". to allow the Students class to sort without a comparator, we need to implement Comparable.
}
