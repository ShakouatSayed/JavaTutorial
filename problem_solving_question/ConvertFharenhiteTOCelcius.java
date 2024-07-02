/* How to convert Fahrenheit to Celsius
Program in java
 */

package problem_solving_question;

import java.util.Scanner;

public class ConvertFharenhiteTOCelcius {
    public static void main(String[] args) {
        double F, temp, C, K;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n"+"Fahrenheite to Celcius convert :");
        System.out.print("\n"+"Enter the Fahrenheite = ");
        F = sc.nextDouble();
        temp = (F - 32) * 5/9;
        System.out.print(F+" °F"+" is = "+temp +" °C");

        System.out.print("\n"+"\n"+"Celcius to Farenheite convert : ");
        System.out.print("\n"+"Enter the celcius = ");
        C = sc.nextDouble();
        temp = (C * 9/5)+32;
         System.out.print(C+" °C"+" is = "+temp +" °F");

         System.out.print("\n"+"\n"+"Fahrenheite to Kelvin convert :");
         System.out.print("\n"+"Enter the Fahrenheite = ");
        F = sc.nextDouble();
        temp = (F - 32) * 5/9 + 273.15;
        System.out.print(F+" °F"+" is = "+temp +" K");

        System.out.print("\n"+"\n"+"Kelvin to Fharenheite convert :");
         System.out.print("\n"+"Enter the Kelvin = ");
        K = sc.nextDouble();
        temp = (F - 32) * 5/9 + 273.15 - 273.15;
        System.out.print(F+" K"+" is = "+temp +" °F");

        System.out.print("\n"+"\n"+"Celcius to Kelvin convert : ");
        System.out.print("\n"+"Enter the celcius = ");
        C = sc.nextDouble();
        temp = (F - 32) * 5/9 - 273.15;
         System.out.print(C+" °C"+" is = "+temp +" K");

         System.out.print("\n"+"\n"+"Kelvin to Celsius convert : ");
        System.out.print("\n"+"Enter the Kelvin = ");
        K = sc.nextDouble();
        temp = (F - 32) * 5/9 - 273.15 + 273.15;
         System.out.print(C+" K"+" is = "+temp +" °C");

    }
}
