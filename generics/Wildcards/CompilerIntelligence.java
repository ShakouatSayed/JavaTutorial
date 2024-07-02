package generics.Wildcards;
import java.util.*;

public class CompilerIntelligence {
    public static void main(String[] args) {

        List<? extends Fruit> flist =  Arrays.asList(new Apple());

        Apple a = (Apple) flist.get(10);

        System.out.println(flist.contains(new Apple()));

        System.out.println(flist.indexOf(a));

        System.out.println(a.getClass().getSimpleName());
    }
}
