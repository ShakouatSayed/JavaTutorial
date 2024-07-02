/* Exercise 11: (1) Test New.java by creating your own classes and ensuring that New will
work properly with them.  */

package generics.generic_methods.leveraging_type_argument_inference;

import java.util.*;

class A{public String toString(){return "A";}}
class B{public String toString(){return "B";}}
class C extends B{public String toString(){return "C";}}

public class Exercise11 {
   
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        List<C> lC = Example01.list();
        lC.add(new C());

        Map<A, List<? extends B>> mAB= Example01.map();
        mAB.put(a, lC);

        LinkedList <B> lListB = Example01.lList();
        lListB.add(new B());

        Set<A> sA = Example01.set();
        sA.add(new A());

        Queue <B> qB = Example01.queue();
        qB.add(new B());
        //AnotherNew<Integer, String> a = Exercise11.anotherNew();
        System.out.println(lC);
        System.out.println(lListB);
        System.out.println(sA);
        System.out.println(mAB);
        System.out.println(qB);
    }
}
