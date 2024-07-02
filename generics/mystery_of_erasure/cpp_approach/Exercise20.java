/* Exercise 20: (1) Create an interface with two methods, and a class that implements that
interface and adds another method. In another class, create a generic method with an
argument type that is bounded by the interface, and show that the methods in the interface
are callable inside this generic method. In main( ), pass an instance of the implementing
class to the generic method.  */


package generics.mystery_of_erasure.cpp_approach;

interface TwoMethod{
    public void methodOne();
    public void methodTwo();
}

class ImplementsTwoMethod implements TwoMethod{
    public void methodOne(){System.out.println("ImplementsTwoMethod.methodOne()");}
    public void methodTwo(){System.out.println("ImplementsTwoMethod.methodTwo()");}
    public void methodThree(){System.out.println("ImplementsTwoMethod.methodThree()");}
}


class Exercise20Manipulator{
    public <T extends ImplementsTwoMethod> void manipulate(T x){
        x.methodOne();
        x.methodTwo();
        x.methodThree();
    }
    // private T obj;
    // public Exercise20Manipulator(T x){obj = x;}

    // public void manipulate(){obj.methodOne();obj.methodTwo();obj.methodThree();}
}

public class Exercise20 {
    public static void main(String[] args) {
        ImplementsTwoMethod implementsTwoMethod = new ImplementsTwoMethod();
        //Exercise20Manipulator<ImplementsTwoMethod> ex20TwoMethod = new Exercise20Manipulator<ImplementsTwoMethod>(implementsTwoMethod);
        //ex20TwoMethod.manipulate();

        Exercise20Manipulator exercise20Manipulator = new Exercise20Manipulator();
        exercise20Manipulator.manipulate(implementsTwoMethod);
    }
}
