package generics.mixins.using_the_decorator_pattern;

import java.util.Date;


/**
 * DecoratorPattern
 */


 class Basic{
    private String value;

    public void set(String val){
        value = val;
    }

    public String get(){
        return value;
    }
 }

class Decorator extends Basic{
    protected Basic basic;

    public Decorator(Basic basics) {this.basic = basics;}
    public void set(String val){basic.set(val);}

    public String get(){return basic.get();}
}

class TimeStamp extends Decorator{
    private final long timeStamp;

    public TimeStamp(Basic basics){
        super(basics);
        timeStamp = new Date().getTime();
    }

    public long getTimeStamp(){return timeStamp;}
}

class SerialNumber extends Decorator{
    private static int count = 1;
    private final long serialNumber = count++;
    public SerialNumber(Basic basic){super(basic);}
    public long getSerialNumber(){return serialNumber;}
}

public class DecoratorPattern {
    public static void main(String[] args) {
        TimeStamp timeStamp = new TimeStamp(new Basic());   
        TimeStamp timeStamp2 = new TimeStamp(new SerialNumber(new Basic()));
        System.out.println(timeStamp.getClass().getSimpleName() + " , " + timeStamp2.getClass());
        
        
        //Holders[] arr = new Holders[]{};
        
        SerialNumber serialNumber = new SerialNumber(new Basic());
        SerialNumber serialNumber2 = new SerialNumber(new TimeStamp(new Basic()));
        System.out.println(serialNumber.getClass().getSimpleName() + " , " + serialNumber2.getClass());
    }
}