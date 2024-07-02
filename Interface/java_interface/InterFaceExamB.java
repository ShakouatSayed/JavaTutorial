package java_interface;

interface InterFA {
    final int num = 10;

    default void display() {
        System.out.println("This the int interface body.");
    }
}

public class InterFaceExamB implements InterFA {
    public static void main(String args[]) {
        InterFaceExamB OB1 = new InterFaceExamB();
        OB1.display();
    }

}
