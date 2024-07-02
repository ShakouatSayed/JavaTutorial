/* How to split string in java Program */
package problem_solving_question;

public class SplitMethod {
    public static void main(String[] args) {
        System.out.println("Split the name.");
        String str = "Shakouat Hossen Sayed. This name is unrear";
        String s1[] = str.split("\\h");
        for (String s : s1) {
            System.out.print(s);
        } 
        //System.out.println(str.split(" \\s"));
    }
}
