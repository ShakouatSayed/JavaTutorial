package java_interface;

interface InterFB {
    final int num = 10;

    static void display() {
        System.out.println("This is the Static keywoard variable.");
    }
}

public class InterfaceExamC implements InterFB {
    public static void main(String args[]) {
        InterFB.display();
    }
}
