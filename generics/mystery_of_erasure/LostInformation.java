package generics.mystery_of_erasure;

import java.util.*;

class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Practical<POSITION, MOMENTUM>{}

public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<Frob>();
        Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
        
        Quark<Fnorkle> quark = new Quark<Fnorkle>();
        Practical<Long, Double> practical = new Practical<Long, Double>();

        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));

        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(practical.getClass().getTypeParameters()));
    }    
}
