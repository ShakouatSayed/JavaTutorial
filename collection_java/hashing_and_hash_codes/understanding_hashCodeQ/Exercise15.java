/* Exercise 15: (1) Repeat Exercise 13 using a SlowMap.*/


package collection_java.hashing_and_hash_codes.understanding_hashCodeQ;

import java.util.*;


import collection_java.filling_containers.using_abstract_classes.TextFile;
/**
 * Exercise15
 */
public class Exercise15 {

    public static void countWord(String fileName){
        ArrayList<String> wordList = new ArrayList<>(new TextFile(fileName, "\\W++"));
        SlowMap<String, Integer> wordCount = new SlowMap<>();
        System.out.println("All word count : "+fileName + " : "+wordCount);
        Iterator<String> wordIterator = wordList.iterator();
        while (wordIterator.hasNext()) {
            String wordString = wordIterator.next();
            if(!(wordCount.containsKey(wordString))){
                wordCount.put(wordString, 1);
            }else{
                int wordInt = wordCount.get(wordString);
                wordCount.put(wordString, ++wordInt);
            }
        }
        System.out.println(wordCount);
    }
    public static void main(String[] args) {
        countWord("test.txt");
    }
}