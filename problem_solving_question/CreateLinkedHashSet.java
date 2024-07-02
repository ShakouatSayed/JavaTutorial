/* How to create LinkedHashSet program in java*/

package problem_solving_question;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CreateLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("WebSite.Class");
        lhs.add("Games.Class");
        lhs.add("Application.Class");
        lhs.add("Software.Class");
        lhs.add("Network.Class");

        //print the element
        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //print the value use the another element
        while (!lhs.isEmpty()) {
            System.out.println(lhs.isEmpty());
        }
    }
}
