/* . How to compare 2 string in java Program */
package problem_solving_question;

public class CompareTwoStr {
    public static void main(String[] args) {
        System.out.println("\nCompare the two String\n");
        String str = "Shakouat Hossen Sayed";
        String str1 = "Shakouat Hossain Sayed . I'm a boy.";

        boolean result = str == str1;
        if (result)
            System.out.println("String one and String two will be same.");
        else
            System.out.println("String one and String two will not be same.");
    }
}
