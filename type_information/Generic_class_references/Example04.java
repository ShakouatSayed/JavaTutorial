package type_information.Generic_class_references;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {

    private static int id;
    private final long count = id++;

    public String toString() {
        return Long.toString(count);
    }
}

public class Example04<T> {
    private Class<T> type;

    public Example04(Class<T> type) {
        this.type = type;
    }

    public  List<T> nElement(int types){
        List<T> list = new ArrayList<T>();
        try{
            for(int i = 0; i < types; i++){
                list.add(type.newInstance());
            }
        }catch(Exception e){
            System.out.println("Caught Exception."+e);
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void main(String args[]) {
        Example04<CountedInteger> coExample04 = new Example04<CountedInteger>(CountedInteger.class);
        System.out.println(coExample04.nElement(15));;
    }
}
