package generics.compensating_for_erasure.arrays_of_generics;

public class ArrayOfGenerics {
    
    static final int SIZE = 100;
    static Generic<Integer>[] gai;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        //compiles produces ClassCastException 
        //gia = (Generic<Integer>[]) new Object[SIZE]
        //runtime type is the raw erased type

        gai = (Generic<Integer> []) new Generic[SIZE];
        System.out.println(gai.getClass().getSimpleName());
        gai[0] = new Generic<Integer>();

    }
}
