/* How to swap 2 no without using 3rd variable
Program in java */
package problem_solving_question;

public class SwapTwoVariable {
    public static void main(String[] args) {
        int a = -9, b = 20;
         a = a + b;
         b = a - b;
         a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
