/* Exercise 4: (2) Create a Collection initializer that opens a file and breaks it into words
using TextFile, and then uses the words as the source of data for the resulting Collection.
Demonstrate that it works. */

package collection_java.filling_containers.using_abstract_classes;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

/**
 * Exercise04
 */
public class Exercise04 {

    public static Collection<String> collectionWithFile(String fileName){
        String[] s = TextFile.read(fileName).split(" ");
        return Arrays.asList(s);
    }

    public static Collection<String> collectionWithFile2(String fileName){
        return new TreeSet<>(new TextFile(fileName, "\n"));
    }

    public static void main(String[] args) {
        System.out.println(Exercise04.collectionWithFile("test.txt"));
        System.out.println(Exercise04.collectionWithFile2("test2.txt"));
    }
}