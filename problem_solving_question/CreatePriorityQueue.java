/*
 * How to create a priority queue in java program.
 */

package problem_solving_question;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class CreatePriorityQueue {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<String>();
        pq.add("Chili");
        pq.add("Tometo");
        pq.add("Carrot");
        pq.add("Patoto.");

        //using the iterator 
        Iterator itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //removing the iterator value
        pq.remove();
        System.out.println(pq);

        //print another value 
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}