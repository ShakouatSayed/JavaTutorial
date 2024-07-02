/* Exercise 37: (2) Add a new mixin class Colored to Mixins.java, mix it into Mixin,
and show that it works.  */

package generics.mixins.mixing_with_interfaces;

import java.util.Date;

interface TimeStampOne {
    long getTimeStamp();
}

class TimeStampOneImp implements TimeStampOne {
    private final long timeStamp;

    public TimeStampOneImp() {
        timeStamp = new Date().getTime();
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}

interface SerialNumberOne {
    long getSerialNumber();
}

class SerialNumberOneImp implements SerialNumberOne {
    private static int count = 1;
    private final long serialNumber = count++;

    public long getSerialNumber() {
        return serialNumber;
    }
}

interface Colored {
    void setColored(String color);

    String getColored();
}

class ColoredImp implements Colored {
    String color = "green";

    public void setColored(String color) {
        this.color = color;
    }

    public String getColored() {
        return color;
    }
}

interface BasicOne {
    void set(String val);

    String get();
}

class BasicOneImp implements BasicOne {
    private String value;

    public void set(String val) {
        value = val;
    }

    public String get() {
        return value;
    }
}

class MixinOne extends BasicOneImp implements TimeStampOne, SerialNumberOne, Colored {

    private TimeStampOne timeStampOne = new TimeStampOneImp();
    private SerialNumberOne serialNumberOne = new SerialNumberOneImp();
    private Colored coloredImp = new ColoredImp();

    public long getSerialNumber() {
        return serialNumberOne.getSerialNumber();
    }

    public long getTimeStamp() {
        return timeStampOne.getTimeStamp();
    }

    public void setColored(String color) {
        coloredImp.setColored(color);
    }

    public String getColored() {
        return coloredImp.getColored();
    }
}

public class Exercise37 extends MixinOne {
    public static void main(String[] args) {
        MixinOne m1 = new MixinOne();
        MixinOne m2 = new MixinOne();

        m1.set("test result 1");
        m2.set("test result 2");
        //m1.setColored("red");
        m1.setColored("blue");

        System.out.println(m1.get() + " " + m1.getColored() + " " + m1.getTimeStamp() + " " + m1.getTimeStamp() + " "
                + m1.getSerialNumber());
        System.out.println(m2.get() + " " + m2.getColored() + " " + m2.getTimeStamp() + " " + m2.getTimeStamp() + " "
                + m2.getSerialNumber());
    }
}
