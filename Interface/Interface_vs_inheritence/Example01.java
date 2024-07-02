package Interface_vs_inheritence;

interface InterFA1 {
    void med1();
}

interface InterFB2 {
    void med2();
}

class Example001 implements InterFA1, InterFB2 {
    @Override
    public void med1() {
        System.out.println("This the first interface method1.");
    }

    @Override
    public void med2() {
        System.out.println("This is the method2 of interface 2.");
    }

}

class Example01 {
    public static void main(String[] arg) {
        Example001 OB = new Example001();
        OB.med1();
        OB.med2();
    }
}