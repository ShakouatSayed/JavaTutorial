package generics.generic_methods.general_purpose_generator;

public class CountedObject {
    private static long count = 0;
    private final long id = count++;

    public long id(){return id;}

    public String toString(){
        return "CountObject " + " " + id;
    }
}
