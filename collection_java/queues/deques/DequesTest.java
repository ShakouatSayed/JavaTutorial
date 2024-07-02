package collection_java.queues.deques;

/**
 * DequesTest
 */
public class DequesTest {

    static void fillTest(Deques<Integer> deques) {
        for (int i = 0; i < 10; i++)
            deques.addFirsts(i);
        for (int i = 11; i < 20; i++)
            deques.addLasts(i);
    }
    public static void main(String[] args) {
        Deques<Integer> deques = new Deques<>();
        fillTest(deques);
        while (deques.sizes() != 0) {
            System.out.print(deques.removeFirsts()+" ");
        }
        System.out.println();
        fillTest(deques);
        while (deques.sizes() != 0) {
            System.out.print(deques.removeLasts()+" ");
        }
    }
}