package generics.Simple_generics.random_list;

import java.util.ArrayList;
import java.util.Random;

public class Example01<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    
    private Random rand = new Random(47);

    public void add(T iteam) {storage.add(iteam);}

    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        Example01<String> ex = new Example01<String>();
        System.out.println(ex);

        for(String s: "The quick brown fox jumped over the lazy brown dog.".split(" ")){
            ex.add(s);
            System.out.print(s + " ");
        }
        System.out.println();

        for(int i = 0; i < 11; i++)
            System.out.print(ex.select() + " ");
    }
}
