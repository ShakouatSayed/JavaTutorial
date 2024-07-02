/* Exercise 14: (3) Show that java.util.Properties works in the above program.  */
package collection_java.understanding_maps.performance;

import java.util.*;

import collection_java.filling_containers.using_abstract_classes.CountingMapData;

public class Exercise14 {

    public static void printKeys(Map<Integer, String> map){
        System.out.println("Size : "+map.size()+", ");
        System.out.println("Values : "+map.keySet());
    }

    public static void printKeys1(Map<Object, Object> map){
        System.out.println("Size : "+map.size()+", ");
        System.out.println("Keys : "+map.keySet());
    }

    public static void test(Map<Integer, String> map){
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        printKeys(map);
        System.out.println("Values : "+map.values());
        System.out.println("map.containsKey(11) : "+map.containsKey(11));
        System.out.println("map.get(11) : "+map.get(11));
        System.out.println("map.containsValue(\"F0\") "+map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        System.out.println("Read all keys: "+key);
        map.remove(key);
        printKeys(map);
        map.clear();
        System.out.println("map.isEmpty(): "+map.isEmpty());
        map.putAll(new CountingMapData(25));
        map.keySet().removeAll(map.keySet());
        System.out.println(map.keySet());
    }
    public static void test1(Map<Object, Object> map){
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        printKeys1(map);
        System.out.println("Values : "+map.values());
        System.out.println("map.containsKey(11) : "+map.containsKey(11));
        System.out.println("map.get(11) : "+map.get(11));
        System.out.println("map.containsValue(\"F0\") "+map.containsValue("F0"));
        boolean key = map.keySet().iterator().hasNext();
        System.out.println("Read all keys: "+key);
        map.remove(key);
        printKeys1(map);
        map.clear();
        System.out.println("map.isEmpty(): "+map.isEmpty());
        map.putAll(new CountingMapData(25));
        map.keySet().removeAll(map.keySet());
        System.out.println(map.keySet());
    }

    public static void main(String[] args) {
        //Map<String> map = new HashMap<>();
        //test(new HashMap<>());
        Map<Object, Object> mapObject = new Properties();
        test1(mapObject);
    }
}
