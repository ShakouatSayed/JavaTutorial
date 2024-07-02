/* Exercise 25: (2) Create two interfaces and a class that implements both. Create two
generic methods, one whose argument parameter is bounded by the first interface and one
whose argument parameter is bounded by the second interface. Create an instance of the
class that implements both interfaces, and show that it can be used with both generic
methods.  */

package generics.Bounds;

    interface InterfaceOne {}
    interface InterfaceTwo {}

class ClassOne implements InterfaceOne, InterfaceTwo {
    public String toString() {
        return "ClassOne";
    }
}

public class Exercise25 {
    
    public <T extends InterfaceOne> void a(T t){System.out.println("a ("+t+")");}
    public <T extends InterfaceTwo> void b(T t){System.out.println("b ("+t+")");}

    public static void main(String[] args) {
        ClassOne cOne = new ClassOne();
        Exercise25 ex = new Exercise25();
        ex.a(cOne);
        ex.b(cOne);
    }
 
}
