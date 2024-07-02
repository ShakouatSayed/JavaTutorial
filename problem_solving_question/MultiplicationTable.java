/* Print Multiplication table Program in java */
package problem_solving_question;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i, num = 5;
        System.out.println("Multiplication Table: ");
        for(i = 0; i <= 10; i++){
            int result = num * i;
            System.out.println(num+" * "+i+" =   "+result);
        }
    }
}
