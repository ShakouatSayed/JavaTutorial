package collection_java.queues.deques;

import java.util.*;

public class Deques<T> {
    private LinkedList<T> deques = new LinkedList<>();
    public void addFirsts(T t){deques.addFirst(t);}
    public void addLasts(T t){deques.addLast(t);}
    public T getFirsts(){return deques.getFirst();}
    public T getLasts(){return deques.getLast();}
    public T removeFirsts(){return deques.removeFirst();}
    public T removeLasts(){return deques.removeLast();}
    public int sizes(){return deques.size();}
    public String toStrings(){return deques.toString();}
}
