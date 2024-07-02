package generics.compensating_for_the_lack_latent_typing.happen_have_the_right_interface;

import java.util.*;
import java.util.Collection;

class Fill {
    public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++)
            try {
                collection.add(classToken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException();
            }
    }
}

class Contract {
    private static long count = 0;
    private final long id = count++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    public Iterator<T> iterator() {
        return storage.iterator();
    }
}

class LitleContract extends Contract {
    
}

public class FillTest {
    public static void main(String[] args) {
        List<Contract> contractList = new ArrayList<>();
        Fill.fill(contractList, Contract.class, 3);
        Fill.fill(contractList, LitleContract.class, 2);

        for (Contract c : contractList)
            System.out.println(c);

        // SimpleQueue<Contract> contranctSimpleQueue = new SimpleQueue<>();
        // Fill.fill(contranctSimpleQueue, Contract.class , 5);
    }
}
