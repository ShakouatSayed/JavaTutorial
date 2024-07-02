package generics.Simple_generics.A_tuple_library;

class Vehicle {}
class Amphibian{}

 public class TupleTest {
    
     static TwoTuple<String, Integer> f(){
        //outboxing convert int to integer.
        return new TwoTuple<String, Integer>("Hi, This is TwoTuple type class."  , 47);
    }
    static ThreeTuple<Amphibian, String, Integer> g(){
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(),"Hi, This is ThreeTuple type class."  , 48);
    }
    public static FourTuple<Vehicle, Amphibian, String, Integer> i(){
        return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(),new Amphibian(),"Hi, This is FourTuple type class."  , 49);
    }
    public static FiveTuple<Vehicle, Amphibian, String, Integer, Double> j(){
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(),new Amphibian(),"Hi, This is FiveTuple type class."  , 50, 3.1416);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> tT = f();
        System.out.println(tT);
        System.out.println(g());
        System.out.println(i());
        System.out.println(j());
    }
 
}
