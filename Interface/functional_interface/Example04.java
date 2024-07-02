/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class Example04 {

    public static void main(String args[]) {
        List<String> name = Arrays.asList("Shakouat", "Sayed", "Sakhawat", "Hossen", "SHossain");

        //predicate interface
        Predicate<String> p = (s) -> s.startsWith("S");
        //
        //Consumer <String> p = (s) ->s.startsWith("S");

        for (String st : name) {
            if (p.test(st)) {
                System.out.println(st);
            }
        }

    }
}
