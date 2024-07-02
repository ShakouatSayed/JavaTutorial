/* Exercise 13: (4) Overload the fill( ) method so that the arguments and return types are
the specific subtypes of Collection: List, Queue and Set. This way, you don’t lose the type
of container. Can you overload to distinguish between List and LinkedList? */

package generics.generic_methods.generic_method_use_with_Generators;

import java.util.*;
import generics.generic_interfaces.coffee.*;

/**
 * Exercise13
 */
public class Exercise13 {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n){
        for(int i = 0; i <= n; i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n){
        for(int i = 0; i <= n; i++){
            list.add(gen.next());
        }
        return list;
    }

    public static <T> LinkedList<T> fill (LinkedList<T> lList, Generator<T> gen, int n){
        for(int i = 0; i <= n; i++){
            lList.add(gen.next());
        }
        return lList;
    }

    public static <T>  Set<T> fill(Set<T> set, Generator<T> gen, int n){
        for(int i = 0; i <= n; i++){
            set.add(gen.next());
        }
        return set;
    }

    public static <T> Queue<T> fill(Queue<T> qRow, Generator<T> gen, int n){
        for(int i = 0; i <= n; i++){
            qRow.add(gen.next());
        }
        return qRow;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill( new ArrayList<Coffee>(),new CoffeeGenerator(), 5);
        for(Coffee c: coffees)
            System.out.println(c);
        
        Collection<Integer> fNumbers = fill( new ArrayList<Integer>(),new generics.generic_interfaces.Example02(), 12);
        for(int n: fNumbers)
            System.out.print(n+" ");

        System.out.println();
        List<Coffee> coffees2 = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 5);
        System.out.println("List Type : "+coffees2.getClass());
        System.out.println("Coffee List : "+coffees2);

        LinkedList<Coffee> coffees3 = fill(new LinkedList<Coffee>(), new CoffeeGenerator(), 5);
        System.out.println("LinkedList Type : "+coffees3.getClass());
        System.out.println("Coffee List : "+coffees3);

        Set<Coffee> coffees4 = fill(new HashSet<Coffee>(), new CoffeeGenerator(), 5);
        System.out.println("LinkedList Type : "+coffees4.getClass());
        System.out.println("Coffees List : "+coffees4);

        Queue<Coffee> coffees5 = fill(new ArrayDeque<Coffee>(), new CoffeeGenerator(), 5);
        System.out.println("ArrayDeque Type : "+coffees5.getClass());
        System.out.println("Coffee List : "+coffees5);
    }
    
}
