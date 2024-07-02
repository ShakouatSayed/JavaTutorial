/* How to convert all char in string lower case
in java Program */

package problem_solving_question;

public class LowerToUpper {
    public static void main(String[] args) {
        String str = "my name is shakouat hossen sayed. i also loved in software engenieering";
        System.out.println("The lower case string is: "+str);
        String str1 = str.toUpperCase();
        System.out.print("This string lower case to upper case: ");
        System.out.println(str1);
        System.out.println("\nThe upper case string is: "+str1);
        System.out.println("This string Upper case to lower case: "+str1.toLowerCase());
    }
}
