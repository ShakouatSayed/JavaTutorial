/* Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all
of which are of a different parameterized type.  */

package generics.generic_methods;

public class Exercise09 {
    public <X, Y, Z> void f(X x, Y y, Z z){
        System.out.println(x.getClass().getSimpleName());
        System.out.println(y.getClass().getSimpleName());
        System.out.println(z.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Exercise09 ex = new Exercise09();
        ex.f(1, 10.2F, " ");
    }
}
