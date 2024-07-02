package generics.self_bounded_types.covariance_arugument;

class OrdinarySetter{
    void set(Base base){
        System.out.println("OrdinarySetter.set(Base)");
    }
}

class DrivedSetter extends OrdinarySetter{
    void set(Drived drived){
        System.out.println("DrivedSetter.set(Drived)");
    }
}

public class OrdinarySetterArgument {
    public static void main(String[] args) {
        Base base = new Base();
        Drived drived = new Drived();
        DrivedSetter ds = new DrivedSetter();
        ds.set(drived);
        ds.set(base);
    }
}
