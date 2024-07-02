/* How to create constructor overloading in
java Program */

 package problem_solving_question;
/* 
public class CreateConstractor {
    int x = 0, y = 0;
    public CreateConstractor (){
        x = 10;
        y = 20;
    }

    CreateConstractor(int a, int b){
        x = a;
        y = b;
    }
    public static void main(String[] args) {
        System.out.println("Create a constractor.");
        CreateConstractor  cg = new CreateConstractor();
        CreateConstractor cg1 = new CreateConstractor(30, 40);
        System.out.println("X + Y : "+(cg.x+cg.y));
        System.out.println("X + Y : "+(cg1.x + cg1.y));
        
    }
}
 */

 /* public class CreateConstractor{
    //int a, b;
    public CreateConstractor(int a, int b){
        // this.a = a;
        // this.b = b;  
        int result = a + b;
        System.out.println("The two number sum is: "+result); 
    }
    // public void add(){
    //     int result = a + b;
    //     System.out.println("The two number sum is: "+result);  
    // }
    public static void main(String[] args) {
        CreateConstractor cg = new CreateConstractor(4, 3);
        //cg.add();
        System.out.println("Create a Constractor ");
    }
 } */

 public class CreateConstractorOverloading{
    String name;
    public CreateConstractorOverloading(){
        System.out.println("Constractor Method are called.");
    }

    public CreateConstractorOverloading(String str){
        this.name = str;
        //System.out.println("The Programming Language are: "+str);
    }

    void setName(String str){
        name = str;
    }

    void getName(){
        System.out.println("The Programming Language are: "+name);
    }
    public static void main(String[] args) {
        System.out.println("Create a Constractor.");
        CreateConstractorOverloading cc = new CreateConstractorOverloading();
        CreateConstractorOverloading cc1 = new CreateConstractorOverloading("Java");
        cc.setName("C++");
        cc.getName();
        cc1.getName();


    }
 }
