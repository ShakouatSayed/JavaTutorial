package generics.Simple_generics.A_tuple_library;

public class FiveTuple<A, B, C, D, E > extends FourTuple<A, B, C, D>{
    public final E five;
    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        five = e;
    }
    public String toString(){
        return first + ", " + second + ", " + third + ", "+ four + ", " + five;
    }

    public static <A, B, C, D, E> FiveTuple<A, B, C, D, E> tuple(A a, B b, C c, D d, E e){
        return new FiveTuple<A, B, C, D, E>(a, b, c, d, e);
    }
}
