/* Exercise 6: (2) Note that List has additional "optional" operations that are not included
in Collection. Write a version of Unsupported.java that tests these additional optional
operations.  */

package collection_java.optional_operations;

import java.util.*;

/**
 * Exercise06
 */
public class Exercise06 {

    public static void test(String msg, List<String> list){
        System.out.println("--------"+msg+"--------");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 8);
        Collection<String> c2 = new ArrayList<>(subList);

        try{c2.addAll(c);}catch(Exception e){
            System.out.println("c2.add(c) : "+e);
        }
        try{c2.remove(c);}catch(Exception e){
            System.out.println("c2.remove(c) : "+e);
        }
        try{c2.removeAll(c);}catch(Exception e){
            System.out.println("c2.removeAll(c) : "+e);
        }
        try{c2.retainAll(c);}catch(Exception e){
            System.out.println("c2.retainAll(c) : "+e);
        }
        try{list.set(1, "hi");}catch(Exception e){
            System.out.println("list.set(1, \"hi\") : "+e);
        }
        try{list.addAll(1, c2);}catch(Exception e){
            System.out.println("list.addAll(1, c2) : "+e);
        }
        try{list.removeAll(c2);}catch(Exception e){
            System.out.println("list.removeAll(c2) : "+e);
        }
        try{list.retainAll(c2);}catch(Exception e){
            System.out.println("list.retainAll(c2) : "+e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z ".split(" "));
        test("modifiable copies", list);
        test("Arrays.asList(list) ", list);
        test("unmodifiable list", Collections.unmodifiableList(new ArrayList<String>(list)));
    }
}