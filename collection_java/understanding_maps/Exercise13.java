/* Exercise 13: (4) Use AssociativeArray Java to create a wordoccurrence counter,
mapping String to Integer. Using the net.mindview.util.TextFile utility in this book,
open a text file and break up the words in that file using whitespace and punctuation, and
count the occurrence of the words in that file.  */

package collection_java.understanding_maps;

import java.util.*;

import collection_java.filling_containers.using_abstract_classes.TextFile;

public class Exercise13 {
    public static void countWord(String fileName){
        Set<String> wordSet = new TreeSet<>(new TextFile(fileName, "\\W+"));
        AssoceativeArray<String, Integer> wordCount = new AssoceativeArray<>(wordSet.size());
        ArrayList<String> wordList = new ArrayList<>(new TextFile(fileName, "\\W++"));
        System.out.println("All in fill read : "+fileName + " "+wordList);
        for(String s: wordSet){
            int counter = 0;
            for(String ss : wordList){
                if(ss.equals(s))
                    counter++;
            }
            wordCount.put(s, counter);
        }
        System.out.println(wordCount);
    }
    public static void main(String[] args) {
        countWord("test.txt");
    }
}
