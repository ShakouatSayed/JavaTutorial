package collection_java.understanding_maps.sorted_map;

import java.util.*;

import collection_java.filling_containers.using_abstract_classes.CountingMapData;

public class SortedMapDataTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> sortedMap = new TreeMap<>(new CountingMapData(20));
        System.out.println(sortedMap);
        Integer low = sortedMap.firstKey();
        Integer heigh = sortedMap.lastKey();
        System.out.println(low);
        System.out.println(heigh);
        Iterator<Integer> it = sortedMap.keySet().iterator();
        for(int i = 0; i < 10; i++){
            if(i == 5){
                low = it.next();
            }if(i == 10)
                heigh = it.next();
            else it.next();
        }
        System.out.println(low);
        System.out.println(heigh);
        System.out.println(sortedMap.subMap(low, heigh));
        System.out.println(sortedMap.headMap(low));
        System.out.println(sortedMap.tailMap(heigh));
    }
}
