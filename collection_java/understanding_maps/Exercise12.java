/* Exercise 12: (1) Substitute a HashMap, a TreeMap and a LinkedHashMap in
AssociativeArray .Java’s main( ). */
package collection_java.understanding_maps;

import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>(6);
        map1.put("Footballer", "Play in the Match.");
        map1.put("Cricketer", "Play in the t20 match.");
        map1.put("JunkFood","bad effect for health");
        System.out.println(map1);
        System.out.println(map1.get("Footballer"));
        System.out.println();
        TreeMap<String, String> map2 = new TreeMap<>();
        map2.put("SoftWare Engineer", "Create new Software.");
        map2.put("Programmer", "Solv the hard computer problem solution.");
        map2.put("Computer Science","Is a Degree");
        System.out.println(map2);
        System.out.println(map2.get("Programmer"));
        System.out.println();
        LinkedHashMap<String, String> map3 = new LinkedHashMap<>();
        map3.put("Learn", "How we learn today.");
        map3.put("Dairy", "What learn today and write then.");
        map3.put("SoftWare","I'am SoftWare Engineer.");
        System.out.println(map3);
        System.out.println(map3.get("SoftWare"));
    }

}
