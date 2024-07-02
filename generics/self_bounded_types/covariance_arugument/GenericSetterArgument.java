package generics.self_bounded_types.covariance_arugument;

class GenericSetter<T> {
    void set(T args){
        System.out.println("GenericSetter.set(Base)");
    }
}
class DrivedGenericSetter extends GenericSetter<Base> {
    void set(Drived drived){
        System.out.println("DrivedGenericSetter.set(Drived)");
    }
}

public class GenericSetterArgument {
    public static void main(String[] args) {
        Base base = new Base();
        Drived drived = new Drived();
        DrivedGenericSetter dgs = new DrivedGenericSetter();
        dgs.set(drived);
        dgs.set(base);
    }
}
