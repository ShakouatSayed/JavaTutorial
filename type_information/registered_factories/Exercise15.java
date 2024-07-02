/*
 * Thinking in Java.
 * Exercise Solution 15.
 * 
 * Exercise 15: (4) Implement a new PetCreator using Registered Factories, and
 * modify
 * the Pets Facade so that it uses this one instead of the other two. Ensure
 * that the rest of the
 * examples that use Pets .Java still work correctly.
 */

 package type_information.registered_factories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



interface Factories1<F>{F toFactories();}

// pets this individual 
class Individual1 implements Comparable<Individual1>{
    private int count = 0;
    private int id = count++;
    private String name;

    //use the constractor and parameter
    public Individual1(String name){
        this.name = name;
    }

    //the empty constractor
    public Individual1(){}

    public String toString(){
        return getClass().getSimpleName()+(name!=null ? "":" " +name);
    }

    public long id(){
        return id;
    }

    public boolean equels1(Object obj){
        return obj instanceof Individual1 &&  id == ((Individual1)obj).id;
    }

    public int hasCode1(){
        int num = 17;
        int result;
        if(name != null){
            return 37 * num + name.hashCode();
        }
        result = 37 * num + (int)id;
        return result;
    }

    public int compareTo(Individual1 arg){
        String frist = getClass().getSimpleName();
        String arg_first = arg.getClass().getSimpleName();
        int compare_string1 = frist.compareTo(arg_first);
        if(compare_string1 != 0)
            return compare_string1;
        if(name != null && arg.name!=null){
            int second_compare_string1 = name.compareTo(arg_first);
            if (second_compare_string1 != 0){
                return second_compare_string1;
            }
        }
         return arg.id < id ? -1: (arg.id == id?0:1);
    }
}


// using factory classes:
class Pet extends Individual1{}

class Person extends Individual1{
    public static class Factories1 implements type_information.registered_factories.Factories1<Person>{
        public Person toFactories(){
            return new Person();
        }
    }
}

class Cat extends Pet{
    public static class Factories1 implements type_information.registered_factories.Factories1<Cat>{
        public Cat toFactories(){
            return new Cat();
        }
    } 
}

class CatEgyptianMau extends Cat{
    public static class Factories1 implements type_information.registered_factories.Factories1<CatEgyptianMau>{
        public CatEgyptianMau toFactories(){
            return new CatEgyptianMau();
        }
    } 
}

class CatManx extends Cat{
    public static class Factories1 implements type_information.registered_factories.Factories1<CatManx>{
        public CatManx toFactories(){
            return new CatManx();
        }
    } 
}

class CatManxCymric extends CatManx{
    public static class Factories1 implements type_information.registered_factories.Factories1<CatManxCymric>{
        public CatManxCymric toFactories(){
            return new CatManxCymric();
        }
    } 
}

class Dog extends Pet{
    public static class Factories1 implements type_information.registered_factories.Factories1<Dog>{
        public Dog toFactories(){
            return new Dog();
        }
    } 
}

class Mutt extends Dog{
    public static class Factories1 implements type_information.registered_factories.Factories1<Mutt>{
        public Mutt toFactories(){
            return new Mutt();
        }
    } 
}

class Pugg extends Dog{
    public static class Factories1 implements type_information.registered_factories.Factories1<Pugg>{
        public Pugg toFactories(){
            return new Pugg();
        }
    } 
}

class Rodent extends Pet{
    public static class Factories1 implements type_information.registered_factories.Factories1<Mouse>{
        public Mouse toFactories(){
            return new Mouse();
        }
    } 
}

class Mouse extends Rodent{
    public static class Factories1 implements type_information.registered_factories.Factories1<Mouse>{
        public Mouse toFactories(){
            return new Mouse();
        }
    } 
}

class Ret extends Rodent{
    public static class Factories1 implements type_information.registered_factories.Factories1<Ret>{
        public Ret toFactories(){
            return new Ret();
        }
    } 
}


class Hamster extends Rodent{
    public static class Factories1 implements type_information.registered_factories.Factories1<Hamster>{
        public Hamster toFactories(){
            return new Hamster();
        }
    } 
}

class Part2{
    public String tosString(){
        return getClass().getSimpleName();
    }

    private static List<Factories1<? extends Pet>> to_list = new ArrayList<Factories1<? extends Pet>>();

    static{
        to_list.add(new Cat.Factories1());
        to_list.add(new CatEgyptianMau.Factories1());
        to_list.add(new CatManx.Factories1());
        to_list.add(new CatManxCymric.Factories1());
        to_list.add(new Dog.Factories1());
        to_list.add(new Mutt.Factories1());
        to_list.add(new Pugg.Factories1());
        to_list.add(new Rodent.Factories1());
        to_list.add(new Ret.Factories1());
        to_list.add(new Mutt.Factories1());
        to_list.add(new Hamster.Factories1());
    }

    private static Random rand = new Random(127);
    public static Pet createRandom(){
        int n = rand.nextInt(to_list.size());
        return to_list.get(n).toFactories(); 
    }
}



abstract class PatCreator1{
    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet1(){
        return Part2.createRandom();
    }


    public Pet[] createManyPets(int size){
        Pet[] new_pet = new Pet[size];
        for(int i = 0; i < 10; i++)
             new_pet[i] = randomPet1();
        return new_pet; 
    }

    public ArrayList<Pet> toListPet(int size){
        ArrayList<Pet> pet_arr_list =  new ArrayList<Pet>();
        Collections.addAll(pet_arr_list, createManyPets(size));
        return pet_arr_list;
    }
}

class ForNameCreator1 extends PatCreator1{
    private static List<Class<? extends Pet>> to_list_arr = new ArrayList<Class<? extends Pet>>();
    private static String[] type_name = {
        "type_information.registered_factories.Cat",
        "type_information.registered_factories.CatEgyptianMau",
        "type_information.registered_factories.CatManx",
        "type_information.registered_factories.CatManxCymric",
        "type_information.registered_factories.Dog",
        "type_information.registered_factories.Mutt",
        "type_information.registered_factories.Pugg",
        "type_information.registered_factories.Rodent",
        "type_information.registered_factories.Mouse",
        "type_information.registered_factories.Hamster",
        "type_information.registered_factories.Ret"
    };

    @SuppressWarnings("Uncheked")
    private static void loader(){
        try{
            for(String name: type_name)
                to_list_arr.add((Class<? extends Pet>)Class.forName(name));
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    static {loader();}

    public List<Class<? extends Pet>> types(){
        return types();
    }
}

class LiteralPetCreator1 extends PatCreator1{
    public static final List<Class<? extends Pet>> new_type = Collections.unmodifiableList(Arrays.asList(Cat.class, CatEgyptianMau.class, CatManx.class, CatManxCymric.class, Dog.class, Mutt.class, Pugg.class, Rodent.class, Mouse.class, Ret.class, Pet.class));
    public static final List<Class<? extends Pet>> all_type = new_type.subList(new_type.indexOf(Mutt.class), new_type.size());
    public  List<Class<? extends Pet>> types(){
        return all_type;
    }
    public static void main(String args[]){
        System.out.println(all_type);  
    }
}

class Pets1 {
    public static PatCreator1 petCretor1 = new LiteralPetCreator1();

    public static Pet randomPet(){
        return Part2.createRandom();
    }

    public static Pet[] createManyPet(int size){
        return petCretor1.createManyPets(size);
    }

    public static ArrayList<Pet> toListPets(int size){
        return petCretor1.toListPet(size);
    }
}