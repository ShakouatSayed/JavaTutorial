package generics.Bounds;

interface HasColor{java.awt.Color getColor();}

class Colored<T extends HasColor>{
    T iteam;

    public Colored(T iteam){
        this.iteam = iteam;
    }

    T getIteam(){return iteam;}
    //the bound allows you to call a method
    java.awt.Color color(){return iteam.getColor();} 
}


class Dimension{public int x, y, z; }

    //this won't work -- class must be first and interface.
    //class ColoredDimension<T extends Dimension & HasColor> 
  //multiple bounds
  class ColoredDimension<T extends Dimension & HasColor>{
    T iteam;
    public ColoredDimension(T iteam){
        this.iteam = iteam;
    }
    java.awt.Color color(){return iteam.getColor();}

    int getX(){return iteam.x;}
    int getY(){return iteam.y;}
    int getZ(){return iteam.z;}
}

interface Weight{public int weight();}

//as with inheritance , you can have only use
//concreate class but multiple inheritance

class Solid<T extends Dimension & HasColor & Weight>{
    T iteam;
    public Solid(T iteam){this.iteam = iteam;}

    java.awt.Color color(){return iteam.getColor();} 

    public int getX(){return iteam.x;}
    public int getY(){return iteam.y;}
    public int getZ(){return iteam.z;}
    public int getWeight(){return iteam.weight();}
}

class DimensionOne{public int x, y, z, u;}


class AnotherDimension<T extends DimensionOne & HasColor & Weight>{
    T iteam;

    public AnotherDimension(T iteam){
        this.iteam = iteam;
    }

    public java.awt.Color color(){return iteam.getColor();}

    public int getX(){return iteam.x;}
    public int getY(){return iteam.y;}
    public int getZ(){return iteam.z;}
    public int getU(){return iteam.u;}
}

interface Height{public int height();}

class AnotherSolid<T extends DimensionOne & HasColor & Weight & Height>{
    T iteam;

    public AnotherSolid(T iteam){this.iteam = iteam;}

    public java.awt.Color color(){return iteam.getColor();}

    public int getX(){return iteam.x;}
    public int getY(){return iteam.y;}
    public int getZ(){return iteam.z;}
    public int getU(){return iteam.u;}

    public int getHeight(){return getHeight();}
}

class Bounded extends Dimension implements HasColor, Weight {
    
    public java.awt.Color getColor(){return null;}
    public int weight(){return 0;}
}

/**
 * BasicBounds
 */
public class BasicBounds {

    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
        solid.color();
        solid.getY();
        solid.getWeight();
        System.err.println(solid.getX());
    }
    
}