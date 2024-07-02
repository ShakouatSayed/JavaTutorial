package generics.mystery_of_erasure.problem_with_erasure;

import type_information.pets.Checking_before_cast.pets_animals.Cat;

class Foo<T>{
    T var;
} 

class GenericBase<T>{
    private T element;
    public void set(T arg){arg = element;}
    public T get(){return element;}
}

class Derived1<T> extends GenericBase<T>{};
@SuppressWarnings("rawtypes")
class Derived2 extends GenericBase{};

public class EnasureAndInheritance {
    @SuppressWarnings({ "Unchecked.", "unchecked" })

   
    public static void main(String[] args) {
        Foo <Cat> f = new Foo<Cat>();
        Derived2 d = new Derived2();
        Object obj = d.get();
        d.set(obj);
        System.out.println("hi");
        System.out.println(f);
        System.out.println(d);
        System.out.println(obj);
        System.out.println(obj);
    }
}
