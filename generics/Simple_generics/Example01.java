package generics.Simple_generics;

// the generics implement is parameterized type, allaw multiple type.
// generics is create container class
// and holding object
// and container in depth.

class AutoMobile {}

/* class Holder1 {
    private AutoMobile a;
    public Holder1(AutoMobile a) {this.a = a;}
     void set(AutoMobile a){this.a = a;}
     AutoMobile get() {return a;}
} */

public class Example01 {
    private Object o;
    public Example01(Object o){this.o = o;}
    public void set(Object o){this.o = o;}
    public Object get(){return o;}
 

    public static void main(String args[]) {
        Example01 ex = new Example01(new AutoMobile());
        
        //AutoMobile a = (AutoMobile)ex.get();
        //System.out.println(a);

        ex.set("This is the Auto Mobile.");
        String s = (String)ex.get();
        System.out.println(s);

        ex.set(1);
        Integer i = (Integer)ex.get();
        System.out.println(i);
    }
}
