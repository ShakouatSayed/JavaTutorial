package interFace_inheritance;

class A {
    public void animal() {
        System.out.println("This class is animal....");
    }
}

public class Example02 extends A {
    public static void main(String args[]) {
        A OB1 = new A();
        OB1.animal();
    }
}
