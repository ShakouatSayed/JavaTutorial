package generics.compensating_for_erasure.creating_instances_of_types;

interface FactoryI<T>{
    T create();
}

class FooTwo<T>{
    private T x;
    public  <F extends FactoryI<T>> FooTwo(F factory){
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer>{
    @SuppressWarnings("removal")
    public Integer create(){
        System.out.println("IntegerFactory");
        return new Integer(0);
    }
    //public String toString(){return "IntegerFactory";}
}

class Widget {
    public static class Factory implements FactoryI<Widget>{
        public Widget create(){
            System.out.println("Widget.Factory()");
            return new Widget();
        }

        //public String toString(){return "Widget.Factory()";}
    }
}


public class FactoryConstriant {
    public static void main(String[] args) {
        FooTwo<Integer> f = new FooTwo<Integer>(new IntegerFactory());
        //System.out.println(f.toString());

        FooTwo<Widget> fOne = new FooTwo<Widget>(new Widget.Factory());
        //System.out.println(fOne.toString());
    }
}
