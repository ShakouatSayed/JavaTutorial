/* How to create method in java Program */

package problem_solving_question;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/* public class CreateMethod {
    static int a , b , c ;
    public CreateMethod(int x , int y, int z){
        this.a = x;
        this.b = y;
        this.c = z;
        System.out.println((x+y/z));
    }

    public void add(){
        int result = a + b;
        System.out.println("Add the the two value: "+result);
    }

    static void subtraction(){
        int result = b - c;
        System.out.println(result);
    }

    int multiplication(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println("Creating a method");
        CreateMethod cm = new CreateMethod(10, 20, 30);
        cm.add();
        CreateMethod.subtraction();
        int value = cm.multiplication(20, 30);
        System.out.println(value);
    }
}
 */

 /**
  * CreateMethod
  */
 public class CreateMethod {

    CreateMethod(){
        System.out.println("Constractor method is called when an object of its class is created.");
    }

    static void staticMethod(){
        System.out.println("Static method can be called without creating object.");
    }

    void nonStaticMethod(){
        System.out.println("Non static method must be called by creating an object.");
    }

    public static void main(String[] args) {
        CreateMethod cc = new CreateMethod();
        CreateMethod.staticMethod();   
        cc.nonStaticMethod();
    }
 }