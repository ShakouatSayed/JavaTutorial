package collection_java.sets_and_storage_order.sorted_set;

import java.util.*;

/**
 * SortedSetDemo
 */
public class SortedSetDemo {

    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, "one two three four five six seven eight nine ten".split(" "));
        System.out.println("sortedSet: "+sortedSet);
        String low = sortedSet.first();
        String heigh = sortedSet.last();
        Iterator<String> iterator = sortedSet.iterator();
        for(int i = 0; i < 6; i++){
            if(i == 3)
                low = iterator.next();
            else if (i == 6)
                heigh = iterator.next();
            else{iterator.next();}
        }
        System.out.println("low: "+low);
        System.out.println("heigh: "+heigh);
        System.out.println("sortedSet.subSet(low, heigh): "+sortedSet.subSet(low, heigh));
        System.out.println("sortedSet.headSet(heigh): "+sortedSet.headSet(heigh));
        System.out.println("sortedSet.tailSet(low): "+sortedSet.tailSet(low));
    }
}