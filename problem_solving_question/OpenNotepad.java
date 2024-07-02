/*How to open notepad in java Program.*/

package problem_solving_question;

import java.io.IOException;

/**
 * OpenNotepad
 */
public class OpenNotepad {

    public static void main(String[] args) {
        System.out.println("\nShakouat Hossen Sayed.\n");
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Catch the error." +e);
        }
    }
}