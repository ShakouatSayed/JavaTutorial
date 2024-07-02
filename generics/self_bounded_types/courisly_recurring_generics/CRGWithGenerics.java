package generics.self_bounded_types.courisly_recurring_generics;

class Subtypes extends BasicHolder<Subtypes>{}

 public class CRGWithGenerics {
    public static void main(String[] args) {
        Subtypes s1 = new Subtypes() ; Subtypes s2 = new Subtypes();
        s1.set(s2);
        Subtypes s3 = s1.get();
        s1.f();
    }
 }


