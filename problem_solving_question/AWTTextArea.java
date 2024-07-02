/*How to add text area  program in java.*/

package problem_solving_question;

import java.awt.*;

public class AWTTextArea {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Text area");
        ///JFrame j_frame = new JFrame("AWT Text area");
        TextArea text_area = new TextArea();
        text_area.setBounds(50, 50, 300 , 300);
        
        frame.add(text_area);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
