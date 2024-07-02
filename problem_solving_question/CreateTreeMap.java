/*
 * How to create a TreeMap program in java
 */
package problem_solving_question;
import java.util.Map;
import java.util.TreeMap;

public class CreateTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        //put the value in TreeMap
        treeMap.put("A", 2);
        treeMap.put("B", 14);
        treeMap.put("C", 87);

        //get the value in TreeMap
        int value = treeMap.get("C");
        System.out.println("Value of C: "+value);

        //remove the value in TreeMap
        treeMap.remove("B");

        //creating the enumeration 
        //Enumeration<String> enumeration = treeMap.keys();
        for(Map.Entry<String, Integer> m : treeMap.entrySet()){
             System.out.println("Variable: "+m.getKey()+" value: "+m.getValue());
        }
    }
}
