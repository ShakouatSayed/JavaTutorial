/*
 * Thinking in Java.
 * Exercis Solution 08:
 * 
 * Exercise 8: Write a method that takes an object and recursively prints all
 * the classes
 * in that object’s hierarchy.
 */

 package type_information.need_runtimeinformation;

 class A01{}
 class B01 extends A01{}
 class C01 extends B01{}

 public class Exercise08{
    public static void Hierarchy(Object o){
        if(o.getClass().getSuperclass() != null){
            System.out.println(o.getClass() + " GET sub Class: "+ o.getClass().getSuperclass());
            
            try{
                Hierarchy(o.getClass().getSuperclass().newInstance());
            }catch(InstantiationException e){
                System.out.println("Cannot Create a object instant. ");
            }catch(IllegalAccessException e){
                System.out.println("Cannot Access Illegal Access.");
            }
        }
    }

    public static void main(String args[]){
        Hierarchy(new C01());
    }
 }