/* How to get IP address from site URL using
java program */

package problem_solving_question;

import java.net.InetAddress;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.MalformedURLException;
// import java.net.URL;
// import java.net.UnknownHostException;

// import java.net.InetAddress;
// import java.net.MalformedURLException;
// import java.net.URL;
// import java.net.UnknownHostException;

// public class IPAddressSite {
//     public static void main(String[] args) throws UnknownHostException{
//         String str = "https://www.google.com/";
//         try {
//             InetAddress ip_address = InetAddress.getByName(new URL(str).getHost());
//             System.out.println(ip_address);
//         } catch (MalformedURLException e) {
//             // TODO: handle exception
//             System.out.println("This link is invalid."+e);
//         }
//     }
// }

// public class IPAddressSite {

//     public static void main(String[] args) throws UnknownHostException{
//         String system_url = " ";
//         try {
//             URL url = new URL("http://www.scaler.com/");
//             BufferedReader buffer_reader = new BufferedReader(new InputStreamReader(url.openStream()));
//             system_url = buffer_reader.readLine().trim();
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println("This url is invalid."+e);
//         }
//         System.out.println(system_url);
//     }
// }

public class IPAddressSite {

    public static void main(String[] args) {
        try {
            InetAddress url = InetAddress.getByName("www.scaler.com");
            System.out.println("Host Address: "+url.getHostAddress());
            System.out.println("Host Name: "+url.getHostName());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("This link is invalid.");
        }
    }
}