/*
 * How to create a LinkedHasMap program in java
 */

package problem_solving_question;
import java.util.*;
public class CreateLinkedHashMap {
    //LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    public static void main(String[] args) {
        
        LinkedHashMap<String, Integer> link_map = new LinkedHashMap<String, Integer>();

        //put the value in linkedHashMap
        link_map.put("A", 2);
        link_map.put("B", 23);
        link_map.put("C", 24);
        link_map.put("D", 26);

        //remove the value in linkhashmap
        link_map.remove("B");

        //get the value in linkedhashmap
        int value = link_map.get("B");
        System.out.println("Value of B"+value);

        
        //Creating the enumeration
        //Enumeration<String> enums = link_map.keySet();
        for(Map.Entry<String, Integer> link_entry :link_map.entrySet())
            System.out.println("Variable : "+link_entry.getKey()+" Value: "+link_entry.getValue());
    }
}
