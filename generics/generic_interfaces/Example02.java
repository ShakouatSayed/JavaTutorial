package generics.generic_interfaces;

import generics.generic_interfaces.coffee.Generator;

public class Example02 implements Generator<Integer>{

    private int count = 0;
    private int fib(int n){
        if(n < 2)
            return 1;
        return fib(n - 2) + fib( n - 1);
    }

    public Integer next(){return fib(count++);}

    public static void main(String[] args) {
        System.out.println("1 to 18 fibonacci number is: ");
        Example02 fibonacciNumber = new Example02();
        
        for(int i = 0; i <= 18; i++){
            System.out.print(fibonacciNumber.next()+ " ");
        }
    }
}
