package Java_Advance.CollectionAPI;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        // map is not a part of collection interface but comes under the concept.

        //Map<String, Integer> students  = new HashMap();
        Map<String, Integer> students  = new Hashtable<>();     // HashMap and HashTable works similar. just HashTable are Synchronized.

        students.put("Aradhya", 69);
        students.put("Bob", 87);
        students.put("Carol", 77);
        students.put("Daniel", 45);
        students.put("Aradhya", 89);    //will update the value -> key cannot be repeated. -> KEYS are a set & VALUES are a list.

        System.out.println(students);   // not in the sequence.
        System.out.println(students.get("Bob"));

        for(String keys: students.keySet()) {
            System.out.println(keys + " :  " + students.get(keys));
        }

    }
}
