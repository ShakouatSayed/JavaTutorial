/* Exercise 15: (1) Verify the previous statement.  */


package generics.generic_methods.simplifying_tuple_use;

import generics.Simple_generics.A_tuple_library.*;


/**
 * Exercise15
 */
public class Exercise15 {

    static TwoTuple<String, Integer> f(){
        return Tuple.tuple("Shakouat Hossen Sayed", 47);
    }

    static TwoTuple f2(){return Tuple.tuple("Hi", 47);}
    
    static ThreeTuple<Vehicle, String, Integer> g(){
        return Tuple.tuple(new Vehicle(), "Shakouat Hossen Sayed", 47);
    }

    static FourTuple<Amphibian, Vehicle, String, Integer> h(){
        return Tuple.tuple(new Amphibian() ,new Vehicle(), "Shakouat Hossen Sayed", 47);
    }

    static FiveTuple<Amphibian, Vehicle, String, Integer, Integer> i(){
        return Tuple.tuple(new Amphibian(),new Vehicle(), "Shakouat Hossen Sayed", 47, 48);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ex = f();
        //compiled warning: unchecked Conversion
        TwoTuple<String, Integer> ex2 = f2();

        System.out.println(ex);
        System.out.println(ex2);
        System.out.println(g());
        System.out.println(h());
        System.out.println(i());
    }
}