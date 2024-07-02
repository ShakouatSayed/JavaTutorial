package generics.mystery_of_erasure.action_at_the_boundaries;

import java.util.*;

public class FilledListMaker<T> {
    List<T> create(T t, int n) {
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < n; i++)
            list.add(t);
        return list;
    }

    public static void main(String[] args) {

        FilledListMaker<String> filledListMaker = new FilledListMaker<String>();
        
        List<String> list = filledListMaker.create("Hello", 10);
        System.out.println(list);
    }
}
