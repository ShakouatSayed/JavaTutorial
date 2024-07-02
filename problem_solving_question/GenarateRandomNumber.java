/* How to Generate random number in java
Program */

package problem_solving_question;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* public class GenarateRandomNumber {
    public static void main(String[] args) {
        System.out.println("Create the random number: ");
        //declear the random object
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            System.out.println(random.nextInt(50));
        }
    }
} */

/**
 * GenarateRandomNumber
 */
/* public class GenarateRandomNumber {

    // method that genarates a strem of integer having size 5
    public static void randomInts(int num) {
        Random random = new Random();
        random.ints(num).forEach(System.out::println);
    }

    // method that genarates a strem of 9 integer between 50 to 90
    public static void randomInts(int num, int origin, int bound) {
        Random random1 = new Random();
        random1.ints(num, origin, bound).forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Shakouat Hossen Sayed.");
        randomInts(20);
        randomInts(9, 50, 90);
    }
}
 */

 /**
  * GenarateRandomNumber
  */
 public class GenarateRandomNumber {
 
    public static void main(String[] args) {
        System.out.println("Shakouat Hossen Sayed.");
        
        // Genarate Random Number in the int value
        System.out.println("\nRandom Generate Integer Value: ");
        int a = ThreadLocalRandom.current().nextInt();
        int b = ThreadLocalRandom.current().nextInt();

        System.out.println("Random vaule is: "+a);
        System.out.println("Random vaule is: "+b);

        // Genarate Random Number in the float value
        System.out.println("\nRandom Generate Float Value: ");
        float c = ThreadLocalRandom.current().nextFloat();
        float d = ThreadLocalRandom.current().nextFloat();

        System.out.println("Random vaule is: "+c);
        System.out.println("Random vaule is: "+d);

        // Genarate Random Number in the double value
        System.out.println("\nRandom Generate Double Value: ");
        double e = ThreadLocalRandom.current().nextDouble();
        double f = ThreadLocalRandom.current().nextDouble();

        System.out.println("Random vaule is: "+e);
        System.out.println("Random vaule is: "+f);
    }
 }