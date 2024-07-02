/* How to print date and time in java Program */
package problem_solving_question;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/* public class DateTimePrint {
    public static void main(String[] args) {

        //java programming to current date and class 
        // using Date object
        // Create object an Data class
        Date date = new Date();

        // print the date class
        System.out.println("\nShakouat Hossen Sayed\n");
        System.out.println("Today date is: "+date);

    }
}
 */

/**
 * DateTimePrint
 */
/* public class DateTimePrint {

   public static void main(String[] args) {
       System.out.println("\nPrint the date and time\n");
       //now we using the calander instance
       Calendar calendar = Calendar.getInstance();

       //print crosponding by instance by passing
       //requird some as in arguments
       System.out.println("Day of Week: "+calendar.get(calendar.DAY_OF_WEEK));
       System.out.println("Day of Year: "+calendar.get(calendar.DAY_OF_YEAR));
       System.out.println("Week in Month: "+calendar.get(calendar.WEEK_OF_MONTH));
       System.out.println("Day of the Week in the Month: "+calendar.get(calendar.DAY_OF_WEEK_IN_MONTH));
       System.out.println("Hour: "+calendar.get(calendar.HOUR));
       System.out.println("Minuts : "+calendar.get(calendar.get(calendar.MINUTE)));
       System.out.println("Second: "+calendar.get(calendar.SECOND));
       System.out.println("AM or PM : "+calendar.get(calendar.AM_PM));
       System.out.println("Hour (24-hour Clock) : "+calendar.get(calendar.HOUR_OF_DAY));
       System.out.println("\n");
   }
} */

/**
 * DateTimePrint
 */
/* public class DateTimePrint {

    public static void main(String[] args) {
        System.out.println("Print the Date and time: ");
        // using the SimpleDateFormat

        SimpleDateFormat simple_date_format = new SimpleDateFormat("dd/MM/yyyy");

        String str = simple_date_format.format(new Date());
        // priting the formatted data
        System.out.println("Formatted Data: " + str);

        try {
            // passing a custom String
            String str1 = "02/27/2001";
            simple_date_format = new SimpleDateFormat("MM/dd/yyyy");
            Date date = simple_date_format.parse(str1);
            System.out.println("This Data is: "+date);
        } catch (Exception ex) {
            System.out.println("Catch the Error."+ ex);
        }

    }
} */

/**
 * DateTimePrint
 */
/* public class DateTimePrint {

    public static void main(String[] args) {
        System.out.println("Print the Date and time: ");

        //using the LocalDateTime class
        //Should print the local data
        LocalDate local_date = LocalDate.now();
        System.out.println("This area local date is: "+local_date);

        //Should print the local time
        LocalTime local_time = LocalTime.now();
        System.out.println("This area local time is: "+local_time);

        //should print the local date and time
        LocalDateTime local_date_time = LocalDateTime.now();
        System.out.println("This area local date and time now: "+local_date_time);
    }
} */

/**
 * DateTimePrint
 */
public class DateTimePrint {

    public static void main(String[] args) {
        System.out.println("Now print the System date and time: ");

        //printing the system date and time
        //creating the clock class an object
        Clock clock = Clock.systemDefaultZone();
        System.out.println("Now System time is: "+clock.instant());
    }
}