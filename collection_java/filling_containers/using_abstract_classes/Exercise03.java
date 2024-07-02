/* Exercise 3: (1) Using Countries, fill a Set multiple times with the same data and verify
that the Set ends up with only one of each instance. Try this with HashSet,
LinkedHashSet, and TreeSet.  */

package collection_java.filling_containers.using_abstract_classes;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Exercise03
 */
public class Exercise03 {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedListSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        System.out.println("hashSet = " + hashSet);
        System.out.println("linkedListSet = " + linkedListSet);
        System.out.println("treeSet = " + treeSet);

        Map<String, String> hashMap = new HashMap<>();
        Pattern p = Pattern.compile("D[a-zA-Z]*");

        for (int i = 0; i < Countries.Data.length; i++) {
            if (p.matcher(Countries.Data[i][0]).matches()) {
                hashMap.put(Countries.Data[i][0], Countries.Data[i][0]);
            }
        }

        System.out.println("hashMap.keySet() = " + hashMap.keySet());
        System.out.println("adding hashMap.keySet() ");

        hashSet.addAll(hashMap.keySet());
        linkedListSet.addAll(hashMap.keySet());
        treeSet.addAll(hashMap.keySet());

        System.out.println("hashSet = " + hashSet);
        System.out.println("linkedListSet = " + linkedListSet);
        System.out.println("treeSet = " + treeSet);

        System.out.println("adding hashMap 10 times.");
        for (int i = 0; i < 10; i++) {
            hashSet.addAll(hashMap.keySet());
            linkedListSet.addAll(hashMap.keySet());
            treeSet.addAll(hashMap.keySet());
        }

    }
}