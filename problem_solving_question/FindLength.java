/* Find Length, Concatenate and Replace String in Java Program */

package problem_solving_question;

public class FindLength {
    public static void main(String[] args) {
        String str = "Shakouat Hossen Sayed.";
        System.out.println(" This String length is: "+str.length());
        System.out.println(" This String Concatenate is: "+str.concat(" He is a good boy."));
        System.out.println("This String Replace is: "+str.replace("Shakouat", "Sakhawat"));
    }
}
