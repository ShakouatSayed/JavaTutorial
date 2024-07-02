package generics.Wildcards;

import java.util.*;

public class GenericsAndCovarince {
    public static void main(String[] args) {

        List<? extends Fruit> flist = new ArrayList<Apple>();
        flist.add(null);
        Fruit f = flist.get(0);
        System.out.println(f);
        
    }
}
