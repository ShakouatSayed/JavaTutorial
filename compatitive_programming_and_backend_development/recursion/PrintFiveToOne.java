package compatitive_programming_and_backend_development.recursion;

public class PrintFiveToOne {
    public static void printFiveToOne(int n){
        if(n<=0)return ;
        System.out.print(n+" ");
        printFiveToOne(n-1);
    }

    public static void main(String[] args) {
        printFiveToOne(5);
    }
}
