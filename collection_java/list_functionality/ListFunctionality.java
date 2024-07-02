package collection_java.list_functionality;

import java.util.*;

import collection_java.filling_containers.using_abstract_classes.Countries;

public class ListFunctionality {
    public static  boolean b;
    public static  String s;
    public static  int i ;
    public static  Iterator<String> iterator ;
    public static ListIterator<String> listIterator;
    public static void basicTest(List<String> a){
        a.add("s");
        a.add(1, "sayed");
        a.addAll(Countries.FlyWeightMap.names(6));
        a.addAll(1, Countries.FlyWeightMap.names(6));
        System.out.println(a);
        System.out.println(a);
        b = a.contains("sayed");
        b = a.containsAll(Countries.FlyWeightMap.names(6));
        System.out.println(a);
        s = a.get(1);
        i = a.indexOf("a");
        b = a.isEmpty();
        System.out.println(a);
        iterator = a.iterator();
        listIterator = a.listIterator();
        listIterator = a.listIterator(3);
        i = a.lastIndexOf("b");
        a.remove(1);
        a.remove("s");
        a.set(1, "hi");
        System.out.println(a);
        a.removeAll(Countries.FlyWeightMap.names(6));
        a.retainAll(Countries.FlyWeightMap.names(6));
        i = a.size();
        a.clear();
    }

    public static void iterMotion(List<String> a){
        ListIterator<String> lI = a.listIterator();
        b = lI.hasNext();
        b = lI.hasPrevious();
        s = lI.next();
        i = lI.nextIndex();
        s = lI.previous();
        i = lI.previousIndex();
    }

    public static void listManipulation(List<String> a){
        ListIterator<String> lI = a.listIterator();
        lI.add("sayed");
        lI.next();
        System.out.println(lI);
        lI.remove();
        lI.next();
        System.out.println(lI);
        lI.set("41");
    }

    public static void testList(List<String> a){
        System.out.println(a);
        List<String> b = (List<String>) Countries.FlyWeightMap.names(6);
        System.out.println(b);
        a.addAll(b);
        System.out.println(a);
        ListIterator<String> x = a.listIterator(a.size()/2);
        x.add("sayed");
        System.out.println(x);
        System.out.println(" x.next() :"+x.next());
        x.set("47");     
        System.out.println(x);
        x = a.listIterator(a.size());
        System.out.println(x);
        while (x.hasPrevious()) {
            System.out.println(x.previous()+" ");;
        }
        System.out.println();
        System.out.println("End of the has next.");
    }

    public static void testLinkedList(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(Countries.FlyWeightMap.names(5));
        linkedList.addFirst("sayed");
        linkedList.addFirst("sayed");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }

    public static void main(String[] args) {
        basicTest(new LinkedList<>(Countries.FlyWeightMap.names(3)));
        basicTest(new ArrayList<>(Countries.FlyWeightMap.names(3)));
        iterMotion(new LinkedList<>(Countries.FlyWeightMap.names(3)));
        iterMotion(new ArrayList<>(Countries.FlyWeightMap.names(3)));
        testList(new LinkedList<>(Countries.FlyWeightMap.names(3)));
        listManipulation(new LinkedList<>(Countries.FlyWeightMap.names(3)));
        listManipulation(new ArrayList<>(Countries.FlyWeightMap.names(3)));
        testLinkedList();
    }
}
