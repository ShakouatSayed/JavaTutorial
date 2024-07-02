
package generics.mixins.mixins_with_dynamic_proxies;

import java.lang.reflect.*;
import java.util.*;

import generics.Simple_generics.A_tuple_library.TwoTuple;

/**
 * MixinDynamicProxies
 */

 class DynamicProxiesMixin implements InvocationHandler{
    Map<String, Object> delegetsByMethod;
    public DynamicProxiesMixin(TwoTuple<Object, Class<?>>... pairs){
        delegetsByMethod = new HashMap<>();
        for(TwoTuple<Object, Class<?>> pair : pairs){
            for(Method method : pair.second.getMethods()){
                String methodName = method.getName();
                if(!delegetsByMethod.containsKey(pairs))
                    delegetsByMethod.put(methodName, pair.first);
            }
        }
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        String methodName = method.getName();
        Object delegets = delegetsByMethod.get(methodName);
        return method.invoke(delegets, args);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static Object newInstance( TwoTuple... pair){
        Class[] inter = new Class[pair.length];
        for(int i = 0; i < pair.length; i++){
            inter[i] = (Class)pair[i].second;
        }
        ClassLoader cl = pair[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, inter, new DynamicProxiesMixin(pair));
    }
 }


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


public class MixinDynamicProxies {
    public static <A, B> TwoTuple<A, B> tuple(A a, B b){
        return new TwoTuple<A,B>(a, b);
    }

    public static void main(String[] args) {
        Object mixin = DynamicProxiesMixin.newInstance(tuple(new BasicImp(), Basic.class), tuple(new TimeStampedImp(), TimeStamp.class), tuple(new SerialNumberImp(), SerialNumber.class));

        Basic b = (Basic)mixin;
        TimeStamp t = (TimeStamp) mixin;
        SerialNumber s = (SerialNumber)mixin;
        b.set("Hi, I'm a Software Enginears");
        System.out.println(b.get());
        System.out.println(t.getTimeStamp());

        System.out.println(s.getSerialNumber());
    }
    
}