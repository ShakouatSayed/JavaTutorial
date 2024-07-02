package generics.Simple_generics.A_tuple_library;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E>{
    public final F sixeth;

    public SixTuple(A a, B b, C c, D d, E e, F f){
        super(a, b, c, d, e);
        sixeth = f;
    }
    
    public String toString(){
        return first + ", " + second + ", " + third + ", "+ four + ", " + five + " " +sixeth;
    }

    public static <A, B, C, D, E, F> SixTuple<A, B, C, D, E, F> tuple(A a, B b, C c, D d, E e, F f){
        return new SixTuple<A, B, C, D, E, F>(a, b, c, d, e, f);
    }
}
