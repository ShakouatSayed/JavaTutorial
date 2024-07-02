package polymarphizom.polymarphizom_abstraction;

class RunTimePolyA1 {
    void print() {
        System.out.println("This the method 01");
    }
}

public class RunTimePolymorphism extends RunTimePolyA1 {
    void print() {
        System.out.println("This is the method 02");
    }

    public static void main(String args[]) {
        RunTimePolyA1 OB = new RunTimePolymorphism();
        OB.print();
    }
}
