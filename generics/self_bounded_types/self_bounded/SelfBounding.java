package generics.self_bounded_types.self_bounded;

 class BasicHolder<T> {
    T element;
    void set(T args){
        element = args;
    }

    T get(){return element;}

    void f(){System.out.println(element.getClass().getSimpleName());}
}

class Other{}
class BaseOther extends BasicHolder<Other>{}

public class SelfBounding {
    public static void main(String[] args) {
        BaseOther b1 = new BaseOther();
        b1.set(new Other());
        Other other = b1.get();
        b1.f();
    }
}
