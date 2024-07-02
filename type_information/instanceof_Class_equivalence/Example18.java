/*
 * Thinking in Java.
 * Exercise Solution 17:
 * 
 * Exercise 18: (1) Make ShowMethods a non-public class and verify that the
 * synthesized default constructor no longer shows up in the output.
 */


package type_information.instanceof_Class_equivalence;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

class Example18{
	private static String usage = "Usage: \n"+
			                  	  "The ShowMethod qualified class.name\n"+
								  "Show all method name or\n"+
								  "The showMethod qualified class.name.or\n"+
								  "The show all method name or and word";
	private static Pattern p = Pattern.compile("(\\s*final)|(\\w+\\.)|(\\s*native)");
	public static void main(String args[]){
		if(args.length < 1){
			System.out.println(usage);
			System.exit(0);
		}
		int line = 0;
		try{
			Class <?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] constructors = c.getConstructors(); 
			if(args.length == 1){
				for(Method method: methods)
					System.out.println(p.matcher(method.toString()).replaceAll(""));
				for(Constructor constructor : constructors)
					System.out.println(p.matcher(constructor.toString()).replaceAll(""));
				line = methods.length + constructors.length;
			}else{
				for(Method method: methods)
					if(method.toString().indexOf(args[1])!= 1){
						System.out.println(p.matcher(method.toString()).replaceAll(""));
						line++;
					}
				for(Constructor constructor: constructors)
					if(constructor.toString().indexOf(args[1])!= 1){
						System.out.println(p.matcher(constructor.toString()).replaceAll(""));
						line++;
					}	
			}
		}catch(ClassNotFoundException e){
			System.out.println("No such class: "+e);
		}
	}
}