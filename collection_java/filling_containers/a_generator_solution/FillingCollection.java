package collection_java.filling_containers.a_generator_solution;

import java.util.*;

/**
 * FillingCollection
 */

 class StringAddress{
    private String s= "";
    public StringAddress(String s ){this.s = s;}
    public String toString(){return super.toString() + " "+ s;}
 }

public class FillingCollection {

    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list, new StringAddress("World"));
        System.out.println(list);
    }
}