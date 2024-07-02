package generics.self_bounded_types.courisly_recurring_generics;

public class BasicHolder<T> {
    T element;
    void set(T args){
        element = args;
    }

    T get(){return element;}

    void f(){System.out.println(element.getClass().getSimpleName());}
}
