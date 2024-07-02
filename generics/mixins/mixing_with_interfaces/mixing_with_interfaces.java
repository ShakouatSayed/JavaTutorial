package generics.mixins.mixing_with_interfaces;

import java.util.Date;


/**
 * mixing_with_interfaces
 */

 interface TimeStamp{long getTimeStamp();}

 class TimeStampedImp implements TimeStamp{
    private final long timeStamp;
    public TimeStampedImp(){
        timeStamp = new Date().getTime();
    }

    public long getTimeStamp(){return timeStamp;}
 }

 interface SerialNumber{long getSerialNumber();}

 class SerialNumberImp implements SerialNumber{
    private static int count = 1;
    private final long serialNumber = count++;
    public long getSerialNumber(){return serialNumber;}
 }

 interface Basic{
    void set(String val);
    String get();
 }



 class BasicImp implements Basic{
    private String value;
    public void set(String val){value = val;}
    public String get(){return value;}
 }

 class Mixin extends BasicImp implements TimeStamp, SerialNumber{
    private TimeStamp timeStamp = new TimeStampedImp();
    private SerialNumber serialNumber = new SerialNumberImp();

    public long getTimeStamp(){return timeStamp.getTimeStamp();}
    public long getSerialNumber(){return serialNumber.getSerialNumber();}
 }

public class mixing_with_interfaces {
    public static void main(String[] args) {
        Mixin m1 = new Mixin();
        Mixin m2 = new Mixin();

        m1.set("test Stirng 1");
        m2.set("test Stirng 2");

        System.out.println(m1.get()+" "+m1.getTimeStamp()+" "+m1.getSerialNumber());
        System.out.println(m2.get()+" "+m2.getTimeStamp()+" "+m2.getSerialNumber());
    }
}

