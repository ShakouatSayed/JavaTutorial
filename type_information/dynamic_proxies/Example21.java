/*
 * Thinking in Java
 * Exercise Solution 21:
 * 
 * Exercise 21: (3) Modify SimpleProxyDemo.java so that it measures method-call
 * times.
 */

package type_information.dynamic_proxies;

import java.util.Date;

interface Interface2 {
    void doSometing();
    void anotherDoSomething(String str);
}

class SimpleProxyDemo1 implements Interface2 {
    public void doSometing() {
        System.out.println("Write the some message.");
    }

    public void anotherDoSomething(String srt) {
        System.out.println("Write the another some message: " + srt + "\n");
    }
}

class SimpleProxyDemo2 implements Interface2 {
    private Interface2 proxied;

    public SimpleProxyDemo2(Interface2 i) {
        this.proxied = i;
    }

    public void doSometing() {
        long call_time = new Date().getTime();
        System.out.println("Show the method time is " + call_time + " milisecond. ");
        proxied.doSometing();
        System.out.println("The time is : " + ((new Date().getTime()) - call_time) + " milisecond\n");
    }

    public void anotherDoSomething(String str) {
        long call_time = new Date().getTime();
        System.out.println("Show the another method time is " + call_time + " milisecond. ");
        proxied.anotherDoSomething(str);
        System.out.println(
                "The another method time is : " + ((new Date().getTime()) - call_time) + " milisecond" + str + "\n");
    }
}

public class Example21 {

    public static void printMessage(Interface2 i) {
        i.doSometing();
        i.anotherDoSomething("\nShow the another message. ");
    }

    public static void main(String args[]) {
        printMessage(new SimpleProxyDemo1());
        printMessage(new SimpleProxyDemo2(new SimpleProxyDemo1()));
    }
}