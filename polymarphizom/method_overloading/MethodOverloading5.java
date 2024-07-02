package polymarphizom.method_overloading;

class Helper {
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloading5 {
    public static void main(String args[]) {
        Helper O = new Helper();
        int a = O.multiply(10, 20);
        double b = O.multiply(23.1, 54.63);

        System.out.println(a);
        System.out.println(String.format("%.2f", b));

    }
}
