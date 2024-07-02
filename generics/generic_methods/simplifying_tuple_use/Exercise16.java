/* Exercise 16: (2) Add a SixTuple to Tuple.java, and test it in TupleTest2 .j ava. */

package generics.generic_methods.simplifying_tuple_use;

import generics.Simple_generics.A_tuple_library.SixTuple;

public class Exercise16 {
    public static SixTuple<Vehicle, Amphibian, String, String, Integer, Integer> k(){
        return Tuple.tuple(new Vehicle(), new Amphibian(), "Shakouat Hossen", "Sayed", 47, 48);
    }

    public static void main(String[] args) {
        System.out.println(k());
    }
}
