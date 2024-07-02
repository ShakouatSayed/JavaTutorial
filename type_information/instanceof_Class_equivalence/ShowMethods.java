package type_information.instanceof_Class_equivalence;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    private static String uses = "\nUses: \n" + 
                                 "ShowMethods qualified.class.name\n"+
                                 "To Show all method in class or\n"+
                                 "ShowMethods qualified.class.name Word\n"+
                                 "To Show all method in class Word\n";  
    
    private static Pattern p = Pattern.compile("\\w+\\.");
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println(uses);
            System.exit(0);
        }
        int line = 0;

        try{
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if(args.length == 1){
                for(Method method : methods)
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                for(Constructor ctor : ctors)
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                line = methods.length + ctors.length;
            }else{
                for(Method method : methods)
                    if(method.toString().indexOf(args[1]) != -1){
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        line++;
                    }
                for(Constructor ctor : ctors)
                    if(ctor.toString().indexOf(args[1]) != -1){
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                        line++;
                    }
            } 
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
