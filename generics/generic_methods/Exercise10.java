/* Exercise 10: (1) Modify the previous exercise so that one of f( )’s arguments is nonparameterized. */

package generics.generic_methods;

public class Exercise10 {
    public <T, U> void f(T t, U u, Integer v){
        System.out.println(t.getClass().getSimpleName());
        System.out.println(u.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Exercise10 ex = new Exercise10();
        ex.f(" ", 1.5, 1);
        ex.f(1.5f, 'c', 125);
    }
}
