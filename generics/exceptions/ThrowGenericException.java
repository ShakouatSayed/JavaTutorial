package generics.exceptions;

import java.util.*;

/**
 * ThrowGenericException
 */

 interface Processor<T, E extends Exception> {
    void process(List<T> resultCollector) throws E;
 }

 class ProcessRunning<T, E extends Exception> extends ArrayList<Processor<T, E>>{
    List<T> processAll() throws E{
        List<T> resultCollector = new ArrayList<>();
        for(Processor<T, E> processor: this){
            processor.process(resultCollector);
        }
        return resultCollector;
    }
 }

 class Failer1 extends Exception{}
 class Processor1 implements Processor<String, Failer1>{
    static int count = 3;
    public void process(List<String> resultCollector) throws Failer1{
        if(count-->1)
            resultCollector.add("Hello");
        else 
            resultCollector.add("Ho");
        if(count < 0)
            throw new Failer1();
    }
 }

 class Failer2 extends Exception{}
 class Processor2 implements Processor<Integer, Failer2>{
    static int count = 0;
    public void process(List<Integer> resultCollector) throws Failer2 {
        if(count==0)
            resultCollector.add(47);
        else
            resultCollector.add(17);
        if(count > 1)
            throw new Failer2();
    }
 }



public class ThrowGenericException {

    public static void main(String[] args) {
        ProcessRunning<String, Failer1> runner = new ProcessRunning<>();
        for(int i = 0; i < 3; i++)
            runner.add(new Processor1());
        
        try{System.out.println(runner.processAll());}catch(Failer1 f){System.out.println(f);}

        ProcessRunning<Integer, Failer2> runner2 = new ProcessRunning<>();
        for(int i = 0; i < 3; i++)
            runner2.add(new Processor2());

        try{System.out.println(runner2.processAll());}catch(Failer2 f){System.out.println(f);}
    }    
}