/*How convert String to data in java program */

package problem_solving_question;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) throws Exception {

        //initial the date 
        String date1 = "05/03/2012";
        String date2 = "27-02-2001";
        String date3 = "07 03, 2005";
        String date4 = "Thu, Dec 31 1998";
        String date5 = "Thu, Dec 31 1998 23:37:50";


        //initial the date format using the SimpleDataFormat class
        SimpleDateFormat s_date1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat s_date2 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat s_date3 = new SimpleDateFormat("dd MM,yyyy");
        SimpleDateFormat s_date4 = new SimpleDateFormat("E, MMM dd yyyy");
        SimpleDateFormat s_date5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");


        //Convert the string to date usint the data class
        Date date01 = s_date1.parse(date1);
        Date date02 = s_date2.parse(date2);
        Date date03 = s_date3.parse(date3);
        Date date04 = s_date4.parse(date4);
        Date date05 = s_date5.parse(date5);

        //print the date.
        System.out.println(date01);
        System.out.println(date02);
        System.out.println(date03);
        System.out.println(date04);
        System.out.println(date05);
    }
}
