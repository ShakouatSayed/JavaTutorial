/* Exercise 23: (1) Modify FactoryConstraint.java so that create( ) takes an
argument.  */

package generics.compensating_for_erasure.creating_instances_of_types;

interface ExFactoryI<T>{
    T create(Integer i);
}

class ExFooTwo<T> {
    private T x;

    public <F extends ExFactoryI<T>> ExFooTwo(F factory, Integer i){
        x = factory.create(i);
    }

    public void show(){
        System.out.println(x);
    }
    
}

class ExIntegerFactory implements ExFactoryI<Integer>{
    @SuppressWarnings("removal")
    public Integer create(Integer i){
        return new Integer(i);
    }
}

class ExWidget {

    static int i;

    public static class ExFactory implements ExFactoryI<ExWidget>{
        public ExWidget create(Integer i){
            ExWidget.i = i;
            return new ExWidget();
        }
    }

    public String toString(){
        return "Widget (" + i + ") ";
    }
}


public class Exercise23 {
    public static void main(String[] args) {
        ExFooTwo<Integer> f = new ExFooTwo<Integer>(new ExIntegerFactory(), 128);
        ExFooTwo<ExWidget> g = new ExFooTwo<ExWidget>(new ExWidget.ExFactory(), 120);

        f.show();
        g.show();
    }
}
