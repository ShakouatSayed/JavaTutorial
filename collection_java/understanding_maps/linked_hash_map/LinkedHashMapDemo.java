package collection_java.understanding_maps.linked_hash_map;

import java.util.*;
import collection_java.filling_containers.using_abstract_classes.CountingMapData;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>(new CountingMapData(9));
        System.out.println("new LinkedHashMap<>(new CountingMapData(9)): " + linkedMap);
        System.out.println();
        linkedMap = new LinkedHashMap<>(11, 0.54f, true);
        System.out.println();
        System.out.println("LinkedHashMap<>(11, 0.54f, true) : " + linkedMap);
        linkedMap.putAll(new CountingMapData(9));
        System.out.println();
        System.out.println("linkedMap.putAll(new CountingMapData(9)) : " + linkedMap);
        for (int i = 0; i < 10; i++)
            linkedMap.get(i);
        System.out.println();
        System.out.println("linkedMap.get(i): " + linkedMap);
        linkedMap.get(0);
        System.out.println();
        System.out.println("linkedMap.get(0): " + linkedMap);
    }
}
