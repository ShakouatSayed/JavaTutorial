package collection_java.queues.priority_queues;
import java.util.*;

public class ToDoList extends PriorityQueue<ToDoList.ToDoIteam>{
    static class ToDoIteam implements Comparable<ToDoIteam>{
        private String primary;
        private char secondry;
        private int iteam;
        public ToDoIteam(String pr, char se, int it){
            primary = pr;
            secondry = se;
            iteam = it;
        }
        public int compareTo(ToDoIteam arg) {
            return arg.secondry < 1 ? -1 : (arg.iteam < 1 ? 0 : 1);
        }
        public String toString(){
            return Character.toString(secondry)+iteam + " : "+primary;
        }
    }
    public void add(String pr, char se, int it){
        super.add(new ToDoIteam(pr, se, it));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Shakouat", 'A', 1);
        toDoList.add("Hossen", 'B', 2);
        toDoList.add("Sayed", 'C', 3);
        toDoList.add("Sakhawat", 'D', 4);
        toDoList.add("Hossain", 'E', 5);
        while (!toDoList.isEmpty()) {
            System.out.println(toDoList.remove()+" ");
        }
    }
}
