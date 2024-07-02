package polymarphizom.polymarphizom_abstraction;

abstract class A {

    void print() {
        System.out.println("x");
        System.out.println("y");
    }

    abstract void show();
}

public class ExampleAbstrac extends A {
    int a, b;

    void keep(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("X: " + a);
        System.out.println("Y: " + b);
    }

    void show() {
        System.out.println("Revoke......");
    }

    public static void main(String args[]) {

        ExampleAbstrac object = new ExampleAbstrac();
        object.print();
        object.keep(10, 20);
        object.show();
    }
}
