package generics.Simple_generics.A_tuple_library;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C>{
    public final D four;
    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        four = d;
    }
    public String toString(){
        return first + ", " + second + ", " + third + ", "+ four;
    }

    public static <A, B, C, D> FourTuple<A, B, C, D> tuple(A a, B b, C c, D d){
        return new FourTuple<A, B, C, D>(a, b, c, d);
    }
}
