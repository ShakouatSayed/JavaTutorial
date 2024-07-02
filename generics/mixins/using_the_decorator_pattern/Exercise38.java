/* Exercise 38: (4) Create a simple Decorator system by starting with basic coffee, then
providing decorators of steamed milk, foam, chocolate, caramel and whipped cream.  */


package generics.mixins.using_the_decorator_pattern;

/**
 * Exercise38
 */

class BasicCoffee{
    private String coffee;

    public void set(String val){coffee = val;}
    public String get(){return coffee;}
}

class DecoratorOne extends BasicCoffee{
    protected BasicCoffee basicCoffee;

    public DecoratorOne(BasicCoffee basicCoffee){this.basicCoffee = basicCoffee;}
    public void set(String val){basicCoffee.set(val);}
    public String get(){return basicCoffee.get();}
}

class SteamedMilk extends DecoratorOne{
    private String steamedMilk = "SteamedMilk";

    public SteamedMilk(BasicCoffee basicCoffee){super(basicCoffee);}
    public String getSteamedMikl(){return steamedMilk;}
}

class Foam extends DecoratorOne{
    private String foam = "foam";

    public Foam(BasicCoffee basicCoffee){super(basicCoffee);}
    public String getFoam(){return foam;}
}

class Chocolate extends DecoratorOne{
    private String chocolate = "chocolate";

    public Chocolate(BasicCoffee basicCoffee){super(basicCoffee);}
    public String getChocolate(){return chocolate;}
}

class Caramel extends DecoratorOne{
    private String caramel = "caramel";

    public Caramel(BasicCoffee basicCoffee){super(basicCoffee);}
    public String getCharmel(){return caramel;}
}

class WhippedCream extends DecoratorOne{
    private String whippedCream = "whipped cream";

    public WhippedCream(BasicCoffee basicCoffee){super(basicCoffee);}
    public String getWhippedCream(){return whippedCream;}
}
 

public class Exercise38 {
    public static void main(String[] args) {
        Foam foam = new Foam(new BasicCoffee());
        SteamedMilk steamedMilk2 = new SteamedMilk(new Foam(new Chocolate(new Caramel(new WhippedCream(new BasicCoffee())))));
        System.out.println(foam.getClass().getName());
        System.out.println(steamedMilk2);


    }
}