package generics.compensating_for_erasure;

public class Erased<T> {
    private final int SIZE = 100;
    public void f(Object arg){
        //if( arg instanceof T){};
        //T var = new T();
        //T[] array = new T[SIZE];
        //T[] array = (T) new Object[SIZE];
    }
}
