package polymarphizom.method_overloading;

class A {
    int a, b;

    A(int a, int b) {
        this.a = a;
        this.b = b;

    }

    void add() {
        int i = a + b;
        System.out.println("Sum of a + b: " + i);
    }
}

class B extends A {
    int j;

    B(int a, int b, int c) {
        super(a, b);
        j = a + b + c;
    }

    void add() {
        super.add();
        super.add();
        System.out.println("Sum of a + b + c: " + j);
    }
}

class MethodObverloading {
    public static void main(String args[]) {
        B object = new B(10, 20, 30);
        object.add();
    }
}
