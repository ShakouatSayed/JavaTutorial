/*
 * Thinking in Java.
 * Exercise Solution 10.
 * 
 * Exercise 10: (3) Write a program to determine whether an array of char is a
 * primitive
 * type or a true Object.
 */

package type_information.need_runtimeinformation;

public class Exercise10{
    public static void main(String args[]){
        char c[] = new char[5];
        System.out.println(c.getClass().getSuperclass());
        System.out.println("C instance of object: "+(c instanceof Object));
    }
} 