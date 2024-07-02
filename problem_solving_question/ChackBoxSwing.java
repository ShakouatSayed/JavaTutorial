/*How to add checkbox in swing program in java */
package problem_solving_question;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class ChackBoxSwing {

    public ChackBoxSwing() {
        JFrame f = new JFrame("Check Box Swing.");
        JCheckBox check_box1 = new JCheckBox("C++ Programming");
        check_box1.setBounds(100, 150, 150, 50);
        JCheckBox check_box2 = new JCheckBox("Java Programming");
        check_box2.setBounds(100, 100, 150, 50);
        f.add(check_box1);
        f.add(check_box2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ChackBoxSwing();
    }
}
