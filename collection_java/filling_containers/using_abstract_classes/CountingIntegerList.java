package collection_java.filling_containers.using_abstract_classes;

import java.util.*;

public class CountingIntegerList extends AbstractList<Integer>{
    int size;
    public CountingIntegerList(int size){if(size < 0) this.size = 0;this.size = size;}

    public Integer get(int index){
        return Integer.valueOf(index);
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(30));
    }
}
