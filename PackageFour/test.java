package PackageFour;

class test1{
    public test1(){
        System.out.println("This the defult constractor ");
    }
    public test1(String s){
        System.out.println("This the inside String type perameter in the constractor: "+s);
    }
    public test1(int n){
        System.out.println("This the inside integer type perameter in the constractor: "+n);
    }
    public test1(double m, double n){
        System.out.println("This the inside two double type perameter in the constractor: "+m+" "+n);
    }
    
}

public class test{
    public static void main(String args[]){
        test1 a = new test1();
        test1 b = new test1("Sayed");
        test1 c = new test1(20);
        test1 d = new test1(20.3, 39.54);
    }
}