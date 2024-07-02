package generics.self_bounded_types.covariance_arugument;

interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}

interface Getter extends GenericGetter<Getter>{}

public class GenericsAndReturnType {
    void test(Getter g){
        Getter result = g.get();
        GenericGetter gg = g.get();
    }
}
