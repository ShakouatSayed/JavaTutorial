package generics.compensating_for_erasure.arrays_of_generics;

import java.util.*;

public class ListOfGenerics<T> {

    private List<T> array = new ArrayList<T> ();
    public void add(T iteam){array.add(iteam);}
    public T get(int index){return array.get(index);}

}
