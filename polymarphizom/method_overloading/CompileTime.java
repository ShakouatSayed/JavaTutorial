package polymarphizom.method_overloading;

class CompileTime0A {
    public int add(int a, int b) {
        return a + b;
    }
}

class CompileTime0B extends CompileTime0A {
    public double add(double a, double b) {
        return a + b;
    }
}

public class CompileTime {
    public static void main(String args[]) {
        CompileTime0B OB = new CompileTime0B();
        System.out.println(OB.add(10, 20));
        System.out.println(OB.add(10.2, 2.9));
    }
}
