package generics.generic_methods.a_Set_utility;

import java.util.*;

public class Sets {
    
    public static<T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }

    public static<T> Set<T> intersection(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }

    //Subtract subSet from supperSet
    public static<T> Set<T> difference(Set<T> superSet, Set<T> subSet){
        Set<T> result = new HashSet<T>(superSet);
        result.removeAll(subSet);
        return result;
    }

    //Reflexing--everything not in the intersection
    public static<T> Set<T> complement(Set<T> a, Set<T> b){
        return difference(union(a, b), intersection(a, b));
    }
}


