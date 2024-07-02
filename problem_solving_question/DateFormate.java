/*How to Date format in java Program*/

package problem_solving_question;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/* public class DateFormate {
    public static void main(String[] args) {
        // date to string
        Date date = new Date();
        SimpleDateFormat simple_date_formate = new SimpleDateFormat("dd/MM/yy");
        String date_format = simple_date_formate.format(date);
        System.out.println("Now date is: " + date_format);
    }
} */

/**
 * DateFormate
 */
/* public class DateFormate {

    public static void main(String[] args) {
        SimpleDateFormat simple_date_format = new SimpleDateFormat("dd/MM/yy");
        try {
            Date date = new Date("08/02/24");
            System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 */

 /**
  * DateFormate
  */
 public class DateFormate {
 
    public static void main(String[] args) {
        System.out.println("\nShakouat Hossen Sayed.\n");
        Date date = new Date();
        SimpleDateFormat simple_date_format = new SimpleDateFormat("MM/dd/yy");
        String date_now = simple_date_format.format(date);
        System.out.println("MM/dd/yy: "+date_now);

        simple_date_format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String another_date_format = simple_date_format.format(date);
        System.out.println("dd-MM-yyyy hh:mm:ss: "+another_date_format);

        simple_date_format = new SimpleDateFormat("dd MMMM yyyy");
        String an_date_format = simple_date_format.format(date);
        System.out.println("dd MMMM yyyy: "+an_date_format);

        simple_date_format = new SimpleDateFormat("dd MMMM yyyy zzzz");
        String an1_date_formate = simple_date_format.format(date);
        System.out.println("dd MMMM YYYY zzzz: "+an1_date_formate);

        simple_date_format = new SimpleDateFormat("dd MMMM YYYY hh:mm:ss zzzz");
        String an2_date_format = simple_date_format.format(date);
        System.out.println("dd MMMM yyyy hh:mm:ss zzzz: "+an2_date_format+"\n");
    }
 }