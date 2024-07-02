/*
 * Thinking in Java.
 * Exercise Solution 23:
 * 
 * Exercise 23: (3) Inside invoke( ) in SimpleDynamicProxy.java, try to print
 * the
 * proxy argument and explain what happens.
 */

 package type_information.dynamic_proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

class SimpleDynamicProxy2 implements InvocationHandler{
    private Object proxied;
    public SimpleDynamicProxy2(Object ob){this.proxied = ob;}
    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
        long call_times = new Date().getTime();
        System.out.println("***Proxy: "+proxy.getClass()+" args: "+args+"Invoked times: "+call_times+" miliseconds. ");
        if(args != null)for(Object arg : args)System.out.println(args);
        System.out.println("Method invoked: "+((new Date().getTime())-call_times)+" miliseconds. \n");
        return method.invoke(proxy, args);
    }
}

 public class Example23{
    public static void printMethod(Interface2 i){i.doSometing();i.anotherDoSomething("Shakouat Hossen Sayed. ");}
    public static void main(String args[]){
        SimpleProxyDemo1 sp = new SimpleProxyDemo1();
        printMethod(sp);
        Interface2 i = (Interface2)Proxy.newProxyInstance(Interface2.class.getClassLoader(), new Class<?>[]{Interface2.class}, new SimpleDynamicProxy2(sp));
        printMethod(i);
    }
 }