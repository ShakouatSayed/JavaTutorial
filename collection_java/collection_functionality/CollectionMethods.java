package collection_java.collection_functionality;

import java.util.*;

import collection_java.filling_containers.using_abstract_classes.Countries;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
         
        for(int i = 0; i < 6; i++){
            c.add(Countries.Data[i][0]);
        }

        c.add("Ten");
        c.add("Eleven");
        System.out.println(c);
        Object obj = c.toArray();
        System.out.println("Object obj = c.toArray() : "+obj);
        String[] str = c.toArray(new String[1]);
        System.out.println("String[] str = c.toArray(new String[1] : )"+str);
        System.out.println("Collectiont.max(c): "+Collections.max(c));
        System.out.println("Collectiont.min(c): "+Collections.min(c));

        Collection<String> c2 = new ArrayList<>();
        c2.addAll(c);
        System.out.println(c2);
        c2.remove(Countries.Data[1][0]);
        System.out.println(c2);
        c2.remove(Countries.Data[2][0]);
        System.out.println(c2);
        c2.removeAll(c);
        System.out.println("c2.addAll() : "+c2);
        System.out.println("c2.addAll(c)");
        c2.addAll(c);

        String val = Countries.Data[1][0];
        System.out.println("c2.contains(val) : " +c2.contains(val));
        System.out.println("c2.containsAll(c) : "+c2.containsAll(c));

        Collection<String> c3 = new ArrayList<>();
        c3.retainAll(c2);
        System.out.println("c3.retainAll() : "+c3);
        c3.addAll(c2);
        System.out.println("c3.addAll() : "+c3);
        c3.isEmpty();
        System.out.println("c3.isEmpty(): "+c3);
        c3.clear();
        System.out.println("c3.clear() : "+c3);
        c = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            c.add(Countries.Data[1][0]);
        }
        c3.addAll(c);
        System.out.println("c3.addAll() : "+c3);
    }
}
