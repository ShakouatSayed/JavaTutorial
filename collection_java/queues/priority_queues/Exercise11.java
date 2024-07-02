/* Exercise 11: (2) Create a class that contains an Integer that is initialized to a value
between o and 100 using java.util.Random. Implement Comparable using this Integer
field. Fill a PriorityQueue with objects of your class, and extract the values using poll( ) to
show that it produces the expected order. */

package collection_java.queues.priority_queues;
import java.util.*;

class Comp implements Comparable<Comp> {
    Random rand = new Random();
    Integer i = rand.nextInt(100);

    public int compareTo(Comp arg) {
        return this.i < arg.i ? -1 : (this.i < arg.i ? 0 : 1);
    }
    public String toString() {
        return Integer.toString(i);
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        Queue<Comp> queue = new PriorityQueue<>();
        for (int i = 0; i <= 10; i++) {
            queue.offer(new Comp());
        }
        while ((queue.peek() != null)) {
            System.out.print(queue.poll() + ", ");
        }
    }
}