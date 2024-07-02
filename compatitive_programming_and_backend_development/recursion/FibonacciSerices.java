package compatitive_programming_and_backend_development.recursion;

public class FibonacciSerices {
    public static int fibonacciSerices(int n){
        if(n <= 0) return 0;
        if(n == 1) return 1;
        
        int fib1 = fibonacciSerices(n - 1);
        int fib2 = fibonacciSerices(n - 2);
        int fibN = fib1 + fib2;
        
        
        return  fibN;
    }

    public static void main(String[] args) {
        // int result = fibonacciSerices(10);
        // System.out.print(result + " ");
        fibonacciSerices(10);
    }
}
