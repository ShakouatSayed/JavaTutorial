package collection_java.optional_operations;

import java.util.*;

/**
 * UnsupportedOperations
 */
public class UnsupportedOperations {

    static void test(String msg, List<String> list){
        System.out.println("-----"+msg+"-----");
        Collection<String> collection = list;
        Collection<String> subList = list.subList(1, 8);
        Collection<String> collection2 = new ArrayList<>(subList);

        try{
            collection.retainAll(collection2);}catch(Exception e){
            System.out.println("collection.retainAll(collection2) : "+e);
        }
        try{
            collection.clear();}catch(Exception e){
            System.out.println("collection.clear() : "+e);
        }
        try{
            collection.removeAll(collection2);}catch(Exception e){
            System.out.println("collection.removeAll(collection2) : "+e);
        }
        try{
            collection.addAll(collection2);}catch(Exception e){
            System.out.println("collection.addAll(collection2) : "+e);
        }
        try{
            collection.remove(collection2);}catch(Exception e){
            System.out.println("collection.remove(collection2) : "+e);
        }
        try{
            list.set(0, "a");
        }catch(Exception e){
            System.out.println("list.set(0, \"a\") : "+e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" "));
        test("Modifiable copy", new ArrayList<>(list));
        test("Arrays.asList()", list);
        test("unmodifiable List", Collections.unmodifiableList(new ArrayList<>(list)));
    }
}