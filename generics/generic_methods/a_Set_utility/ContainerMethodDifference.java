package generics.generic_methods.a_Set_utility;

import java.lang.reflect.Method;
import java.util.*;


public class ContainerMethodDifference {

    static Set<String> methodSet(Class<?> type){
        Set<String> result = new TreeSet<String>();
        for(Method m: type.getMethods()){
            result.add(m.getName());
        }
        return result;    
    } 

    static void interfaces(Class<?> type){
        System.out.println("interfaces in "+type.getSimpleName()+" : ");
        List<String> result = new ArrayList<String>();

        for(Class<?> c : type.getInterfaces())
            result.add(c.getSimpleName());
        System.out.println(result);
    }

    static Set<String> object = methodSet(Object.class);

    static {object.add("clone");}

    static void difference(Class<?> subSet, Class<?> superSet){
        
        System.out.println(superSet.getSimpleName()+" extends "+superSet.getSimpleName() +", adds : ");
        Set<String> comp = Sets.difference(methodSet(superSet), methodSet(subSet));
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superSet);

    }

    public static void main(String[] args) {
        System.out.println("Collections : "+methodSet(Collection.class));
        interfaces(Collection.class);
        System.out.println();
        difference(Set.class, Collection.class);
        System.out.println();
        difference(HashSet.class, Set.class);
        System.out.println();
        difference(LinkedHashSet.class, HashSet.class);
        System.out.println();
        difference(TreeSet.class, Set.class);
        System.out.println();
        difference(ArrayList.class, List.class);
        System.out.println();
        difference(LinkedList.class, List.class);
        System.out.println();
        difference(Queue.class, Collection.class);
        System.out.println();
        difference(PriorityQueue.class, Queue.class);
        System.out.println();
        System.out.println("Map : "+methodSet(Map.class));
        difference(HashMap.class, Map.class);
    }
}
