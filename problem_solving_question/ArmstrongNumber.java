/* Check no is Armstrong or not in java
Program */
package problem_solving_question;

/* public class ArmstrongNumber {
    public static int power(int n, int digit) {
        int p = 1;
        for (int i = 0; i < digit; i++) {
            p = p * n;
        }
        return p;
    }

    public static void main(String[] args) {
        // check number is armstrong
        // 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634
        // 1^3 + 5^3 + 3^3 = 153
        int num = 1634, reminder, temp;
        int index = 0, sum = 0;

            temp = num;
            while (temp != 0) {
                index++;
                temp = temp / 10;
            }

            temp = num;
            while (temp != 0) {
                reminder = temp % 10;
                sum = sum + power(reminder, index);
                temp /= 10;
            }
            if (sum == num)
                System.out.println(num + " this is Armstrong number.");
        }
} */


/**
 * ArmstrongNumber
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        int n, count = 0, sum = 0, a;
        System.out.println("1 to 2000 armstron number is: ");
        for(int i = 0; i < 3000; i++){
            n = i;
            while(n > 0){
                a = n % 10;
                sum = sum +  (a * a * a);
                n = n / 10;
            }

            if(sum == i){
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}