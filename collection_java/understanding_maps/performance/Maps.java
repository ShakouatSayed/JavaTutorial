package collection_java.understanding_maps.performance;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import collection_java.filling_containers.using_abstract_classes.CountingMapData;

public class Maps {
    public static void printKeys(Map<Integer, String> map){
        System.out.println("Size : "+map.size()+", ");
        System.out.println("Keys : "+map.keySet());
    }
    public static void test(Map<Integer, String> map){
        map.putAll(new CountingMapData(25));
        printKeys(map);
        System.out.println("Values: "+map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11): "+map.containsKey(11));
        System.out.println("map.get(11): "+map.get(11));
        System.out.println("map.containsValue(\"F0\"): "+map.containsValue("F0"));
        Integer keys = map.keySet().iterator().next();
        System.out.println(keys);
        map.remove(keys);
        printKeys(map);
        map.clear();
        System.out.println("map.isEmpty(): "+map.isEmpty());
        map.putAll(new CountingMapData(25));
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty(): "+map.isEmpty());
    }
    public static void main(String[] args) {
        test(new HashMap<>());
        test(new LinkedHashMap<>());
        test(new ConcurrentHashMap<>());
        test(new IdentityHashMap<>());
        test(new WeakHashMap<>());
    }
}
