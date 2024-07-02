/*
 * Thinking in Java.
 * Exercise Solution 17:
 * 
 * Exercise 17: (2) Modify the regular expression in ShowMethods.java to
 * additionally
 * strip off the keywords native and final (hint: use the OR operator’|’)-
 */

 package type_information.instanceof_Class_equivalence;

import java.lang.reflect.*;
import java.util.regex.Pattern;

public class Example17{
   private static final String uses = "\nUses: \n"+
                                "ShowMethods qualified.class.name\n"+
                                "to Show all method in class or\n"+
                                "ShowMethods qulified.class.name word\n"+
                                "to show all method in class or word";

   private static Pattern p = Pattern.compile("(\\w+\\.)|(\\s*native)|(\\s*final)");
    public static void main(String args[]){
      if(args.length < 1){
         System.out.println(uses);
         System.exit(0);
      }
      int line = 0;
      try{
         Class<?> c = Class.forName(args[0]);
         Method[] ms = c.getMethods();
         Constructor[] ctors = c.getConstructors();
         if(args.length == 1){
            for(Method method: ms)
               System.out.println(p.matcher(method.toString()).replaceAll(""));
            for(Constructor constructor : ctors)
               System.out.println(p.matcher(constructor.toString()).replaceAll(""));
            line = ms.length + ctors.length;
         }else{
            for(Method method : ms)
               if(method.toString().equals(ms))
                  System.out.println(p.matcher(method.toString()).replaceAll(""));
            for(Constructor constructor : ctors)
               if(constructor.toString().indexOf(args[1] )!=  -1) 
                  System.out.println(p.matcher(constructor.toString()).replaceAll(""));
         }
      }catch(ClassNotFoundException e){
         System.out.println("No such error.");
      }
    }
 }