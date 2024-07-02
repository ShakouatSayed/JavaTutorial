/*
 * How add Dropdown bottom in awt program java
 */

package problem_solving_question;

import java.awt.*;


public class AWTDropDownBottom {
    public static void main(String[] args) {
        Frame fram = new Frame("DropDown Bottom");

        Label label = new Label("Select the one posible item.");
        label.setVisible(true);
        fram.add(label);

        //String[] choice = {"Choice 1", "Choice 2", "Choice 3", "Choice 4", "Choice 5"};
        // final JComboBox<String> jcb = new JComboBox<String>(choice);
        // panel.add(jcb);
        // panel.setVisible(true);

        Choice choice = new Choice();
        choice.add("Choice 1");
        choice.add("Choice 2");
        choice.add("Choice 3");
        choice.add("Choice 4");
        choice.add("Choice 5");
        fram.add(choice);
        fram.setVisible(true);

        Button button = new Button("OKK");
        fram.setBounds(100, 150, 50, 80);
        fram.add(button);

        fram.setSize(400, 400);
        fram.setVisible(true);
    }
}
