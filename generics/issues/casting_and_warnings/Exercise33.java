/* Exercise 33: (3) Repair GenericCast.java using an ArrayList.  */

package generics.issues.casting_and_warnings;

import java.util.*;

class VariableSizeStackTwo<T> {

    private ArrayList<T> storage = new ArrayList<T>();

    public int count(){return storage.size();}
    public void push(T iteam){storage.add(iteam);}
    public T pop(){return storage.remove(storage.size()-1);}
}

public class Exercise33 {
    public static void main(String[] args) {
        VariableSizeStackTwo<String> stirngs = new VariableSizeStackTwo<String>();

        for(String s : "A B C D E F G H I J".split(" "))
            stirngs.push(s);

        int countString = stirngs.count();

        for(int i = 0; i < countString; i++){
            String s = stirngs.pop();
            System.out.print(s+" ");
        }
    }
}
