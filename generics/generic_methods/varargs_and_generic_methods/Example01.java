package generics.generic_methods.varargs_and_generic_methods;

import java.util.*;

public class Example01 {
    public static <T> LinkedList<T> makeList(T... charaters){
        LinkedList<T> result = new LinkedList<T>();
        for(int i= 0; i<charaters.length;i++)
            result.add(charaters[i]);
        return result;

    } 
    
    public static void main(String[] args) {
        List <String> ls = makeList("A");
        System.out.println(ls);

        ls = makeList("A", "B", "C");
        System.out.println(ls);

        ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}

