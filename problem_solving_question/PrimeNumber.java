/* Print prime no Program in java */
package problem_solving_question;
/* 
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Print Prime Number.");
        int num, i;
        //String primeNumbers = " ";
        for( i = 1; i < 100; i++){
            int counter = 0;
            for( num = i; num >= 1; num--){
                if(i % num == 0){
                    counter = counter + 1;
                }
            }
            if(counter == 2){
                //primeNumbers = primeNumbers + i + " ";
                System.out.print(i + " ");
            }
        }
        
    }
} */

/**
 * PrimeNumber
 */
/* public class PrimeNumber {

    // check prime or not
    public static void main(String[] args) {
        int num = 56;
        int i = 2;
        boolean result = false;
        while (i <= num / 2) {
            if (num % i == 0) {
                result = true;
                break;
            }
            i++;
        }
        if (!result)
            System.out.println(num + "This number is prime number.");
        else
            System.out.println("this number is not prime number.");
    }
}
 */

 /**
  * PrimeNumber
  */
 public class PrimeNumber {
 
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i++ = " + i++);
        System.out.println("i = " +i);
        System.out.println("++i = "+ ++i);
        System.out.println("i = "+i);
        System.out.println("i-- = "+i--);
        System.out.println("i = "+i);
        System.out.println("--i = " + --i);
        System.out.println("i = "+i);
    }
 }