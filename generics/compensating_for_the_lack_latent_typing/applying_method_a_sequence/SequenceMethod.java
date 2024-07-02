
package generics.compensating_for_the_lack_latent_typing.applying_method_a_sequence;

import java.lang.reflect.Method;
import java.util.*;

/**
 * SequenceMethod
 */

 class Apply{
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args){
        try{
            for(T t: seq)
                f.invoke(t, args);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
 }

 class Shape{
    public void rotate(){System.out.println(this + " Rotate ");}
    public void reSize(int newSize){System.out.println(this + " Resize "+newSize);}
 }

 class Square extends Shape{}

 class FieldList<T> extends ArrayList<T> {
    public FieldList(Class<? extends T> type, int size){
        try{
            for(int i = 0; i < size; i++)
                add(type.newInstance());
        }catch(Exception e){
            throw new RuntimeException();
        }
    }
 }


public class SequenceMethod {
    public static void main(String[] args) throws Exception {
        List<Shape> shapeL = new ArrayList<>();
        for(int i = 0; i < 5; i++)
            shapeL.add(new Shape());
        
        Apply.apply(shapeL, Shape.class.getMethod("rotate"));
        Apply.apply(shapeL, Shape.class.getMethod("reSize", int.class), 5);

        List<Square> squareL = new ArrayList<>();
        for(int i = 0; i < 5; i++)
            squareL.add(new Square());

        Apply.apply(squareL, Square.class.getMethod("rotate"));
        Apply.apply(squareL, Square.class.getMethod("reSize", int.class), 5);

        Apply.apply(new FieldList<Shape>(Shape.class, 5), Shape.class.getMethod("rotate"));
        Apply.apply(new FieldList<Shape>(Shape.class, 5), Shape.class.getMethod("reSize", int.class), 5);

        SimpleQueue<Shape> squareQueue = new SimpleQueue<>();
        for(int i = 0; i < 5; i++)
            squareQueue.add(new Shape()); 
            squareQueue.add(new Square()); 

        Apply.apply(squareQueue, Square.class.getMethod("reSize", int.class), 5);
    }  
}