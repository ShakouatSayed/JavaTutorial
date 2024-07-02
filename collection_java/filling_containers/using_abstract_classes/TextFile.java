package collection_java.filling_containers.using_abstract_classes;

import java.io.*;
import java.util.*;

/**
 * TextFile
 */
public class TextFile extends ArrayList<String> {

  public TextFile(String fileName, String splitter) {
    super(Arrays.asList(read(fileName).split(splitter)));
    if (get(0).equals(""))
      remove(0);
  }

  public TextFile(String fileName) {
    this(fileName, "\n");
  }

  public static String read(String fileName) {
    StringBuilder stringBuilder = new StringBuilder();

    try {
      BufferedReader bufferedReader = new BufferedReader(
        new FileReader(new File(fileName).getAbsolutePath()));
      try {
        String s;
        while ((s = bufferedReader.readLine()) != null) {
          stringBuilder.append(s);
          stringBuilder.append("\n");
        }
      } finally {
        bufferedReader.close();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return stringBuilder.toString();
  }

  public static void write(String fileName, String text) {
    try {
      PrintWriter printWriter = new PrintWriter(
        new File(fileName).getAbsolutePath());
      try {
        printWriter.print(text);
      } finally {
        printWriter.close();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void write(String fileName) {
    try {
      PrintWriter printWriter = new PrintWriter(
        new File(fileName).getAbsolutePath());
      try {
        for (String item : this)
          printWriter.println(item);
      } finally {
        printWriter.close();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    String file = read("test.txt");
    write("test.txt", file);
    System.out.println(file);

    TextFile textFile = new TextFile("test.txt");
    textFile.write("test.txt");
    System.out.println(textFile);

    TreeSet<String> treeSet = new TreeSet<>(
      new TextFile("test.txt", "\\W+")
    );
    System.out.println(treeSet.headSet("a"));
  }
}
