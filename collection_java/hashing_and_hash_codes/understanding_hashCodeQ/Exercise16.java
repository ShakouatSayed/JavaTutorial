package collection_java.hashing_and_hash_codes.understanding_hashCodeQ;

import java.util.*;
import collection_java.filling_containers.using_abstract_classes.CountingMapData;

public class Exercise16 {
    public static void printKey(Map<Integer,String> map){
        System.out.println("Size() : " +map.size()+", ");
        System.out.println("key() : " +map.keySet());
    }
    
    public static void test(Map<Integer, String> map){
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(10));
        printKey(map);
        System.out.println("values(): "+map.values());
        System.out.println(map);
        System.out.println("map.containsKey(10): "+map.containsKey(10));
        System.out.println("map.get(10): "+map.get(10));
        System.out.println("map.containsValue(\"Sayed\"): "+map.containsValue("Sayed"));
        Integer key = map.keySet().iterator().next();
        System.out.println("First map in key : "+key);
        map.remove(key);
        printKey(map);
        System.out.println("map.isEmpty(): "+map.isEmpty());
        map.putAll(new CountingMapData(10));
        map.keySet().removeAll(map.keySet());
        System.out.println("map.keySet(): "+map.keySet());
    }

    public static void main(String[] args) {
        test(new SlowMap<>());
    }
}
