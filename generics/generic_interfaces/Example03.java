package generics.generic_interfaces;

import java.util.Iterator;

public class Example03 extends Example02 implements Iterable<Integer>{

    private int n;

    public Example03(int count){n = count;}

    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            public boolean hasNext(){return n > 0;}
            public Integer next(){
                n--;
                return Example03.this.next();
            }
        };
    }
    
    public void remove(){
        throw new UnsupportedOperationException();
    }

    //public Integer next(){return fib(count++);}

    public static void main(String[] args) {
        System.out.println("System.out.println(anything)");
        //Example03 fibonacciNuber = new Example03();

        for(int i : new Example03(18)){
            System.out.print(i+" ");
        }
    }   
}  
