package generics.compensating_for_erasure.arrays_of_generics;

import java.lang.reflect.Array;
import java.util.Collection;

public class GenericArrayWithTypeToken<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type, int size){
        array = (T[]) Array.newInstance(type, size);
    }

    public void put(int index, T iteam){
        array[index] = iteam;
    }

    public T get(int index){return array[index];}

    //expose the underlying representation 
    public T[] rep(){return array;}

   

    public static void main(String[] args) {
        
        GenericArrayWithTypeToken<Integer> genericArrayWithTypeToken = new GenericArrayWithTypeToken<>(Integer.class, 0);
        //this now work;

        Integer[] ia = genericArrayWithTypeToken.rep();
        System.out.println(ia);
    }
}
