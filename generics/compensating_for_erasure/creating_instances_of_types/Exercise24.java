/* Exercise 24: (3) Modify Exercise 21 so that factory objects are held in the Map instead
of Class<?>.  */

package generics.compensating_for_erasure.creating_instances_of_types;

import java.util.*;


interface ExFactoryTwo<T>{T create();}

class BuildingFactory implements ExFactoryTwo<Ex24Building>{
    public Ex24Building create(){
        return new Ex24Building();
    }
}

class HouseFactory implements ExFactoryTwo<Ex24House>{
    public Ex24House create(){
        return new Ex24House();
    }
}


class Ex24Building{}
class Ex24House extends Ex24Building{};

public class Exercise24<T> {

    Class<?> kind;

    @SuppressWarnings("rawtypes")
    Map<String, ExFactoryTwo> map;

    public Exercise24(Class<?> kind){
        this.kind = kind;
    }

    @SuppressWarnings("rawtypes")
    public Exercise24(Class<?> kind, Map<String, ExFactoryTwo> map ){
        this.kind = kind;
        this.map = map;
    }

    public boolean f(Object arg){
        return kind.isInstance(arg);
    }
    
    @SuppressWarnings("rawtypes")
    public void addType(String typeName, ExFactoryTwo factory){
        map.put(typeName, factory);
    }

    public Object createNew(String typeName) throws InstantiationException , IllegalAccessException{
        if(map.containsKey(typeName))
            return map.get(typeName).create();
        System.out.println("Error : cannot creat an instant  type " + typeName);
        return null;
    }

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        Exercise24<Ex24Building> ex24Building = new Exercise24<>(Ex24Building.class);
        System.out.println(ex24Building.f(new Ex24Building()));
        System.out.println(ex24Building.f(new Ex24House()));

        Exercise24<Ex24House> ex24HouseOne = new Exercise24<>(Ex24House.class);
        System.out.println(ex24HouseOne.f(new Ex24Building()));
        System.out.println(ex24HouseOne.f(new Ex24House()));

        Exercise24<Ex24Building> ex24BuildingTwo = new Exercise24<>(Ex24Building.class, new HashMap<String, ExFactoryTwo>());
        ex24BuildingTwo.addType("Ex24Building", new HouseFactory());
        ex24BuildingTwo.addType("Ex24House", new BuildingFactory());
        System.out.println("ex24BuildingTwo.map : "+ex24BuildingTwo.map);

        try{

            Ex24Building b = new Ex24Building();
            Ex24House h = new Ex24House();
            System.out.println("b.getClass().getName(): "+b.getClass().getName());
            System.out.println("h.getClass().getName(): "+h.getClass().getName());

            System.out.println("b instanceof House : "+(b instanceof Ex24Building));
            System.out.println("h instanceof House : "+(h instanceof Ex24Building));

            System.out.println("b instanceof Building : "+(h instanceof Ex24House));
            System.out.println("h instanceof Building : "+(h instanceof Ex24House));
            ex24BuildingTwo.createNew("Integer");

        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
