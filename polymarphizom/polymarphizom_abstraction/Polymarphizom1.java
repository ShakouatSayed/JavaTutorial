package polymarphizom.polymarphizom_abstraction;

class Ploymar {
    int a, b, c;

    public void multiply(int x, int y) {
        a = x;
        b = y;
        System.out.println("Multiply by :" + (x * y));
    }

    public void multiply(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        System.out.println("Multiply by :" + (i * j * k));
    }

    public void print() {
        System.out.println(
                "This is the return type void and modifier is public and print method and parameter is empty.");
    }
}

class Polymarphizom1 extends Ploymar {
    public void print() {
        System.out.println(
                "This is the another one return type void and modifier is public and print method and parameter is empty.");
    }

    public static void main(String args[]) {
        // this is the method overloading
        Ploymar O1 = new Ploymar();
        O1.multiply(10, 3);
        O1.multiply(4, 34, 32);

        // this is the method overriding
        Polymarphizom1 a;
        a = new Polymarphizom1();
        a.print();
    }
}
