/*
 * Thinking in Java.
 * Exercise Solution 16:
 * 
 * Exercise 16: (4) Modify the Coffee hierarchy in the Generics chapter to use
 * Registered
 * Factories.
 */
 
 package type_information.registered_factories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

interface Factory2<S>{S toFactory2();}

 class CoffeeFactory{
    public String toString(){
        return getClass().getSimpleName();
    }

    static List<Factory2<? extends Coffee2>> to_list_name = new ArrayList<Factory2<? extends Coffee2>>();

    static{
        to_list_name.add(new Americano2.Factory2());
        to_list_name.add(new Breve2.Factory2());
        to_list_name.add(new Cappuccino2.Factory2());
        to_list_name.add(new Latte2.Factory2());
        to_list_name.add(new Mocha2.Factory2());
    }

    private static Random rand = new Random(47);
    public static Coffee2 createRandom2(){
        int n = rand.nextInt(to_list_name.size());
        return to_list_name.get(n).toFactory2();
    }
 }

 class Coffee2{
    private static long count = 0;
    private final long id = count++;
    public String toString(){
        return getClass().getSimpleName()+" "+id;
    }
 }

 class Americano2 extends Coffee2{
    public static class Factory2 implements type_information.registered_factories.Factory2<Americano2>{
        public Americano2 toFactory2(){
            return new Americano2();
        }
    } 
 }

  class Breve2 extends Coffee2{
    public static class Factory2 implements type_information.registered_factories.Factory2<Breve2>{
        public Breve2 toFactory2(){
            return new Breve2();
        }
    } 
 }

 class Cappuccino2 extends Coffee2{
    public static class Factory2 implements type_information.registered_factories.Factory2<Cappuccino2>{
        public Cappuccino2 toFactory2(){
            return new Cappuccino2();
        }
    }
 }

  class Latte2 extends Coffee2{
    public static class Factory2 implements type_information.registered_factories.Factory2<Latte2>{
        public Latte2 toFactory2(){
            return new Latte2();
        }
    }
 }

   class Mocha2 extends Coffee2{
    public static class Factory2 implements type_information.registered_factories.Factory2<Latte2>{
        public Latte2 toFactory2(){
            return new Latte2();
        }
    }
 }


class CoffeeGenerator2 implements Factory2<Coffee2>, Iterable<Coffee2>{

    private Class[] types = {Americano2.class, Breve2.class, Latte2.class, Cappuccino2.class, Mocha2.class};
    private Random rand = new Random();
    private int size = 0;
    public CoffeeGenerator2(int size){this.size = size;}
    public CoffeeGenerator2(){}

    public Coffee2 toFactory2(){
        try{
            return (Coffee2) types[rand.nextInt(types.length)].newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator2 implements Iterator<Coffee2>{
        int count = size;
        public boolean hasNext(){return count > 0;}
        public Coffee2 next(){
            count --;
            return CoffeeGenerator2.this.toFactory2();
        }
    }

    public void removed(){
        throw new UnsupportedOperationException();
    }

    public Iterator<Coffee2> iterator(){
        return new CoffeeIterator2();
    }
}

public class Exercise16{
    public static void main(String args[]){
        for (int i = 0; i < 15; i++){
            System.out.println(CoffeeFactory.createRandom2());
        }
    } 
}
