package PackageFour;
public class con_class2{
        int a, b;
        con_class2(String m){
            System.out.println(m);
        }
    con_class2(){
         a = 10;
         b = 20;
    }
    public int add(){
        return a + b;
    }
    public static void main(String args[]){
        con_class2 s = new con_class2("Sayed number is: ");
        con_class2 s1 = new con_class2();
        
        System.out.println(s1.add());
        
    }
}