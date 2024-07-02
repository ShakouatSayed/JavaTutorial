/* How to create a tree set program in java */

package problem_solving_question;

import java.util.Iterator;
import java.util.TreeSet;

public class CreateTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        //add the value in tree set
        ts.add(10);
        ts.add(20);
        ts.add(8);
        ts.add(18);
        ts.add(15);

        //remove the tree set value
        ts.remove(ts.pollFirst());
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}