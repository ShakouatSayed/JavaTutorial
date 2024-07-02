package polymarphizom.method_overloading;

class Parent {
    void print() {
        System.out.println("This the main class........");
    }
}

class SubType1 extends Parent {
    void print() {
        System.out.println("This the SubTypes class........");
    }
}

class SubTypes2 extends Parent {
    void print() {
        System.out.println("This the Sub types2 class........");
    }
}

public class MethodOverride {
    public static void main(String args[]) {
        Parent a;
        a = new SubType1();
        a.print();

        Parent b;
        b = new SubTypes2();
        b.print();

    }
}
