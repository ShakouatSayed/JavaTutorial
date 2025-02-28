package collection_java.filling_containers.using_abstract_classes;

import java.util.*;

public class CountingMapData extends AbstractMap<Integer, String> {
    public static int size;
    public static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");
    public CountingMapData(int size){this.size = size< 0? 0 : size;}
    
    public class Entry implements Map.Entry<Integer, String>{
        int index;
        public Entry(int index){this.index = index;}
        public boolean equels(Object o){
            return Integer.valueOf(index).equals(o);
        }

        
        public Integer getKey(){
            return index;
        }

        public String getValue(){
            return chars[index % chars.length] + Integer.toString(index/chars.length);
        }

        public String setValue(String value){
            throw new UnsupportedOperationException();
        }

        public int hashCode(){
            return Integer.valueOf(index).hashCode();
        }
    }


    @Override
    public Set<Map.Entry<Integer, String>> entrySet() {
        Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<>();
        for(int i = 0; i <= size; i++){
            entries.add(new Entry(i));
        }
        return entries;
    }
    public static void main(String[] args) {
        System.out.println(new CountingMapData(60));
    }
}
