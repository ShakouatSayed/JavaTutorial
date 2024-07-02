package generics.issues.casting_and_warnings;
import java.util.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Widget{}

/**
 * NeedCasting  
 */
public class NeedCasting {

    public static void f(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
        
        @SuppressWarnings("unchecked")
        List<Widget> shape = List.class.cast(in.readObject());
        List<Widget> shape1 = (List<Widget>)in.readObject();
        System.out.println(shape1);

        //List<Widget> shape2 = List<Widget>in.readObject(); // this line is does n't compile
        List<Widget> shape3 = (List<Widget>)List.class.cast(in.readObject());
        //
    }

    public static void main(String[] args) {
        //f();
    }
}
