package generics.Wildcards;

import java.util.*;

public class GenericWriting {
    static <T> void writingExcet(List<T> list, T iteam){
        list.add(iteam);
    }

    static List<Apple> appleList = new ArrayList<Apple>();
    static List<Fruit> fruitList = new ArrayList<Fruit>();

    static void f1(){
        writingExcet(appleList, new Apple());
        writingExcet(fruitList, new Fruit());
    }

    static <T> void writeWithWillcards(List<? super T> list, T iteam){
        list.add(iteam);
    }

    static void f2(){
        writeWithWillcards(appleList, new Apple());
        writeWithWillcards(fruitList, new Apple());
    }

    public static void main(String[] args) {
        f1();f2();
    }
}
