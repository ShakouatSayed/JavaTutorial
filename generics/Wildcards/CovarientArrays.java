package generics.Wildcards;

class Fruit{}
class Apple extends Fruit{}
class Shakouat extends Apple{}
class Orange extends Fruit{}

public class CovarientArrays {
    public static void main(String[] args) {
        
        Fruit[] fruits = new Apple[50];
        fruits[0] = new Apple();
        fruits[1] = new Shakouat();

        try{
            fruits[0] = new Fruit();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            fruits[0] = new Orange();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
