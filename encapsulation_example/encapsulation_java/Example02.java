package encapsulation_example.encapsulation_java;

class EncapsulExam {
    int height, weight;

    EncapsulExam(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void shapeArea() {
        int area = height * weight;
        System.out.println(area);
    }
}

public class Example02 {
    public static void main(String args[]) {
        EncapsulExam OB1 = new EncapsulExam(20, 30);
        OB1.shapeArea();
    }
}
