/* Exercise 22: (6) Use a type tag along with reflection to create a method that uses the
argument version of newInstance( ) to create an object of a class with a constructor that
has arguments.  */

package generics.compensating_for_erasure.creating_instances_of_types;

import java.lang.reflect.*;

class CreatorOne<T>{
    
    Class<T> kind;

    public CreatorOne(Class<T> kind){
        this.kind = kind;
    }

    public T createNew(String typeName){
        
        try{

            Constructor<T> constructor = kind.getConstructor(typeName.getClass());

            try{
                return (T)constructor.newInstance(typeName);
            }catch(InstantiationException e){
                e.printStackTrace();
            }catch(IllegalAccessException e){
                e.printStackTrace();
            }catch(InvocationTargetException e){
                e.printStackTrace();
            }

        }catch(NoSuchMethodException e){
            e.printStackTrace();
        }
        
        return null;
    }
}

public class Exercise22<T> {
    
    public static void main(String[] args) {
        
        CreatorOne<Integer> creator = new CreatorOne<Integer>(Integer.class);

        System.out.println(creator.createNew("128"));
    }
    
}
