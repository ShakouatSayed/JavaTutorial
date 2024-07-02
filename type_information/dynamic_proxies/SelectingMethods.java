package type_information.dynamic_proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class MethodSelector implements InvocationHandler {
    private Object proxid;
    public MethodSelector(Object o){
        this.proxid = o;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        if(method.getName().equals("Intersting"))
            System.out.println("There is message is invoke method.");
        return method.invoke(proxid, args);
    }
}

interface Interface1{
     void boring1();
     void boring2();
     void intersting(String arg);
     void boring3();
}

class Implementation implements Interface1{
    public void boring1(){System.out.println("This is the Boring one.");}
    public void boring2(){System.out.println("This is the Boring Two.");}
    public void intersting(String ar){System.out.println("This is the Intersting one."+ar);}
    public void boring3(){System.out.println("This is the Boring Three.");}
}

 class SelectingMethods {
    public static void main(String args[]){
        Interface1 i = (Interface1)Proxy.newProxyInstance(
            Interface1.class.getClassLoader(),
            new Class[] {Interface1.class}, 
            new MethodSelector(new Implementation()));
            i.boring1();
            i.boring2();
            i.intersting("Beautifull Morning.");
            i.boring3();
    }
}
