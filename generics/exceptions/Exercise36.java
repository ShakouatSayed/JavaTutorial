/* Exercise 36: (2) Add a second parameterized exception to the Processor class and
demonstrate that the exceptions can vary independently.  */

package generics.exceptions;

import java.util.*;

interface ProcessorOne<T, E extends Exception, F extends Exception>{
    void process(List<T> resultCollector) throws E, F;
}

class ProcessRunner<T, E extends Exception, F extends Exception> extends ArrayList<ProcessorOne<T, E, F>>{
    List<T> processAll() throws E, F {
        List<T> resultCollector = new ArrayList<>();
        for(ProcessorOne<T, E, F> processorOne : this)
            processorOne.process(resultCollector);
        return resultCollector;
    }
}

class FailerOne extends Exception{}
class FailerTwo extends Exception{}
class FailerThree extends Exception{}

class ProcessorA implements ProcessorOne<String, FailerOne, FailerTwo>{
    static int count = 3;
    public void process(List<String> resultCollector) throws FailerOne{
        if(count-- > 1)
            resultCollector.add("Hi, I'm String.");
        else    
            resultCollector.add("Hello");
        if(count < 0)
            throw new FailerOne();
    }
}

class ProcessorB implements ProcessorOne<Integer, FailerTwo, FailerThree>{
    static int count = 2;
    public void process(List<Integer> resultCollector) throws FailerTwo{
        if(count-- == 0)
            resultCollector.add(47);
        else 
            resultCollector.add(17);
        if(count < 0)
            throw new FailerTwo();
    }
}

class ProcessorC implements ProcessorOne<Double, FailerOne, FailerThree>{
    static int count = 1;
    public void process(List<Double> resultCollector) throws FailerThree{
        if(count-- < 1)
            resultCollector.add(3.1416);
        else 
            resultCollector.add(2.25);
        if(count < 1)
            throw new FailerThree();
    }
}

public class Exercise36 {
    public static void main(String[] args) {
        ProcessRunner<String, FailerOne, FailerTwo> runner = new ProcessRunner<>();
        for(int i = 0; i < 3; i++)
            runner.add(new ProcessorA());
        
        try {
            System.out.println(runner.processAll());
        } catch (FailerOne | FailerTwo e) {
            e.printStackTrace();
        }

        ProcessRunner<Integer, FailerTwo, FailerThree> runner2 = new ProcessRunner<>();
        for(int i = 0; i < 3; i++)
            runner2.add(new ProcessorB());
        
        try{System.out.println(runner2.processAll());}catch(FailerTwo | FailerThree f){
            System.out.println(f);
        }

        ProcessRunner<Double, FailerOne, FailerThree> runner3 = new ProcessRunner<>();
        for(int i = 0; i< 3; i++)
            runner3.add(new ProcessorC());

        try{System.out.println(runner3.processAll());}catch(FailerOne| FailerThree f){
            System.out.println(f);
        }
        
    }
}
