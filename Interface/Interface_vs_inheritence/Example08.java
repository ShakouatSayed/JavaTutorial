/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_vs_inheritence;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
interface Interf2 {

    void method1();
}

interface Interf3 extends Interf2 {

//    abstract class A1 {
//
//        int a = 10;
//
//        abstract void method02();
//    }
//
//    abstract class B01 extends A1 {
//
//    }
    public static abstract class A1 {

        int a = 10;

        abstract void method02();
    }

    void method2();
}

abstract class TestInterface implements Interf3 {

    @Override
    public void method1() {
        System.out.println("This is the method1 function of TestInterFace class ");
    }

    @Override
    public void method2() {
        System.out.println("This is the method2 function of TestInterFace class ");
    }

}

class Example08 extends TestInterface {

    void method02() {
        //System.out.println(a );
        System.out.println("This is the abstract method01 function of TestInterFace class ");
    }

    public static void main(String args[]) {
        Example08 OB1 = new Example08();
        OB1.method1();
        OB1.method2();
        OB1.method02();

    }
}
