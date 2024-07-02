/*
 * How to create Hastable in java.
 */

 package problem_solving_question;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class CreatHastable {
   public static void main(String[] args) {
      Hashtable<String, Integer> hashtable = new Hashtable<>();
      hashtable.put("A", 8);
      hashtable.put("B", 6);

      //get the value in hashtable.
      int value = hashtable.get("A");
      System.out.println("Value of A: "+value);

      //creating an enum type variable.
      Enumeration<String> keys = hashtable.keys();
      while (keys.hasMoreElements()) {
         String s = keys.nextElement();
         System.out.println("Variable: "+s+" Value: "+hashtable.get(s));
      }

      //create a new line
      System.out.println("\n");
      //create a map
      for(Map.Entry<String, Integer> val : hashtable.entrySet()){
          System.out.println("Variable: "+val.getKey()+" value: "+val.getValue()); 
      }   
   }
 }

