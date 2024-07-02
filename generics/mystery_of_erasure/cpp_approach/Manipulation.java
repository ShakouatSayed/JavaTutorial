package generics.mystery_of_erasure.cpp_approach;

//1st method
class Manipulator<T> {
    private T obj;
    public Manipulator(T x) {obj = x;}
    //error cannot find symbol : method f()

    //add cast to obj
    public void manipulate(){((HasF) obj).hasF();}
}


//2nd method
class Manipulator2<T extends HasF>{
    private T obj;
    public Manipulator2(T x){obj = x;}

    public void manipulate(){obj.hasF();}
}


//3rd method
class Manipulator3{
    private HasF obj;
    public Manipulator3(HasF x){obj = x;}

    public void manipulate(){obj.hasF();}
}

class ReturnGenericType<T extends HasF>{
    private T obj;
    public ReturnGenericType(T x){obj = x;}

    public T get(){return obj;}
}

/**
 * InnerManipulator
 */
public class Manipulation {
    public static void main(String[] args) {
        HasF hF = new HasF();
        Manipulator3 manipulator = new Manipulator3(hF);

        ReturnGenericType<HasF> manipulator2 = new ReturnGenericType<HasF>(hF);
        manipulator2.get();
        manipulator.manipulate();
    }
}
