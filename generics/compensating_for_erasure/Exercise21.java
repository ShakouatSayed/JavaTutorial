/* Exercise 21: (4) Modify ClassTypeCapture.java by adding a
Map<String,Class<?>>, a method addType(String typename, Class<?> kind), and
a method createNew(String typename). createNew( ) will either produce a new
instance of the class associated with its argument string, or produce an error message.  */

package generics.compensating_for_erasure;

import java.util.*;
/* 
class BuilldingOne{public String toString(){return "BuilldingOne.";}}
class Home extends BuilldingOne{public String toString(){return "Home.";}}
class Office extends BuilldingOne{public String toString(){return "Office.";}}

public class Exercise21<T> {

    private Map<String,Class<?>> typeMap = new HashMap<>();

    public void addType(String typeName, Class<?> kinds){
        // typeMap = typeName;
        // kind = kinds;
        typeMap.put(typeName, kinds);
    }

    @SuppressWarnings("unchecked")
    public T createNew(String typeName){
        Class<?> type = typeMap.get(typeName);
        if(type == null){
            System.err.println("No: class found for type."+typeName);
        }

        try{
            return (T) type.getDeclaredConstructor(null).newInstance(null);
        }catch(Exception e){
            System.err.println("Error Creating new instance of type." + typeName + " : "+e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        
        Exercise21<BuilldingOne>  cTyC = new Exercise21<>() ;
        cTyC.addType("BuilldingOne", BuilldingOne.class);
        cTyC.addType("Home", Home.class);
        cTyC.addType("Office", Office.class);


        BuilldingOne b = cTyC.createNew("BuilldingOne");
        BuilldingOne h =   cTyC.createNew("Home");
        BuilldingOne o =  cTyC.createNew("Office");

        System.out.println(b);
        System.out.println(h);
        System.out.println(o);
    }
}
 */

/**
 * Exercise21
 */

/* class BuilldingOne{public String toString(){return "BuilldingOne";}}
class Home extends BuilldingOne{public String toString(){return "Home";}}


public class Exercise21 {

  private Map<String, Class<?>> map = new HashMap<>();

  public void addType(String typeName, Class<?> kind){
      map.put(typeName, kind);
  }

  @SuppressWarnings("deprecation")
  public Object createNew(String typeName){
      Class <?> kind = map.get(typeName);

      if(kind == null){
          System.out.println("Error: class type "+typeName + " not found");
          return null;
      }

      try{
          return kind.newInstance();
      }catch(InstantiationException e){
          System.out.println("Error: can not instantiate class "+typeName+" . ");
      }catch(IllegalAccessException e){
          System.out.println("Error: can not access class "+typeName+" . ");
      }
      return null;
  }

  public static void main(String[] args) {
      
      Exercise21 exerciseClassTypeCapture = new Exercise21();
      exerciseClassTypeCapture.addType("BuilldingOne", BuilldingOne.class);
      exerciseClassTypeCapture.addType("Home", Home.class);

      BuilldingOne b = (BuilldingOne) exerciseClassTypeCapture.createNew("BuilldingOne");
      Home h = (Home) exerciseClassTypeCapture.createNew("Home");

      System.out.println(b);
      System.out.println(h);
  }
  
} */

/**
 * Exercise21
 */

 class Builldings{}
 class Houses extends Builldings{}

public class Exercise21<T> {

    Class<T> kind;
    Map<String,Class<?>> map;

    public Exercise21(Class<T> kind){
        this.kind = kind;
    }

    public Exercise21(Class<T> kind, Map<String, Class<?>> map){
        this.kind = kind;
        this.map = map;
    }

    public boolean f(Object arg){
        return kind.isInstance(arg);
    }

    public void addType(String typeName, Class<?> kind){
        map.put(typeName, kind);
    }

    public Object createNew(String typeName) throws InstantiationException , IllegalAccessException{

        if(map.containsKey(typeName))
            return map.get(typeName).newInstance();

        System.out.println("Error : cannot create new instance of type "+typeName+" ! ");
        return null;
    }

    public static void main(String[] args) {
        
        Exercise21<Builldings> classTypeCapture = new Exercise21<Builldings>(Builldings.class, new HashMap<String, Class<?>>());

        classTypeCapture.addType("Houses", Houses.class);
        classTypeCapture.addType("Builldings", Builldings.class);

        System.out.println("classTypeCapture : "+classTypeCapture.map);

        try{
            Builldings b = (Builldings) classTypeCapture.createNew("Builldings");
            Houses h = (Houses) classTypeCapture.createNew("Houses");
            
            System.out.println("h.getClassName.getSimpleName : "+h.getClass().getName());
            System.out.println("b.getClassName.getSimpleName : "+b.getClass().getName());

            System.out.println("h.instance House : "+(h instanceof Houses));
            System.out.println("b.instance House : "+(b instanceof Houses));

            System.out.println("h.instance Buillding : "+(b instanceof Builldings));
            System.out.println("b.instance Buillding : "+(b instanceof Builldings));

        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }
    }
}

