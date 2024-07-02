/* Check Given No is palindrome or Not in java
Program */
package problem_solving_question;

import java.util.Scanner;

/* public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the palindrom number.");

        String str = "Shakouat", reverse = "";
        int length = str.length();

        // 1234321
        // for(int i = 1;i < 10; i++){
        for (int j = length - 1; j > 0; j--)
            reverse = reverse + str.charAt(j);
        if (str.equals(reverse))
            System.out.println("This String is Palindrom.");
        else
            System.out.println("This string are not palindrom.");

        // }
    }
}
 */

/**
 * CheckPalindrom
 */
/* public class CheckPalindrom {

    public static void main(String[] args) {
        // Check the palindrom
        String str = "geeg";
        int length = str.length(), i;
        int began = 0;
        int end = length - 1;
        int middle = (began + end) / 2;

        for (i = began; i <= end; i++) {
            if (str.charAt(began) == str.charAt(end)) {
                began++;
                end--;
            } else
                break;
        }

        if (i == middle + 1)
            System.out.println("palindrom");
        else
            System.out.println("not palindrom.");
    }
} */

/**
 * CheckPalindrom
 */
public class CheckPalindrom {
    public static void main(String[] args) {
        System.out.println("Check this number Palindrom or not palindrom.");
        int num = 3553, originalNum = num;
        int reserveNum = 0;

        while (num != 0) {
            int remainder = num % 10;
            reserveNum = reserveNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reserveNum)
            System.out.println(originalNum+" is palindrom");
        else 
            System.out.println(originalNum+" is not palindrom");
    }
}