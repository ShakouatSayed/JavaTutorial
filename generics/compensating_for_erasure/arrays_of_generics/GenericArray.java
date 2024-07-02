package generics.compensating_for_erasure.arrays_of_generics;

public class GenericArray<T> {
    
    private T[] array;

    @SuppressWarnings("unchecked")

    public GenericArray(int size){
        array = (T[]) new Object[size]; 
    }

    public void put(int index, T iteam){
        array[index] = iteam;
    }

    public T get(int index){return array[index];}

    //method that exproses the underlying representation
    public T[] rep(){return array;}

    public static void main(String[] args) {
        GenericArray<Integer> genericArray = new GenericArray<Integer>(10);

        //this cueses a ClassCastException
        //Integer ia = generic.rep();
        //this is ok;

        Object[] oa = genericArray.rep();
        System.out.println(oa);
    }

}
