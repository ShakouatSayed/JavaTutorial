/* Exercise 39: (1) Add a new mixin class Colored to DynamicProxyMixin.java, mix it
into mixin, and show that it works.  */

package generics.mixins.mixins_with_dynamic_proxies;

import java.lang.reflect.*;
import java.util.*;

import generics.Simple_generics.A_tuple_library.TwoTuple;

class DynamicProxyMixinTwo implements InvocationHandler {
    Map<String, Object> delegetsByMethod;

    public DynamicProxyMixinTwo(TwoTuple<Object, Class<?>>... pairs) {
        delegetsByMethod = new HashMap<>();
        for (TwoTuple<Object, Class<?>> pair : pairs) {
            for (Method method : pair.second.getMethods()) {
                String methodName = method.getName();
                if (!delegetsByMethod.containsKey(pairs))
                    delegetsByMethod.put(methodName, pair.first);
            }
        }
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegets = delegetsByMethod.get(methodName);
        return method.invoke(delegets, args);
    }

    @SuppressWarnings("rawtypes")
    public static Object newInstance(TwoTuple... pair) {
        Class[] inter = new Class[pair.length];
        for (int i = 0; i < pair.length; i++) {
            inter[i] = (Class) pair[i].second;
        }

        ClassLoader cl = pair[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, inter, new DynamicProxyMixinTwo(pair));
    }
}

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

public class Exercise39 {
    public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple<A, B>(a, b);
    }

    public static void main(String[] args) {
        Object mixin = DynamicProxyMixinTwo.newInstance(
                tuple(new BasicOneImp(), BasicOne.class),
                tuple(new TimeStampOneImp(), TimeStampOne.class),
                tuple(new SerialNumberOneImp(), SerialNumberOne.class), 
                tuple(new ColoredImp(), Colored.class));
        
        BasicOne b = (BasicOne)mixin;
        TimeStampOne t =  (TimeStampOne)mixin;
        SerialNumberOne s = (SerialNumberOne)mixin;
        Colored c = (Colored)mixin;

        b.set("Hi, I'm a Software Engineer. and Good Programmers.");
        c.setColored("It's Color is Blue");

        System.out.println(b.get());
        System.out.println(t.getTimeStamp());
        System.out.println(s.getSerialNumber());
        System.out.println(c.getColored());
    }
}
