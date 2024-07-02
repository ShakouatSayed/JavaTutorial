/* Difference between Static and Instance method working in java Program */
package problem_solving_question;

/* class DemoStatic{
    static int a = 20;
    static int b = 40;

    static void callMe(){
        System.out.println("This method using the statci keyword.");
        System.out.println("Add the value : "+(a+b));
    }
}

public class DifInstanceMStaticM {
    public static void main(String[] args) {
        DemoStatic.callMe();
    }
}
 */

 /**
  * DifInstanceMStaticM
  */
class InstanceDemo{
    static int a = 20;
    int b = 40; //instance variable 

    //instace method
    void instanceMethodCall(){
        int result = a * b;
        System.out.println(result);
    }
}

 public class DifInstanceMStaticM {
    public static void main(String[] args) {
        System.out.println("Difference between the Static and Instance Method.");
        InstanceDemo id = new InstanceDemo();
        id.instanceMethodCall();
        int result = id.b / InstanceDemo.a ;
        System.out.println("This the print will show is a divided by b : "+result);
    }
 }