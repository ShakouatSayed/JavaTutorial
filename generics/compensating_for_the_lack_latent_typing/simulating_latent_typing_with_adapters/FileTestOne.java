package generics.compensating_for_the_lack_latent_typing.simulating_latent_typing_with_adapters;

import java.util.*;
import generics.generic_interfaces.coffee.*;

interface Addable<T>{void add(T t);}

class FillTwo{
    //classToken version
    public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size){
        for(int i = 0; i < size; i++)
            try{
                addable.add(classToken.newInstance());
            }catch(Exception e){
                throw new RuntimeException(e);
            }
    }

    //generator version
    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size){
        for(int i = 0; i < size; i++)
            addable.add(generator.next());
    }
}

class AddableCollectionAdaptor<T> implements Addable<T>{
    private Collection<T> c;
    public AddableCollectionAdaptor(Collection<T> c){
        this.c = c;
    }

    public void add(T iteam){
        c.add(iteam);
    }
}

class Adaptor{
    public static <T> Addable<T> collectionAdaptor(Collection<T> c){
        return new AddableCollectionAdaptor<T>(c);
    }
}

class SimpleQueue<T> implements Iterable<T>{
    private LinkedList<T> storage = new LinkedList<>();
    public void add(T t){storage.offer(t);}
    public T get(){return storage.poll();}
    public Iterator<T> iterator(){
        return storage.iterator();
    }
}

class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T>{
    public void add(T iteam){super.add(iteam);}
}

public class FileTestOne {
    public static void main(String[] args) {
        List<Coffee> coffeList = new ArrayList<>();
        FillTwo.fill(new AddableCollectionAdaptor<Coffee>(coffeList), Coffee.class, 3);
        FillTwo.fill(Adaptor.collectionAdaptor(coffeList), Latte.class, 2);

        for(Coffee c : coffeList){
            System.out.println(c);
        }

        System.out.println("-----------------");
        AddableSimpleQueue<Coffee> coffeeAddableSimpleQueue = new AddableSimpleQueue<>();
        FillTwo.fill(coffeeAddableSimpleQueue, Mocha.class, 3);
        FillTwo.fill(coffeeAddableSimpleQueue, Cappuccino.class, 2);

        for(Coffee c: coffeeAddableSimpleQueue)
            System.out.println(c);
    }
}
