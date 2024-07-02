package polymarphizom.polymarphizom_abstraction;

class DataMember {
    int a = 20;
    // void print() {
    // System.out.println("This the first and super class.");
    // }
}

class DataMember1 extends DataMember {
    int a = 30;
    // void print() {
    // System.out.println("This the first and sub class.");
    // }
}

public class RunTimePolymorphismDataMember {
    public static void main(String args[]) {
        DataMember O = new DataMember1();
        // Data member assced DataMember class will be accessed.
        System.out.println(O.a);
        // O.print();
    }
}