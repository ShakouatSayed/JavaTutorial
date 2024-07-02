package generics.compensating_for_erasure.creating_instances_of_types;

abstract class GenericWithCreate<T> {
    T element = null;
    GenericWithCreate(){element = create();}

    abstract T create();
     
}

class X{}

 class Creator extends GenericWithCreate<X>{
    
    X create(){return new X();}
    void f(){System.out.println(element.getClass().getSimpleName());};


}
