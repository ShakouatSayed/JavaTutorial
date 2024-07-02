package type_information.Interfaces_and_type_information;

import java.lang.reflect.Method;

interface InterfaceOneA1 {
    void f();
}

class ClassOneA2 implements InterfaceOneA1 {
    public void f() {
        System.out.println("public C.f() show.");
    }

    public void g() {
        System.out.println("public C.g() show.");
    }

    void u() {
        System.out.println("package C.u() show.");
    }

    protected void v() {
        System.out.println("protected C.v() show.");
    }

    private void w() {
        System.out.println("private C.w() show.");
    }
}

class HiddenC {
    public static InterfaceOneA1 makeA() {
        return new ClassOneA2();
    }
}


public class Example02 {

    static void callHiddenMethod(Object a1, String methodName) throws Exception{
        Method g = a1.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a1);
        
    }
    public static void main(String[] args) throws Exception {
        InterfaceOneA1 a1 = HiddenC.makeA();
        a1.f();
        
        System.out.println(a1.getClass().getName());
        //complie error: cannot find symbol 'C'
        /* if(a1 instanceof A2){
            A2 a2 = (A2) a1;
            a2.f();
            a2.g();
            a2.u();
            a2.v();
        } */

        //Opps! Reflection still allows us to call g()
        callHiddenMethod(a1, "g");
        //all even method that are less accessible
        callHiddenMethod(a1, "u");
        callHiddenMethod(a1, "v");
        callHiddenMethod(a1, "w");   
    }
}
