package polymarphizom.polymarphizom_abstraction;

class RunTimePolyA {
    void print() {
        System.out.println("This includ the Run time Polymorphism 01");
    }
}

class RunTimePolyB extends RunTimePolyA {
    void print() {
        System.out.println("This includ the Run time Polymorphism 02");
    }
}

class RunTimePolyC extends RunTimePolyA {
    void print() {
        System.out.println("This includ the Run time Polymorphism 03");
    }
}

public class RunTimePolyMarphiomGFG {
    public static void main(String args[]) {
        RunTimePolyA O = new RunTimePolyA();

        RunTimePolyB O1 = new RunTimePolyB();

        RunTimePolyC O2 = new RunTimePolyC();
        RunTimePolyA ref;
        ref = O;
        ref.print();
        ref = O1;
        ref.print();
        ref = O2;
        ref.print();
    }
}
