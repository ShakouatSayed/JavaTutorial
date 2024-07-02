package generics.Bounds;

class HoldIteam<T> {
    T iteam;
    public HoldIteam(T iteam){
        this.iteam = iteam;
    }
    public T getIteam(){return iteam;}
}

class ColoredTwo<T extends HasColor> extends HoldIteam<T>{
    public ColoredTwo(T iteam){super(iteam);}
    java.awt.Color color(){return iteam.getColor();}
}

class ColoredDimensionTwo<T extends Dimension & HasColor> extends ColoredTwo<T>{
    public ColoredDimensionTwo(T iteam){super(iteam);}
    public int getX(){return iteam.x;}
    public int getY(){return iteam.y;}
    public int getZ(){return iteam.z;}
}

class SolidTwo<T extends Dimension & HasColor & Weight> extends ColoredDimensionTwo<T>{
    public java.awt.Color color(){return iteam.getColor();}
    public SolidTwo(T iteam){super(iteam);}
    public int weight(){return iteam.weight();}
}

public class InheritsBounds {
    public static void main(String[] args) {
        SolidTwo<Bounded> s = new SolidTwo<Bounded >(new Bounded());
        s.color();
        s.getY();
        s.weight();
    }
}
