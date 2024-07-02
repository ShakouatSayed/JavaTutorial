package collection_java.sets_and_storage_order;

import java.util.*;

class SetType{
    int i;
    public SetType(int n){
        i = n;
    }
    public boolean equels(Object o){
        return o instanceof SetType &&(i==((SetType)o).i);
    }
    public String toString(){
        return Integer.toString(i);
    }
}

class HashType extends SetType{
    public HashType(int n){super(n);}
    public int hasCode(){return i;}
}

class TreeType extends SetType implements Comparable<TreeType>{
    public TreeType(int n){
        super(n);
    }
    public int compareTo(TreeType arg){
        return arg.i < i ? -1 : (arg.i == i ? 0 : i);
    }
}

class TypeOfTest{
    static <T> Set<T> fill(Set<T> sets, Class<T> type){
        try{
            for(int i = 0; i < 10; i++){
                sets.add(type.getConstructor(int.class).newInstance(i));
            }
        }catch(Exception e){
            throw new RuntimeException();
        }
        return sets;
    }

    static <T> void test(Set<T> sets, Class<T> type){
        fill(sets, type);
        fill(sets, type);
        fill(sets, type);
        System.out.println(sets);
    }
}

public class SetsAndStorage {
    public static void main(String[] args) {
        TypeOfTest.test(new HashSet<>(), SetType.class);
        TypeOfTest.test(new HashSet<>(), TreeType.class);
        TypeOfTest.test(new HashSet<>(), HashType.class);
        TypeOfTest.test(new LinkedHashSet<>(), HashType.class);
        TypeOfTest.test(new LinkedHashSet<>(), TreeType.class);
        TypeOfTest.test(new LinkedHashSet<>(), SetType.class);
        TypeOfTest.test(new TreeSet<>(), TreeType.class);
        TypeOfTest.test(new TreeSet<>(), SetType.class);
        TypeOfTest.test(new TreeSet<>(), HashType.class);
        try{
            TypeOfTest.test(new TreeSet<>(), SetType.class);
        }catch(Exception e){
            System.err.println("message : "+e);
        }
        try{
            TypeOfTest.test(new TreeSet<>(), TreeType.class);
        }catch(Exception e){
            System.err.println("message : "+e);
        }
        try{
            TypeOfTest.test(new TreeSet<>(), HashType.class);
        }catch(Exception e){
            System.err.println("message : "+e);
        }
    }
}
