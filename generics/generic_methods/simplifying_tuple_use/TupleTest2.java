package generics.generic_methods.simplifying_tuple_use;

import generics.Simple_generics.A_tuple_library.*;

public class TupleTest2 {

    public static TwoTuple<String, Integer> f() {
        return Tuple.tuple("HI", 47);
    }

    public static TwoTuple f2() {
        return Tuple.tuple("hi", 47);
    }

    public static ThreeTuple<Amphibian, String, Integer> g() {
        return Tuple.tuple(new Amphibian(), "hi", 47);
    }

    public static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return Tuple.tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    public static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return Tuple.tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
