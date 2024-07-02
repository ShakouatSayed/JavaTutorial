/* Exercise 1: (1) Create a List (try both ArrayList and LinkedList) and fill it using
Countries. Sort the list and print it, then apply Collections.shuffle( ) to the list
repeatedly, printing it each time so that you can see how the shuffle( ) method randomizes
the list differently each time.  */

package collection_java.filling_containers.using_abstract_classes;

import java.util.*;

/**
 * Exercise01
 */
public class Exercise01 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < Countries.Data.length; i++) {
            arrayList.add(Countries.Data[i][0]);
            linkedList.add(Countries.Data[i][1]);
        }

        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Countries : " + arrayList);
        System.out.println("Capitals : " + linkedList);

        for(int i = 0; i < 2; i++){
            Collections.shuffle(arrayList);
            Collections.shuffle(linkedList);
            System.out.println("Counties : "+i+" "+arrayList);
            System.out.println("Capitals : "+i+" "+linkedList);
        }

        List<String> arrayList2 = new ArrayList<>();
        LinkedList<String> linkedList2 = new LinkedList<>();

        for(int i = 0; i< 10; i++){
            arrayList2.add(Countries.Data[i][0]);
            linkedList2.add(Countries.Data[i][0]);
        }

        for(int i = 0; i< 5;i ++){
            Collections.shuffle(arrayList2);
            Collections.shuffle(linkedList2);
            System.out.println("Countires : "+i+" "+arrayList2);
            System.out.println("Capitals : "+i+" "+linkedList2);
            Collections.sort(arrayList2);
            Collections.sort(linkedList2);
        }
    }
}