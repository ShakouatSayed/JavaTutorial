/* How to string width with specific char in
java Program */
package problem_solving_question;

public class WidthSpecificChar {
    public static void main(String[] args) {
        System.out.println("Width with Specific Char.");
        String str = "Shakouat Hossen ";

        System.out.println(str.charAt(2));
        System.out.println(str.repeat(3));
        System.out.println(str.endsWith("sen"));
        System.out.println(str.endsWith(" "));
        System.out.println(str.startsWith("s"));
        System.out.println(str.startsWith("Shakouat"));
    }    
}
