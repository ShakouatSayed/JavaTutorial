/* Exercise 29: (5) Create a generic method that takes as an argument a
Holder<List<?>>. Determine what methods you can and can’t call for the Holder and for
the List. Repeat for an argument of List<Holder<?>>. */

package generics.capture_conversion;

import java.util.*;

import generics.Wildcards.Holders;

public class Exercise29 {
    
    static  void f1(Holders<List<?>> holder){
       System.out.println("f1() - Holder methods");
       System.out.println("*********************");
       System.out.println("holder : "+holder);
       System.out.println("holder.get() : "+holder.getHolders());
       System.out.println("calling holder.set(Arrays.asList(2, 4, 8, 16))...");
       holder.setHolders(Arrays.asList(2, 4, 8, 16));
       int[] arr = {2, 4, 8, 16};
       System.out.println("int[] arr = "+Arrays.toString(arr));
       System.out.println("List integerList = Arrays.asList(arr)...");
       List integerList = Arrays.asList(arr);
       System.out.println("holder.equeals(integerList) : "+holder.equeals(integerList));
       List<Integer> exectIntegerList = new ArrayList<Integer>();
       exectIntegerList.add(2);
       exectIntegerList.add(4);
       exectIntegerList.add(8);
       exectIntegerList.add(16);
       System.out.println("List<Integer> exectIntegerList = new ArrayList<Integer>()");
       System.out.println("exectIntegerList.add(2)");
       System.out.println("exectIntegerList.add(4)");
       System.out.println("exectIntegerList.add(8)");
       System.out.println("exectIntegerList.add(16)");
       /*for(Number i : exectIntegerList)
           System.out.println(i);*/
        System.out.println("exectIntegerList : "+exectIntegerList.toString());
        System.out.println("holder.equeals(exectIntegerList) : "+holder.equeals(exectIntegerList));

        System.out.println("\nf1() - List methods");
        System.out.println("holder.getHolders() : "+holder.getHolders().toString());
        System.out.println("holder.getHolders().getClass() : "+holder.getHolders().getClass());
        System.out.println("List<?> unboundedList = holder.getHolders()");
        List<?> unboundedList = holder.getHolders();
        System.out.println("unboundedList : "+unboundedList.toString());
        System.out.println("List rawList = holder.getHolders()");
        List rawList = holder.getHolders();
        System.out.println("unboundedList.equeals(rawList) : "+unboundedList.equals(rawList));
        System.out.println("unboundedList.contains(16) : "+unboundedList.contains(16));
        System.out.println("Collection<Integer> coll = new HashSet<Integer>()");
        Collection<Integer> coll = new HashSet<Integer>() ;
        System.out.println("add 2, 4, 8, 16 to coll...");
        coll.add(2);
        coll.add(4);
        coll.add(8);
        coll.add(16);
        System.out.println("unboundedList.cointainsAll(coll) : "+ unboundedList.containsAll(coll));
        System.out.println("unboundedList.equeals(coll) : "+ unboundedList.equals(coll));
        System.out.println("unboundedList : "+unboundedList.toString());
        System.out.println("coll : "+coll.toString());
        System.out.println("coll.getClass() : "+coll.getClass());
        System.out.println("unboundedList.get(0): "+unboundedList.get(0));
        System.out.println("unboundedList.hashCode(): "+unboundedList.hashCode());
        System.out.println("unboundedList.indexOf(8) : "+unboundedList.indexOf(8));
        System.out.println("ListIterator listIterator = unboundedList.listIterator()");
        ListIterator listIterator = unboundedList.listIterator();
        System.out.println("listIterator.next() : "+listIterator.next());
        System.out.println("ununboundedList.size() : "+unboundedList.size());
        System.out.println("unboundedList.subList(1, 2) : "+unboundedList.subList(1, 2));
        System.out.println("Object[] objectArray = unboundedList.toArray()");
        Object[] objectArray = unboundedList.toArray();
        System.out.println("objectArray : "+ objectArray );
        System.out.println("objectArray includs : 2, 4, 8, 16");
        Number[] numArrays = unboundedList.toArray(new Number[4]);
        System.out.println("numArrays : "+numArrays);
        System.out.print("numArrays includes : ");
        for(Number n : numArrays)
            System.out.print(n+" ");
    }

