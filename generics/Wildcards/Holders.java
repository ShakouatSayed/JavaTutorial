package generics.Wildcards;

public class Holders<T> {
    private T values;
    public Holders(){}
    public Holders(T val){values = val;}

    public void setHolders(T val){values = val;}
    public T getHolders(){return values;}

    public boolean equeals(Object obj){return values.equals(obj);}

    public static void main(String[] args) {
        Holders<Apple> holders = new Holders<Apple>(new Apple());

        Apple apple = holders.getHolders();
        holders.setHolders(apple);

        Holders<? extends Fruit> fruitHolders = holders;
        Fruit fruit = fruitHolders.getHolders();
        apple = (Apple) fruitHolders.getHolders();

        try{
            Orange orange = (Orange) fruitHolders.getHolders();
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println(fruit.equals(fruit));
    }
}


