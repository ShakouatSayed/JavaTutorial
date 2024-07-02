/*how create ArrayList using List interface program in java*/

package problem_solving_question;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {
    int quantity;
    String fruits;

    public CreateArrayList (int quantity, String fruits){
        this.quantity = quantity;
        this.fruits = fruits;
    }
    public static void main(String[] args) {
        CreateArrayList cal1 = new CreateArrayList(20, "JackFruit");
        CreateArrayList cal2 = new CreateArrayList(5, "Dalim");
        CreateArrayList cal3 = new CreateArrayList(8, "Orange");
        CreateArrayList cal4 = new CreateArrayList(4, "Mango");
        CreateArrayList cal5 = new CreateArrayList(5, "Lichi");

        List<CreateArrayList> l = new ArrayList<CreateArrayList>();
        l.add(cal1);
        l.add(cal2);
        l.add(cal3);
        l.add(cal4);
        l.add(cal5);
        for (CreateArrayList c_l : l) {
            System.out.println("This food how many people : "+c_l.quantity+"\n"+"Fruit Name: "+c_l.fruits+"\n");
        }
    }
}