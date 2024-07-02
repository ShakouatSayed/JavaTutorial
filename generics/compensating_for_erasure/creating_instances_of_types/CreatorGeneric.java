package generics.compensating_for_erasure.creating_instances_of_types;

public class CreatorGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();  
        c.f();
    }
}