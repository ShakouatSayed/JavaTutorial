/*How to get url of site using in java program.*/

package problem_solving_question;

import java.net.URL;

// import java.net.InetAddress;

// public class GetUrlSite {
//     public static void main(String[] args) {
//         try {
//             InetAddress url_addres = InetAddress.getByName("www.scaler.com");
//             System.out.println("Local Host Address: "+url_addres.getLocalHost());
//             System.out.println("Loop Back Address: "+url_addres.getLoopbackAddress());
//             System.out.println("Host Address: "+url_addres.getHostAddress());
//             System.out.println("Host Name: "+url_addres.getHostName());
//             System.out.println("Canonicla Host Name: "+url_addres.getCanonicalHostName());
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println("This link are the Invalid."+e);
//         }
//     }
// }


public class GetUrlSite {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.scaler.com/");
            System.out.println("Port Address: "+url.getPort());
            System.out.println("Host Address: "+url.getHost());
            System.out.println("File Address: "+url.getFile());
            System.out.println("Protocol Address: "+url.getProtocol());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}