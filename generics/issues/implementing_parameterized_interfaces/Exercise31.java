/* Exercise 31: (1) Remove all the generics from MultipleInterfaceVariants.java and
modify the code so that the example compiles.  */

package generics.issues.implementing_parameterized_interfaces;

/**
 * Exercise31
 */

interface Payable{float getPay();}
class WeeklyPay implements Payable{
    private float weeklyPay;
    
    public float getPay(){
        return weeklyPay;
    }
}

class Hourly extends WeeklyPay{
    private String name;
    private int hourWorked;
    private float hourlyPay;

    public Hourly(String n, int hourW, float hourlyP){name = n;hourWorked = hourW; hourlyPay = hourlyP;}

    public float getPay(){
        System.out.println("Pay: "+name+ " $ " +hourWorked*hourlyPay);
        return hourWorked * hourlyPay;
    }
}

public class Exercise31 {
    public static void main(String[] args) {
        Hourly h = new Hourly("Sayed", 48, 8);
        h.getPay();
    }
}