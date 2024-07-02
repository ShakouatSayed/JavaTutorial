package generics.self_bounded_types.covariance_arugument;

interface SelfBoundedSetter<T extends SelfBoundedSetter<T>> {
    T set(T args);
}

interface Setter extends SelfBoundedSetter<Setter>{}

public class PlainSelfBoundedArgument {
    void test(Setter s, Setter s2, SelfBoundedSetter sbs){
        s.set(s2);
    }
}
