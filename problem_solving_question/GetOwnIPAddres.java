package problem_solving_question;

import java.net.Inet6Address;

/**
 * GetOwnIPAddres
 */
public class GetOwnIPAddres {

    public static void main(String[] args) {
        System.out.println("\nShakouat Hossen Sayed.\n");
        try {
            System.out.println("This computer IP Address is: " + Inet6Address.getLocalHost());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Catch the error: "+e);
        }
    }
}