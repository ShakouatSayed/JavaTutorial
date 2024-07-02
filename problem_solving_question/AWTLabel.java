// // /*How to add label in awit program in Java */

package problem_solving_question;

import java.awt.*;

public class AWTLabel extends Frame {
    public AWTLabel() {

        Label firstName = new Label("First Name: ");
        firstName.setBounds(20, 50, 80, 20);

        Label lastName = new Label("Last Name: ");
        lastName.setBounds(20, 80, 80, 20);

        // Label dob = new Label("Date of Birth");
        // dob.setBounds(20, 110, 80, 20);

        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 200, 20);

        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 200, 20);

        // TextField dobTF = new TextField();
        // dobTF.setBounds(120, 110, 100, 20);

        Button sbmt = new Button("Submit");
        sbmt.setBounds(120, 160, 100, 30);

        Button reset = new Button("Reset");
        reset.setBounds(120, 160, 100, 30);

        add(firstName);
        add(lastName);
        // add(dob);
        add(firstNameTF);
        add(lastNameTF);
        // add(dobTF);
        add(sbmt);
        // add(reset);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AWTLabel awt = new AWTLabel();
    }
}

// import java.awt.*;

// public class AWTLabel {
// public static void main(String[] args) {
// Frame frame = new Frame();
// Panel panel = new Panel();
// frame.add(panel);

// Label sign_in = new Label("Sign IN: ");
// panel.setBounds(20, 50, 80, 20);
// panel.setVisible(true);

// Label password = new Label("Password: ");
// panel.setBounds(20, 80, 80, 20);
// panel.setVisible(true);

// TextField sign_text_field = new TextField();
// panel.setBounds(120, 50, 100, 20);
// panel.setVisible(true);

// TextField pass_text_field = new TextField();
// panel.setBounds(120, 80, 100, 20);
// panel.setVisible(true);

// Button bottom = new Button("Submit");
// panel.setBounds(20, 160, 100, 30);
// panel.setVisible(true);

// panel.add(sign_in);
// panel.add(password);
// panel.add(sign_text_field);
// panel.add(pass_text_field);
// panel.add(bottom);

// frame.setSize(400, 400);
// frame.setLayout(null);
// frame.setVisible(true);
// }
// }
