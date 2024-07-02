/* How to replace string with another string in
java Program */
package problem_solving_question;

public class ReplaceString {
    public static void main(String[] args) {
        System.out.println("\nReplace the String\n");
        String str = "Shakouat Hossen Sayed is good boy. Shakouat Hossen playing the football. In sunday Shakouat Hossen show the football match";
        String str1 = str.replaceAll("Shakouat", "Sakhawat");
        System.out.println(str1);
    }
}
