/* (2) Use composition instead of inheritance to adapt Fibonacci to make it
Iterable.  */

package generics.generic_interfaces;

import java.util.Iterator;

import generics.generic_interfaces.coffee.Generator;

public class Exercise07 implements Iterable<Integer>, Generator<Integer>{

    private int count = 0;
    private int m;
    public Integer next(){return fib(count++);}
    private int fib(int n){
        if(n < 2)
            return 1;
        return fib(n - 2) + (n - 1);
    }

    public Exercise07(){}

    public Exercise07(int num){ this.m = num; }

    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            public boolean hasNext(){return m > 0;}
            public Integer next(){
                m--;
                return Exercise07.this.next();
            }
        };
    }

    public static void main(String[] args) {

        //show the output first part
        Exercise07 fibonacciNumber = new Exercise07();
        for(int i = 0; i < 18; i++){
            System.out.print(fibonacciNumber.next() + " ");
        }

        System.out.println();

        //show the output second part
        for(int i: new Exercise07(18)){
            System.out.print(i+ " ");
        }

        System.out.println();

        //show the output third part
        Iterator it= new Exercise07(18).iterator();

        while(it.hasNext())
            System.out.print(it.next() + " ");
    }
}
