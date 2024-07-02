/*
 * Thinking in Java.
 * Exercise Solution 12.
 * 
 * Exercise 12: (3) Use TypeCounter with the CoffeeGenerator.java class in the
 * Generics
 * chapter.
 */

package type_information.pets.Using_class_literals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;


class TypeCounter extends HashMap<Class<?>, Integer>{
    private Class<?> base_type;
    public TypeCounter(Class<?> bClass){this.base_type = bClass;}

    public void count(Object ob){
        Class<?> types = ob.getClass();
        if(!base_type.isAssignableFrom(types))
            throw new RuntimeException(ob+"Incarret type: "+types+"Should type is: "+base_type);
        currentClass(types);
        
    }

    public void currentClass(Class<?> type){
        Integer quantety = get(type);
        put(type, quantety == null ? 1 : quantety + 1);
        Class<?> supper_class1 = type.getSuperclass();
        if(supper_class1 != null && base_type.isAssignableFrom(supper_class1))
            currentClass(supper_class1);
    }

    public String toString(){
        StringBuilder stb = new StringBuilder("{\n");
        for(Map.Entry<Class<?>, Integer>pair:entrySet()){
            stb.append(pair.getKey().getSimpleName());
            stb.append("=");
            stb.append(pair.getValue());
            stb.append(",\n");
        }
        stb.delete(stb.length()-2, stb.length());
        stb.append("\n}");
        return stb.toString();
    }
}

class Coffee1{
    private static long count = 0;
    private final long id = count++;
    public String toString(){
        return getClass().getSimpleName()+" "+id;
    }
}

class Americano1 extends Coffee1{}
class Breve1 extends Coffee1{}
class Cappuccino1 extends Coffee1{}
class Latte1 extends Coffee1{}
class Mocha1 extends Coffee1{}

interface Generator1<X> {X to_come();}

class CoffeeGenerator1 implements Generator1<Coffee1>, Iterable<Coffee1>{
    
    private Class[] type1 = {Americano1.class, Breve1.class, Cappuccino1.class, Latte1.class, Mocha1.class};
    private Random rand = new Random(47);
    private int size = 0;
    public CoffeeGenerator1 (int s_z){this.size = s_z;}
    public CoffeeGenerator1 (){};

    public Coffee1 to_come(){
        try{
            return (Coffee1) type1[rand.nextInt(type1.length)].newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator1 implements Iterator<Coffee1>{

        int count = size;
        public boolean hasNext(){return count > 0;}
        public Coffee1 next(){
            count--;
            return CoffeeGenerator1.this.to_come();
        }
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

    public Iterator<Coffee1> iterator(){
        return new CoffeeIterator1();
    }
}

public class Example012 {
    public static void main(String args[]){
        TypeCounter tc = new TypeCounter(Coffee1.class);
        for(Coffee1 coffee1 : new CoffeeGenerator1(5)){
            System.out.println(coffee1.getClass().getSimpleName());
            tc.count(coffee1);
        }
        System.out.println(" ");
        System.out.println(tc);
    }
}
