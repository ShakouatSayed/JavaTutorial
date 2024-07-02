/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
/**
 *
 * @author SHAKOUAT HOSSEN
 */
package encapsulation_example;
import java.io.*;

class A implements Serializable {

    int a;
    String s;

    public A(int a, String s) {
        this.a = a;

        this.s = s;
    }
}

public class Example02 {

    public static void main(String args[])
            throws IOException, ClassNotFoundException {
        A a = new A(20, "Shakouat Hossen Sayed");

        FileOutputStream fos = new FileOutputStream("xyz.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(a);
        }
        FileInputStream fis = new FileInputStream("xyz.tex");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            // down casting object
            A b = (A) ois.readObject();
            System.out.println(b.a + " " + b.s);
        }
        fos.close();
        fis.close();
    }
}
