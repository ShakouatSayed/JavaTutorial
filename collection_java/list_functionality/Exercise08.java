
/* Exercise 8: (7) Create a generic, singly linked list class called SList, which, to keep
things simple, does not implement the List interface. Each Link object in the list should
contain a reference to the next element in the list, but not the previous one (LinkedList,
 in contrast, is a doubly linked list, which means it maintains links in both directions). 
Create your own SListIterator which, again for simplicity,
 does not implement ListIterator. The
only method in SList other than toString( ) should be iterator( ), which produces an
SListIterator. The only way to insert and remove elements from an SList is through
SListIterator. Write code to demonstrate SList.  */

package collection_java.list_functionality;

/**
 * Exercise08
 */

class Link<T> {
    T t;
    Link<T> next;

    Link(T t) {
        this(t, null);
    }

    Link(T t, Link<T> next) {
        this.t = t;
        this.next = next;
    }

    public String toString() {
        if (t == null)
            return "null";
        return t.toString();
    }
}

class SListIterator<T> {
    Link<T> current;

    SListIterator(Link<T> next) {
        current = next;
    }

    public Link<T> next() {
        current = current.next;
        return current;
    }

    public boolean hasNext() {
        return (current.next != null);
    }

    public void add(T t) {
        current.next = new Link<T>(t, current.next);
    }

    public void remove() {
        if (current.next != null)
            current.next = current.next.next;
    }
}

class SList<T> {
    Link<T> sList = new Link<>(null);

    public SListIterator<T> iterator() {
        return new SListIterator<>(sList);
    }

    public String toString() {
        if (sList.next == null)
            return "[]";
        System.out.print("[");
        SListIterator<T> sListIterator = this.iterator();
        StringBuilder sb = new StringBuilder();
        while(sListIterator.hasNext()) {
            sb.append(sListIterator.next() + (sListIterator.hasNext() ? "," : ""));
        }
        return sb + "]";
    }
}

public class Exercise08 {
    public static void main(String[] args) {
        SList<String> sList = new SList<>();
        SListIterator<String> sListIterator = sList.iterator();
        sListIterator.add("one");
        System.out.println(sList);
        sListIterator.next();
        sListIterator.add("two");
        System.out.println(sList);
        System.out.println(sListIterator.hasNext());
        System.out.println(sListIterator.next());
        System.out.println(sListIterator.hasNext());
        System.out.println(sListIterator.next());

        SList<Integer> sList2 = new SList<>();
        SListIterator<Integer> sListIterator2 = sList2.iterator();
        for (int i = 0; i < 5; i++) {
            sListIterator2.add(i);
            sListIterator2.next();
        }
        System.out.println(sList2);
        SListIterator<Integer> sListIterator3 = sList2.iterator();
        sListIterator3.remove();
        System.out.println(sList2);
        while (sListIterator3.hasNext()) {
            sListIterator3.remove();
        }
        System.out.println(sList2);
    }
}