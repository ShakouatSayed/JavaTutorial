/* Exercise 17: (4) Study the JDK documentation for EnumSet. You’ll see that there’s a
clone( ) method defined. However, you cannot clone( ) from the reference to the Set
interface passed in Sets.java. Can you modify Sets.java to handle both the general case of a
Set interface as shown, and the special case of an EnumSet, using clone( ) instead of
creating a new HashSet?  */

package generics.generic_methods.a_Set_utility;

import java.util.*;

 class Example<T extends Enum<T>> {
    EnumSet<T> set; // No error
}


public class Exercise17 {
    public static <T extends Enum<T>> Set<T> union(Set<T> a, Set<T> b){
        try{
            // Set<T> result = a instanceof EnumSet ? ((EnumSet<T>)a).clone(): new HashSet<T>();
            // result.retainAll(b);
            // return result;

            if(a instanceof EnumSet){
                Set<T> result = ((EnumSet<T>)a).clone();
                result.addAll(b);
                return result;
            }
        }catch(Exception e){
            throw new RuntimeException();
        }

        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }

    public static <T extends Enum<T>> Set<T> intersection(Set<T> a, Set<T> b){
        try{
            if(a instanceof EnumSet){
                Set<T> result = ((EnumSet<T>)a).clone();
                result.retainAll(b);
                return result;
            }
        }catch(Exception e){
            throw new RuntimeException();
        }

        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }

    public static <T extends Enum<T>> Set<T> differance(Set<T> supperSet, Set<T> subSet){
        try{
            if(supperSet instanceof EnumSet){
                Set<T> result = ((EnumSet<T>)supperSet).clone();
                result.removeAll(subSet);
                return result;
            }
        }catch(Exception e){
            throw new RuntimeException();
        }

        Set<T> result = new HashSet<T>(supperSet);
        result.removeAll(subSet);
        return result;
    }

    //reflexing --everything not in the intersection
    public static <T extends Enum<T>> Set<T> complement(Set<T> a, Set<T> b){
        return differance(union(a, b), intersection(a, b));
    }

    public static void main(String[] args) {
        Set<WaterColors> set1 = EnumSet.range(WaterColors.CERULEN_BLUE_HUE, WaterColors.ULTRAMARINE);
        System.out.println("set1 : "+set1);

        System.out.println();
        Set<WaterColors> set2 = EnumSet.range(WaterColors.DEEP_YELLOW, WaterColors.ORANGE);
        System.out.println("set2 : "+set2);

        System.out.println();
        System.out.println("union(set1, set2) : "+union(set1, set2));

        System.out.println();
        Set<WaterColors> subSet = intersection(set1, set2);
        System.out.println("intersection(set1, set2) : "+subSet);

        System.out.println();
        System.out.println("differance(set1, subSet) : "+differance(set1, subSet));

        
        System.out.println();
        System.out.println("differance(set2, subSet) : "+differance(set2, subSet));

        System.out.println();
        System.out.println("Complement(set1, set1) : "+complement(set1, set2));

    }
}
