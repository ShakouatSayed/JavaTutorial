/* Exercise 7: (4) Create both an ArrayList and a LinkedList, and fill each using the
Countries.names( ) generator. Print each list using an ordinary Iterator, then insert one
list into the other by using a Listlterator, inserting at every other location. Now perform the
insertion starting at the end of the first list and moving backward.  */

package collection_java.list_functionality;

import java.util.*;
import collection_java.filling_containers.using_abstract_classes.Countries;
/**
 * Exercise07
 */
public class Exercise07 {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>(Countries.FlyWeightMap.names(6));
        List<String> ll = new LinkedList<>(Countries.FlyWeightMap.names(6));
        System.out.println("Array List : "+al);
        System.out.println("Linked List : "+ll);
        Iterator<String> alit = al.iterator();
        while (alit.hasNext()) {
            alit.next();
        }

        Iterator<String> llit = ll.iterator();
        while (llit.hasNext()) {
            llit.next();
        }

        ListIterator<String> allit = al.listIterator();
        ListIterator<String> lllit = ll.listIterator();
        while (lllit.hasNext()) {
            allit.add(lllit.next());
            allit.next();
        }

        System.out.println(al);
/*         List<String> ll2it = new LinkedList<>(Countries.FlyWeightMap.names(6));
        ListIterator<String> lll2it = ll2it.listIterator();
        while (lllit.hasPrevious()) {lllit.previous();}
        while (lll2it.hasNext()) {
            lll2it.next();
        }

        while(lllit.hasNext()) {
            lll2it.add(lllit.next());
            lll2it.previous();
            lll2it.previous();
        }
        System.out.println(ll2it); */

        List<String> alit2 = new ArrayList<>(Countries.FlyWeightMap.names(6));
        ListIterator<String> allit2 = alit2.listIterator();
        while (lllit.hasPrevious()) {
            lllit.previous();
        }
        while (allit2.hasNext()) {
            allit2.next();
        }
        while (lllit.hasNext()) {
            allit2.add(lllit.next());
            allit2.previous();
            allit2.previous();
        }
        System.out.println(alit2);
    }
}