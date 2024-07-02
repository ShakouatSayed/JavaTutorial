/* Exercise 34: (4) Create a self-bounded generic type that contains an abstract method
that takes an argument of the generic type parameter and produces a return value of the
generic type parameter. In a non-abstract method of the class, call the abstract method
and return its result. Inherit from the self-bounded type and test the resulting class. */

package generics.self_bounded_types.covariance_arugument;

abstract class AbstractTypeMethod<T extends AbstractTypeMethod<T>> {

    abstract void set(T args);

    T get(T args) {
        System.out.println("get(T args)");
        return args;
    }
}

class A2 extends AbstractTypeMethod<A2> {
    // A setAndGet(A args){set(args);return get();}
    void set(A2 args) {
        System.out.println("set(A2 args)");
    }
    // public A get(){return ;}
}

public class Exercise34 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("set(A2 args)");
        a.set(a);
        System.out.println("get(T args)");
        a.get(a);
    }
}
