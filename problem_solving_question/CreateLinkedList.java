/*How to create linked list program in java */

package problem_solving_question;

import java.util.LinkedList;
import java.util.ListIterator;

public class CreateLinkedList {
    int number_of_animal;
    String animal_name;

    public CreateLinkedList(int number_of_animal, String animal_name) {
        this.number_of_animal = number_of_animal;
        this.animal_name = animal_name;
    }

    public static void main(String[] args) {
        CreateLinkedList cli1 = new CreateLinkedList(10, "Lion");
        CreateLinkedList cli2 = new CreateLinkedList(50, "Tiger");
        CreateLinkedList cli3 = new CreateLinkedList(100, "Rabit");
        CreateLinkedList cli4 = new CreateLinkedList(110, "Fox");
        CreateLinkedList cli5 = new CreateLinkedList(500, "Dock");
        LinkedList<CreateLinkedList> cli = new LinkedList<CreateLinkedList>();
        cli.add(cli1);
        cli.add(cli2);
        cli.add(cli3);
        cli.add(cli4);
        cli.add(cli5);

        for (CreateLinkedList cList : cli) {
            System.out.println(
                    "Number of animal: " + cList.number_of_animal + "\n" + "Animal name: " + cList.animal_name + "\n");
        }

        ListIterator<CreateLinkedList> li = cli.listIterator();
        while (li.hasNext()) {
            CreateLinkedList ls = (CreateLinkedList)li.next();
            System.out.println(ls.animal_name+" -------- "+ls.number_of_animal);
        }
    }
}