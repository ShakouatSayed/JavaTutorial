package type_information.dynamic_proxies;

interface Interface{
        void doSomething();
        void anotherDoSomething(String i);
    }

    class DoSomething implements Interface{
        public void doSomething(){System.out.println("Do something.");}
        public void anotherDoSomething(String s){
            System.out.println("Print the another do something: "+s);
        }
    }

    class SimpleProxy implements Interface{

        private Interface demo_proxy;
        
        public SimpleProxy(Interface s){
            this.demo_proxy = s;
        }

        public void doSomething(){
            System.out.println("Print new something: ");
            demo_proxy.doSomething();
        }

        public void anotherDoSomething(String s1){
            System.out.println("Print the another new text write in something: "+s1);
            demo_proxy.anotherDoSomething(s1);
        }
    }

public class SimpleProxyDemo {
    public static void anyMethod(Interface i){
        i.doSomething();
        i.anotherDoSomething("Shakouat Hossen Sayed.");
    }
    public static void main(String args[]){
        anyMethod(new DoSomething());
        anyMethod(new SimpleProxy(new DoSomething())); 
    }
}
