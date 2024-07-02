package polymarphizom.polymarphizom_abstraction;

abstract class A01 {
    abstract void show();
}

class B extends A01 {
    void show() {
        System.out.println("This is the Abstrac Example.");
    }

}

public class ExampleAbstrac1 {
    public static void main(String args[]) {
        B o = new B();
        o.show();
    }
}
