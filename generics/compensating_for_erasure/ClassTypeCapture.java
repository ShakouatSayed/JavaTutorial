package generics.compensating_for_erasure;

/**
 * ClassTypeCapture
 */

class Buillding{}
class House extends Buillding{}

public class ClassTypeCapture<T> {

    Class<T> kind;
    public ClassTypeCapture(Class<T> kinds){this.kind = kinds;}

    public boolean f(Object obj){
        return kind.isInstance(obj);
    }

    public static void main(String[] args) {

        ClassTypeCapture<Buillding> classTypeCapture = new ClassTypeCapture<Buillding>(Buillding.class);

        System.out.println(classTypeCapture.f(new Buillding()));
        System.out.println(classTypeCapture.f(new House()));

        ClassTypeCapture<House> classTypeCapture2 = new ClassTypeCapture<House>(House.class);
        System.out.println(classTypeCapture2.f(new Buillding()));
        System.out.println(classTypeCapture2.f(new House()));
    }
}