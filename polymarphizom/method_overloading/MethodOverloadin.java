package polymarphizom.method_overloading;

class Distric {
    void which() {
        System.out.println("Cox'sBazar");
    }
}

class Thana extends Distric {
    void which() {
        System.out.println("Chiringha...");
    }
}

class Village extends Distric {
    void which() {
        System.out.println("Bathakhali.....");
    }
}

public class MethodOverloadin {
    public static void main(String args[]) {
        Distric o1 = new Distric();
        Distric o2 = new Thana();
        Distric o3 = new Village();
        o1.which();
        o2.which();
        o3.which();
    }
}
