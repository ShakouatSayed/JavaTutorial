package type_information.Interfaces_and_type_information;

/**
 * Example01
 */
interface A {
    void f();
}

interface A1{
    void f1();
}

class B implements A{
    public void f(){};
    public void g(){};
    
}

class C implements A1{
    public void f1(){};
    public void h(){};
}


public class Example01 {    
    public static void main(String[] args) {
        A a = new B();
        A1 a1 = new C();
        a.f();
        a1.f1();
        //a.g(); //there is compile error

        if(a instanceof B){
            B b = (B)a;
            b.g();
        }
        System.out.println(a.getClass().getSimpleName());

        if (a1 instanceof C){
            C c = (C)a1;
            c.h();
        }
               
        System.out.println(a1.getClass().getSimpleName());
    }
}