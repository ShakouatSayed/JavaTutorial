/* Exercise 2: (2) Produce a Map and a Set containing all the countries that begin with ‘A’.  */

package collection_java.filling_containers.using_abstract_classes;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Exercise02
 */
public class Exercise02 {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Set<String> hashSet = hashMap.keySet();

        Pattern p = Pattern.compile("B[a-zA-Z]*");

        for(int i = 0; i < Countries.Data.length;i++){
            if(p.matcher(Countries.Data[i][0]).matches())
                hashMap.put(Countries.Data[i][0], Countries.Data[i][1]);
        }

        System.out.println(hashMap);
        System.out.println(hashSet);
    }
}