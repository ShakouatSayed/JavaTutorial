/*How to create swing program in java*/
package problem_solving_question;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CreateJFrame {
    public CreateJFrame(){
        JFrame j = new JFrame("Show the output.");
        j.setSize(400, 400);
        JButton jb = new JButton("Clack");
        jb.setBounds(130, 100, 100, 50);
        j.add(jb);
        j.setSize(400, 400);
        j.setLayout(null);
        j.setVisible(true);
    }
    public static void main(String[] args) {
        new CreateJFrame();
    }
}
