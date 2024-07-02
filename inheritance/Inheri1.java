package inheritance;

class Inheri {
    int a, b;

    public void add(int x, int y) {
        a = x;
        b = y;
        System.out.println("The sum of : " + (a + b));
    }
}

class Inher extends Inheri {
    public void sum(int x, int y) {
        add(x, y);
    }

    public static void main(String args[]) {
        Inher B1 = new Inher();
        B1.sum(10, 20);
        Inheri A = new Inheri();
        A.add(20, 50);
    }
}
