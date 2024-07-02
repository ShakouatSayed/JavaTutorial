package generics.Simple_generics;

public class Example02<T> {
    private T a;
    public Example02(T t){this.a = t;}
    public void set(T t){this.a = t;}
    public T get(){return a;}
    public static void main(String args[]){
        Example02 <AutoMobile> ex = new Example02<AutoMobile>(new AutoMobile());
        AutoMobile a = ex.get();//no need cust...
        System.out.println(a);
    }
}
