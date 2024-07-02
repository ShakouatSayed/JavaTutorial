package marker_interface;

class A implements Cloneable {
    int a;
    String s;
    double num;

    public A(int a, String s, double num) {
        this.a = a;
        this.s = s;
        this.num = num;
    }

    @Override
    public Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Example01 {
    public static void main(String args[])
            throws CloneNotSupportedException {
        A a = new A(20, "Shakouat Hossen Sayed", 420.12);
        A b = (A) a.clone();
        System.out.println(b.a);
        System.out.println(b.s);
        System.out.println(b.num);
    }
}
