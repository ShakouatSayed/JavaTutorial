/* Exercise 5: (3) Modify CountingMapData.java to fully implement the flyweight by
adding a custom EntrySet class like the one in Countries.java */

package collection_java.filling_containers.using_abstract_classes;

import java.util.*;

/**
 * Exercise05
 */
public class Exercise05 {

    static String[] chars = ("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z").split(" ");

    public static class FlyWeight extends AbstractMap<Integer, String>{
        public static class Entry implements Map.Entry<Integer, String>{

            int index;
            public Entry(int index){
                this.index = index;
            }

            public boolean equals(Object o){
                return Integer.valueOf(index).equals(o);
            }

            @Override
            public Integer getKey() {
                return Integer.valueOf(index);
            }

            @Override
            public String getValue() {
                return chars[index%chars.length] + Integer.toString(index/chars.length);
            }

            @Override
            public String setValue(String value) {
                throw new UnsupportedOperationException("Unimplemented method 'setValue'");
            }

            public int hashCode(){
                return Integer.valueOf(index).hashCode();
            }

        }

        public static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {

            private static int size;
            
            public EntrySet(int size){
                if(size < 0) this.size = 0;
                else if(size>chars.length)  this.size = chars.length;
                else this.size = size;
            }

            public int size(){
                return size;
            }

            public static class Iter implements Iterator<Map.Entry<Integer, String>>{

                Entry entry = new Entry(-1);
                @Override
                public boolean hasNext() {
                    return entry.index < size - 1;
                }

                @Override
                public Map.Entry<Integer, String> next() {
                   entry.index++;
                    return entry;
                }

                @Override 
                public void remove(){
                    throw new RuntimeException();
                }
                
            }

            @Override
            public Iterator<Map.Entry<Integer, String>> iterator() {
                return new Iter();
                
            }

        }

        
        public static Set<Map.Entry<Integer, String>> entries = new EntrySet(chars.length);
        public Set<Map.Entry<Integer, String>> entrySet() {
            return entries;
        }

        public static Map<Integer, String> select(final int size){
            return new FlyWeight(){
                public  Set<Map.Entry<Integer, String>> entrySet(){
                    return new EntrySet(size);
                }
            };
        }
    }

    public static void main(String[] args) {
        System.out.println(new FlyWeight());
        Exercise05 e = new Exercise05();
        System.out.println(Exercise05.FlyWeight.select(9));
    }
    
}