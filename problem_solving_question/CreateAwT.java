/*How to create awt program in java */

package problem_solving_question;
import java.awt.*;

public class CreateAwT {
    public static void main(String[] args) {
        Frame frame = new Frame("Create Awt");
        Panel panel = new Panel();
        frame.add(panel);

       //Label label1 = new Label("Sign in: ");
        // frame.setBounds(150, 150, 100, 100);
       //frame.add(label1);

        // Label label2 = new Label("Password: ");
        // frame.setBounds(150, 150, 100, 100);
        // frame.add(label2);

        // Button button = new Button("Submit");
        // panel.add(button);

        Button button1 = new Button("Submit");
        panel.setBounds(150, 150, 100, 100);
        panel.add(button1);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }    
}
