package type_information.Interfaces_and_type_information;

interface InterfaceThreeA3 {
    void f();
}

class AnonymousA {
    public static InterfaceThreeA3 makeA(){
        return new InterfaceThreeA3(){
            public void f(){System.out.println("public InterfaceThreeA3.f() show.");}
            public void g(){System.out.println("public InterfaceThreeA3.g() show.");}
            void h(){System.out.println("InterfaceThreeA3.h() show.");}
            protected void u(){System.out.println("protected InterfaceThreeA3.u() show.");}
            private void v(){System.out.println("private InterfaceThreeA3.v() show.");}
        };
    }
}

public class Example04 {
    public static void main(String[] args) throws Exception {
        InterfaceThreeA3 iTA3 = AnonymousA.makeA();
        iTA3.f();
        System.out.println(iTA3.getClass().getName());
        Example02.callHiddenMethod(iTA3, "g");
        Example02.callHiddenMethod(iTA3, "h");
        Example02.callHiddenMethod(iTA3, "u");
        Example02.callHiddenMethod(iTA3, "v");
    }
}
