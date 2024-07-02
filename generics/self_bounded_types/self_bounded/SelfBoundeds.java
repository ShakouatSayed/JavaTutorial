package generics.self_bounded_types.self_bounded;



class SelfBounds<T extends SelfBounds<T>> {

    T element;
    SelfBounds<T> set(T args){
        element = args;
        return this;
    }

    T get(){return element;}
    
}

class A extends SelfBounds<A>{};
class B extends SelfBounds<A>{};
class C extends SelfBounds<C>{
    C setAndGet(C args){set(args);return get();}
};

class D {}
//class E extends SelfBound<D>{} //not compile

class F extends SelfBounds{}

public class SelfBoundeds{
    public static void main(String[] args) {
        A a = new A();
        a.set(new A());
        A a1 = (A) a.set(new A().get());
        System.out.println(a1);
        A a3 = a.get();
        System.out.println(a3);
        C c = new C();
        c.set(new C());
    }
}