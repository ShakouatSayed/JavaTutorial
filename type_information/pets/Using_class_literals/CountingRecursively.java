package type_information.pets.Using_class_literals;

import java.util.HashMap;
import java.util.Map;


public class CountingRecursively extends HashMap<Class<?>, Integer>{
    private Class<?> base_type;
    public CountingRecursively(Class<?> bClass){
        this.base_type = bClass;
    }

    public void count(Object ob){
        Class<?> type = ob.getClass();
        if(!base_type.isAssignableFrom(type))
            throw new RuntimeException(ob+"incorrect type: "+type+"Should by type of "+base_type);
        countClass(type);
    }
   
    public void countClass(Class<?> type){
        Integer quantety = get(type);
        put(type, quantety == null?1: quantety+1);
        Class<?> super_class = type.getSuperclass();
        if(super_class != null && base_type.isAssignableFrom(super_class))
            countClass(super_class);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("{\n");
        for(Map.Entry<Class<?>, Integer>pair:entrySet()){
            sb.append(pair.getKey().getSimpleName());
            sb.append("=");
            sb.append(pair.getValue());
            sb.append(",\n");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("\n}"+"\n");
        return sb.toString();
    }
}


