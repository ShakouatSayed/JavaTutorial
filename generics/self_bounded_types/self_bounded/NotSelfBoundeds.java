package generics.self_bounded_types.self_bounded;

class NotSelfBounding<T> {
    T element;
    NotSelfBounding<T> set(T args){
        element = args;
        return this;
    }

    T get(){return element;}
}

class A1 extends NotSelfBounding<A1>{}
class B1 extends NotSelfBounding<A1>{}
class C1 extends NotSelfBounding<C1>{
    C1 setAndGet(C1 args){
        set(args);
        return get();
    }
}

class D1{}
//now E1 class is compile now
class E1 extends NotSelfBounding<D1>{}
