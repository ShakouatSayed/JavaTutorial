package generics.mystery_of_erasure.action_at_the_boundaries;

import java.util.*;


public class ListMaker<T> {
    List<T> create(){return new ArrayList<T>();}
    public static void main(String[] args) {
        ListMaker<String> listMaker = new ListMaker<String>();
        System.out.println(listMaker);
    }
}
