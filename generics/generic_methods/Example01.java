package generics.generic_methods;

public class Example01 {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        Example01 ex = new Example01();
         ex.f(" ");
         ex.f(1);
         ex.f(1.5);
         ex.f('c');
         ex.getClass();
         ex.f(false);
         ex.f(1.5F);  
    }
}
