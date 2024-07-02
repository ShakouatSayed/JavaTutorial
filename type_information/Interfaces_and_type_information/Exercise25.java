/* 
Exercise 25: (2) Create a class containing private, protected and package-access
methods. Write code to access these methods from outside of the class’s package.  
*/

package type_information.Interfaces_and_type_information;

import java.lang.reflect.Method;

interface InterfaceFourA4 {
    void f();
}

class InnerClassOneA2{
    private static class ClassThreeC3 implements InterfaceFourA4 {
        public void f() {
            System.out.println("public void InterfaceFourA4.f() show.");
        }
    
        private void g() {
            System.out.println("private void InterfaceFourA4.g() show.");
        }
    
        protected void h() {
            System.out.println("protected void InterfaceFourA4.h() show.");
        }
    }
    public static InterfaceFourA4 makeFiveA5(){
        return new ClassThreeC3();
    }
}

public class Exercise25 {

    static void callHiddenMethodTwo(Object oOne, String methodName) throws Exception{
        Method mOne = oOne.getClass().getDeclaredMethod(methodName);
        mOne.setAccessible(true);
        mOne.invoke(oOne);
    } 

    public static void main(String[] args) throws Exception {
        InterfaceFourA4 iFFA4 = InnerClassOneA2.makeFiveA5();
        iFFA4.f();
        System.out.println(iFFA4.getClass().getName());
        callHiddenMethodTwo(iFFA4, "g");
        callHiddenMethodTwo(iFFA4, "h");
    }
}
