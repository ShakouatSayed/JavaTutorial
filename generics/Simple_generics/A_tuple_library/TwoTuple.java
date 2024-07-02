package generics.Simple_generics.A_tuple_library;

public  class TwoTuple<A, B>{
    public final A first;
    public final B second;
    public TwoTuple(A a, B b){this.first = a; this.second = b;}
    public String toString(){
        return first + ", " + second;
    }

    public static <A, B> TwoTuple<A, B> tuple(A a, B b){
        return new TwoTuple<A, B>(a, b);
    }
}