    static  void f2(List<Holders<?>> list){
        System.out.println("\n\nf2() - List method");
        System.out.println("******************");
        System.out.println("add Holders<Integer>(), Holders<Integer>() and Holders<Integer>() to list...");
        list.add(new Holders<Integer>(10));
        list.add(new Holders<String>("Shakouat Hossen Sayed"));
        list.add(new Holders<Double>(3.1416));
        System.out.println("list : "+list);
        System.out.println("what holder contain : ");
        //System.out.println(list.containsAll());
        for(Holders h : list)
            System.out.print(h.getHolders()+ " "+" ");
        System.out.println("list.add(3, new Holders<Float>(16.0F))...");
        System.out.println("list(size) : "+list.size());
        System.out.println("list : "+list);
        System.out.println("what holder contain");
        System.out.println("list.clear() ");
        list.clear();
        System.out.println("list : "+list.toString());
        System.out.println("Collection<Holders<?>> coll = new ArrayList<Holders<?>>()");
        Collection<Holders<?>> coll = new ArrayList<Holders<?>>();
        System.out.println("adding Holders<Integer>, Holders<String>, Holders<Double> to coll");
        coll.add(new Holders<String>("Hi"));
        coll.add(new Holders<Integer>(10));
        coll.add(new Holders<Double>(3.1416));
        System.out.println("coll.addAll(coll) ...");
        list.addAll(coll);
        System.out.println("list : "+list);
        System.out.println("what holders contains ");
        for(Holders h : coll){
            System.out.print(h.getHolders()+" ");
        }
        System.out.println("\nObject clonedList = ((ArrayList)list).clone()");
        Object clonedList = ((ArrayList)list).clone();
        System.out.println("clonedList : "+clonedList);
        System.out.println("((ArrayList)list).clone().getClass() : "+((ArrayList)list).clone().getClass());
        System.out.println("Holders<Float> floatHolders = new Holders<>(1.6F)");
        Holders<Float> floatHolders = new Holders<Float>(1.6F);
        System.out.println("list.set(0, floatHolders)...");
        //list.set(0, floatHolders);
        System.out.println("list : "+list);
        System.out.println("what holders contain ");
        for(Holders h: list){
            System.out.print(h.getHolders().getClass().getSimpleName()+" : "+h.getHolders()+" ");
        }
        System.out.println("list.contains(list.set(0, floatHolders)): "+list.contains(list.set(0, floatHolders)));
        System.out.println("list.contains(3.1416F)): "+list.contains(3.1416F));
        System.out.println("list.contains(floatHolders)): "+list.contains(floatHolders));
        System.out.println("list.add(null)...");
        list.add(null);
        System.out.println("list.isEmpty() : "+list.isEmpty());
        System.out.println("list.contains(null) : "+list.contains(null));
        System.out.println("list.indexof(floatHolders) : "+list.indexOf(floatHolders));
        System.out.println("list.get(0).getHolders()"+list.get(0).getHolders());
        System.out.println("list.indexOf(null) : "+list.indexOf(null));
        System.out.println("list.lastIndexOf(null) : "+list.lastIndexOf(null));
        System.out.println("list.lastIndexOf(null) : "+list.lastIndexOf(null));
        System.out.println("list.remove()... ");
        list.remove(0);
        System.out.println("list : "+list);
        for(Holders h : list){
            if(h ==null)
                System.out.println("null ");
            else
                System.out.print(h.getHolders().getClass().getSimpleName()+" : "+h.getHolders()+" ");
        }
        System.out.println("list : "+list);
        System.out.println("what holders contains ");
        for(Holders h : list){
            if(h==null)
                System.out.println("null");
            else
                System.out.print(h.getHolders() + " ");
        }
        System.out.println("list.add(null)...");
        list.add(null);

        System.out.println("\nf2() - Holders methods");
        System.out.println("***************");
        System.out.println("list : "+list);
        System.out.println("what's in list : "+list.getClass());
        System.out.println("list.remove(2).... ");
        list.remove(2);
        System.out.println("what holders contains");
        for(Holders h: list){
           if(h == null)
               System.out.println("null ");
           else
               System.out.print(h.getHolders().getClass().getSimpleName()+" : "+h.getHolders() + " ");
        }
        System.out.println("Holders<?> holders1 = list.get(0) ");
        System.out.println("Holders<?> holders2 = list.get(1) ");
        Holders<?> holders1 = list.get(0);
        Holders<?> holders2 = list.get(1);
        System.out.println("class "+holders1.getHolders().getClass().getSimpleName()+" - "+list.get(0).getClass().getSimpleName());
        System.out.println("class "+holders2.getHolders().getClass().getSimpleName()+" - "+list.get(1).getClass().getSimpleName());
    }

    public static void main(String[] args) {
        f1(new Holders<List<?>>());
        List<Holders<?>> list = new ArrayList<>();
        f2(list);
    }
}
