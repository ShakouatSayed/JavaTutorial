package java_interface;

interface Sayed {
    void method1();

    void method2();
}

interface InterFC extends Sayed {
    void method3();
}

class InterfaceD implements InterFC {
    public void method1() {
        System.out.println("This is the method 1.");
    }

    public void method2() {
        System.out.println("This is the method 2.");
    }

    public void method3() {
        System.out.println("This is the method 3.");
    }
}

public class InterfaceExamD {
    public static void main(String args[]) {
        InterfaceD OB1 = new InterfaceD();
        OB1.method1();
        OB1.method2();
        OB1.method3();
    }
}