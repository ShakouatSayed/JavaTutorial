/*How to SQL Date in java Program */

package problem_solving_question;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;

import PackageFour.class1;

/* public class SQLDateFormat {
    public static void main(String[] args) {
        System.out.println("\n Shakouat Hossen Sayed\n");
        String str = "2024-05-03";
        Date date = Date.valueOf(str);
        System.out.println("Converting String to Sql Date: ");
        System.out.println(date);
    }
} */

/**
 * SQLDateFormat
 */
/* public class SQLDateFormat {

    public static void main(String[] args) {
        System.out.println("/nShakouat Hossen Sayed.\n");
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println("Now today Date is: "+date);
    }
} */

/**
 * SQLDateFormat
 */
/* public class SQLDateFormat {

    public static void main(String[] args) {
        System.out.println("\nShakouat Hossen Sayed.\n");
        LocalDateTime now_date = LocalDateTime.now();
        System.out.println("Now today date is: "+now_date);
    }
} */

/**
 * SQLDateFormat
 */
public class SQLDateFormat {

    public static void main(String[] args) {
        System.out.println("\nShakouat Hossen Sayed.\n");
        
        System.out.println("Create an object of calender.\n");
        //by invoking the getInstance method
        Calendar calendar = Calendar.getInstance();

        //setting the month
        /* The month begin with 0.0 means january */
        calendar.set(calendar.MONTH, 01);
        /* Setting Date */
        calendar.set(calendar.DATE, 12 );
        /* setting year */
        calendar.set(calendar.YEAR, 2021);
        /* Creating an object of the class Date with the mentioned time*/
        java.util.Date date = calendar.getTime();
        Instant instant = date.toInstant();
        System.out.println("Original Date is: "+date.toString());
        System.out.println("\n");
        System.out.println("The instant is : "+instant);
    }
}