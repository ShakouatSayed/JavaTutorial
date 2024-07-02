
/*
 * How to create HashMap using map interface program in java
 */
package problem_solving_question;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapUsingMap {
    public static void main(String args[]){
        Map<String, Integer> hm = new HashMap<String, Integer>();

        //put the value in map 
        hm.put("Apple", 5);
        hm.put("Guava", 7);
        hm.put("Mango", 9);
        hm.put("Orange", 8);

        //map remove the value
        hm.remove("Guava");

        //using the hash map in java
        HashMap<String, Integer> hm0 = new HashMap<String, Integer>(hm);
        //print the map and hash map value
        System.out.println(hm);
        System.out.println(hm0);

        //print the map value
        for(Map.Entry<String, Integer> hm1 : hm.entrySet())
            System.out.println("Fruits: "+hm1.getKey()+"\nQuantity: "+hm1.getValue());

    }
}
