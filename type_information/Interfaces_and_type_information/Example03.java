package type_information.Interfaces_and_type_information;

import java.lang.reflect.Method;

interface InterfaceA2{
    void f();

}

class InnerA{
    private static class ClassA3 implements InterfaceA2{
        public void f(){
            System.out.println("public C1.f() show.");
        }
        public void g(){
            System.out.println("public C1.g() show.");
        }
        void h(){
            System.out.println("public C1.h() show.");
        }
        protected void i(){
            System.out.println("public C1.i() show.");
        }
        private void j(){
            System.out.println("public C1.j() show.");
        }
    }
    public static InterfaceA2 makeA2(){
        return new ClassA3();
    }
}

public class Example03  {

    /* static void callHiddenMethodOne(Object a2, String methodName) throws Exception{
        Method g1 = a2.getClass().getDeclaredMethod(methodName);
        g1.setAccessible(true);
        g1.invoke(g1);
    } */

    public static void main(String[] args) throws Exception {
        InterfaceA2 a2 = InnerA.makeA2();
        a2.f();
        System.out.println(a2.getClass().getName());
        Example02.callHiddenMethod(a2, "g");
        Example02.callHiddenMethod(a2, "h");
        Example02.callHiddenMethod(a2, "i");
        Example02.callHiddenMethod(a2, "j");
        //Example02.callHiddenMethod(a2, "j");
    }
}
