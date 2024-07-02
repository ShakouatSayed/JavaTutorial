/* Print reverse string in java Program */
package problem_solving_question;

/* public class ReverseString {
    public static void main(String[] args) {
        String str = "Shakout", reverse = "";
        for (int i = str.length() -1; i >=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
} */

/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Shakouat Hossen Sayed.");
        String str  ;
        System.out.println(sb.reverse());
    }
}