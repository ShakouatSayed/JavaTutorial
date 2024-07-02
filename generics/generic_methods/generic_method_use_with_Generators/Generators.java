package generics.generic_methods.generic_method_use_with_Generators;

import java.util.*;
import generics.generic_interfaces.coffee.*;

public class Generators {
    public static <T> Collection<T> fill(Generator<T> gen, Collection<T> coll, int n){
        for(int i = 0; i <= n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new CoffeeGenerator(), new ArrayList<Coffee>(),  4);
        for(Coffee c: coffee)
            System.out.println(c);

        // for(int i =0; i<coffee.size();i++)
        //     System.out.println(coffee.get[i]);

        Collection<Integer> fNumbers = fill(new generics.generic_interfaces.Example02(), new ArrayList<Integer>(), 12);
        for(int i: fNumbers)
            System.out.print(i+" ");
    }
}
