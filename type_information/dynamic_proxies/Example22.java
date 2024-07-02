/*
 * Thinking in Java.
 * Exercise solution:
 * 
 * Exercise 22: (3) Modify SimpleDynamicProxy.java so that it measures
 * method-call
 * times.
 * 
 */

 package type_information.dynamic_proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;


class SimpleDynamicProxy0 implements InvocationHandler{

    private Object proxied;
    public SimpleDynamicProxy0(Object ob){this.proxied = ob;}

    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable{
        long call_time = new Date().getTime();
        System.out.println("***Proxy: "+proxy.getClass()+" Args: "+args+" Invoke time is: "+call_time+" milisecond. \n");
        if(args != null)
            for(Object arg:args)
                System.out.println(arg);
        System.out.println("Method time is: "+((new Date().getTime())-call_time)+" milisecond. ");
        return method.invoke(proxied, args);
    }
}

public class Example22{
    public static void printMethod(Interface2 i){i.doSometing();i.anotherDoSomething("Shakouat Hossen Sayed.\n");}
    public static void main(String args[]){
        SimpleProxyDemo1 sp = new SimpleProxyDemo1();
        printMethod(sp);
       Interface2 i = (Interface2)Proxy.newProxyInstance(Interface2.class.getClassLoader(), new Class[] {Interface2.class}, new SimpleDynamicProxy0(sp)); 
        printMethod(i);
    }
}