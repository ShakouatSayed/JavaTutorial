package generics.using_function_objects_strategies;
import java.util.*;

/**
 * Exercise42
 */

interface CombinerOne<T> {T combines(T x, T y);}
interface UrinaryFunctionOne<R, T> {R functions(T x);}
interface CollectorOne<T> extends UrinaryFunctionOne<T, T>{T results();}

class Food{
    private String foodName = " ";
    public Food(){foodName = " ";}
    public Food(String name){foodName = name;}
    public void set(String name){foodName = name;}
    public String get(){return foodName;}
    public void eat(){foodName = " ";}
    public String toString(){return "Food : "+foodName;}
}


class Drink{
    private String drinkName = " ";
    public Drink(){drinkName = " ";}
    public Drink(String name){drinkName = name;}
    public void set(String name){drinkName = name;}
    public String get(){return drinkName;}
    public void eat(){drinkName = " ";}
    public String toString(){return "Drink : "+drinkName;}
}

public class Exercise42 {

    public  static <T> T reduce(Iterable<T> seq, CombinerOne<T> combinerOne){
        Iterator<T> it = seq.iterator();
        if(it.hasNext()){
            T result = it.next();
            while (it.hasNext()) {
                result = combinerOne.combines(result, it.next());
            }
            return result;
        }
        return null;
    }  
    
    public static <T> CollectorOne<T> forEach(Iterable<T> seq, CollectorOne<T> func){
        for(T t: seq)
            func.functions(t);
        return func;
    }

    static class MealMeaker implements CombinerOne<Food>{
        public Food combines(Food x, Food y){
            return new Food(x.get() + ", " + y.get());
        }
    }

    static class DrinkMeaker implements CombinerOne<Drink>{
        public Drink combines(Drink x, Drink y){
            return new Drink(x.get() + ", " + y.get());
        }
    }

    static class CockerMeal implements CollectorOne<Food> {
        private Food f = new Food(" ");
        public Food functions(Food x){
            f = new Food(f.get() + ", " + x.get());
            return f;
        }
      
        public Food results() {return f;}
    }

    public static void main(String[] args) {
        List<Food> foodList = Arrays.asList(new Food("Rice"), new Food("Byrani"), new Food("Kacchi Byrani"));
        Food f = reduce(foodList, new MealMeaker());
        System.out.println(f);
        
        List<Drink> drinkList = Arrays.asList(new Drink("Water"), new Drink("Mango Juccie"), new Drink("Mango and Liccie Juccie"));
        Drink d = reduce(drinkList, new DrinkMeaker());
        System.out.println(d);
        
        System.out.println(forEach(foodList, new CockerMeal()).results());
    }
}