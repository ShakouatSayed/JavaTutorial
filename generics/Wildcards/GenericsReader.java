package generics.Wildcards;

import java.util.*;

public class GenericsReader {
    static <T> T readExtec(List<T> list ){
        return list.get(0);
    }

    static List<Apple> applesList = Arrays.asList(new Apple());
    static List<Fruit> fruitList = Arrays.asList(new Fruit());

     
    static void f1(){
        Apple apple = readExtec(applesList);
        Fruit fruit = readExtec(fruitList);
        fruit =  readExtec(applesList);
        System.out.println(fruit.getClass().getSimpleName());
        System.out.println(apple.getClass().getSimpleName());
    }

    static class Reader<T> {
        T readExtec(List<T> list){return list.get(0);}
    }

    static void f2(){
        Reader<Fruit> fruitReader = new Reader<Fruit>();

        Fruit fruit = fruitReader.readExtec(fruitList);
        System.out.println(fruit.getClass().getSimpleName());
    }

    static class CovaritentReader<T>{
        T readExtect(List<? extends T> list){
            return list.get(0);
        }
    }

    static void f3(){
        CovaritentReader<Fruit> covaritentReader = new CovaritentReader<Fruit>();
        
        Fruit fruit = covaritentReader.readExtect(fruitList);
        Fruit apple =  covaritentReader.readExtect(applesList);
        
        System.out.println(apple.getClass().getSimpleName());
        System.out.println(fruit.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        f1();f2();f3();
    }

}
