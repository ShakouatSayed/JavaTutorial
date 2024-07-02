package type_information.dynamic_proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandelar implements InvocationHandler{
    private Object proxied;
    public DynamicProxyHandelar(Object p){
        this.proxied = p;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("\n***Proxy: "+proxy.getClass()+"Method: "+method+"Object: "+args+"\n");
        if(args != null)
            for(Object arg : args)
                  System.out.println(" "+arg);
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy {
    public static void showMethod(Interface s){
        s.doSomething();
        s.anotherDoSomething("Shakouat Hossen Sayed");
    }
    public static void main(String args[]){
        DoSomething ds = new DoSomething();
        showMethod(ds);
        Interface proxy = (Interface)Proxy.newProxyInstance(
            Interface.class.getClassLoader(), 
            new Class[]{Interface.class} , 
            new DynamicProxyHandelar(ds)
            );
        showMethod(proxy);
    }
}
