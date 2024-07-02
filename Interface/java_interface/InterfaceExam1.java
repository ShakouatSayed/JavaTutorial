package java_interface;

interface Bank {
    void deposite();

    void widdrow();

    void loan();

    void account();

}

class InterfaceExam1 implements Bank {
    public void deposite() {
        System.out.println("This bank account is lots of mony diposite 100 $.");
    }

    abstract class Clas1 extends InterfaceExam1 {

    }

    public void widdrow() {
        System.out.println("This bank account is lots of money widdrow 50$.");
    }

    public void loan() {
    };

    public void account() {
    };

    public static void main(String args[]) {
        InterfaceExam1 OB1 = new InterfaceExam1();
        OB1.deposite();
        OB1.widdrow();
    }

}
