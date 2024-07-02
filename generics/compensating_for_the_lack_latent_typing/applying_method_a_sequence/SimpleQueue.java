package generics.compensating_for_the_lack_latent_typing.applying_method_a_sequence;

import java.util.*;

class SimpleQueue<T> implements Iterable<T> {
    
    private LinkedList<T> storage = new LinkedList<>();
    public void add(T t){storage.offer(t);}
    public T get(){return storage.poll();}
    public Iterator<T> iterator(){
        return storage.iterator();
    }
 }