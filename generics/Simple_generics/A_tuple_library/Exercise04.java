/* Exercise 4: (3) "Generify" innerclasses/Sequence.java. */

package generics.Simple_generics.A_tuple_library;

import java.util.ArrayList;
import java.util.List;

/* import generics.Simple_generics.A_tuple_library.SequenceOne.HolderTwo;
class SequenceOne{
    private String name;
    public SequenceOne (String name){this.name = name;}
    public static class HolderTwo<T>{
        private T t;
        public HolderTwo(T t){this.t = t;}
        public void set(T t){
            this.t = t;
        }
        public T getT(){
            return t; 
        }
    }
    public String toString(){
        return name;
    }
}

public class Exercise04 {
    public static void main(String[] args) {
        HolderTwo<SequenceOne> hTwo = new HolderTwo<SequenceOne>(new SequenceOne("Shakouat Hossen Sayed."));
        
        hTwo.set(new SequenceOne("Hi, My name is Shakouat Hossen Sayed."));
        System.out.println(hTwo.getT());
    }
}
 */

 interface Selector{
    Object current();
    void next();
    boolean end();
    
 }

/*
 * Exercise04
 */
public class Exercise04<E> {

    private List<E> list = new ArrayList<E>();

    public Exercise04(List<E> list){ this.list = list;}
    public void add(E e){
        list.add(e);
    }

    //inner class
    class SequenceSelector implements Selector{
        private int i = 0;

        public boolean end(){return i == list.size();}
        public Object current(){return list.get(i);}
        public void next(){if(i < list.size()) i++;}
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        Exercise04<String> ex = new Exercise04<String>(ls);

        for(int i = 0; i < 10; i++){
            ex.add(Integer.toString(i));
        }

        Selector selector = ex.selector();
        while(!selector.end()){
            System.out.print(selector.current() +" ");
            selector.next();
        }
    }
}




