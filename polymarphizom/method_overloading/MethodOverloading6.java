package polymarphizom.method_overloading;

class HelperA {
    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class MethodOverloading6 {
    public static void main(String args[]) {
        HelperA B = new HelperA();
        int a = B.multiply(4, 4, 6);
        int b = B.multiply(7, 7);
        System.out.println(a);
        System.out.println(b);
    }
}
