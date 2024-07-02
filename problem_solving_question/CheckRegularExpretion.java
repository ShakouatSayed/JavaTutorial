/*How to check regular expretion in java program. */

package problem_solving_question;

import java.util.regex.Pattern;

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class CheckRegularExpretion {
//     public static void main(String[] args) {
//         // the regular expresion
//         //Matcher class
//         //Pattern class
//         //MatchResult interface class
//         //PatternSyntaxException class
//         Pattern pattern = Pattern.compile(".s");
//         Matcher matcher = pattern.matcher("as");

//         //1st way of regular expresion check
//         boolean b1 = matcher.matches();
//         System.out.println("First way of regular expresion check: "+b1);

//         //2nd way of regular expresion check
//         boolean b2 = Pattern.compile(".s").matcher("as").matches();
//         System.out.println("Second way of regular expresion check: "+b2);

//         //3rd way of regular exresion check
//         boolean b3 = Pattern.matches(".s", "as");
//         System.out.println("Third way of regular exresion check: "+b3); 
//     }   
// }

public class CheckRegularExpretion {

    public static void main(String[] args) {
        System.out.println(Pattern.matches("..s", "aas"));
        System.out.println(Pattern.matches("[amn]", "a"));
        System.out.println(Pattern.matches("[abcdef]", "a"));

        System.out.print("Regular expresion check is [ammma]? == a : ");
        System.out.println(Pattern.matches("[ammma]?", "a"));

        System.out.print("Regular expresion check is [ammma]? == ammma : ");
        System.out.println(Pattern.matches("[ammma]?", "ammma"));

        System.out.print("Regular Expresion check is [amma]+ == amma : ");
        System.out.println(Pattern.matches("[amma]+", "amma"));

        System.out.print("Regular Expresion check is [amma]+ == amma : ");
        System.out.println(Pattern.matches("[amma]+", "amma"));

        System.out.print("Regular Expresion check is [amma]+ == b : ");
        System.out.println(Pattern.matches("[amma]+", "b"));

        System.out.print("Regular Expresion check is [ammna]+ == amnmmmma ");
        System.out.println(Pattern.matches("[ammna]+", "amnmmmma"));

        System.out.print("Regular Expresion check is [ammna]* == amndmma ");
        System.out.println(Pattern.matches("[ammna]*", "amndmma"));

        System.out.print("Regular Expresion check is alphanumeric [a-zA-Z0-9]{6} == amn2mma ");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "amnmma"));

        System.out.print("Regular Expresion check is alphanumeric [a-zA-Z0-9]{6} == amn2mma2 ");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "amn2mm"));

        System.out.print("Regular Expresion check is alphanumeric [a-zA-Z0-9]{7} == amn2$mma ");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "amn2$mma"));//$sign is not metching.

        System.out.print("Regular Expresion check is alphanumeric [789][0-9]{9} == 7223459999 ");
        System.out.println(Pattern.matches("[789][0-9]{9}", "7223459999"));

        System.out.print("Regular Expresion check is alphanumeric \\d == 7 "); // //d is digit
        System.out.println(Pattern.matches("\\d", "7"));

        System.out.print("Regular Expresion check is alphanumeric \\D == A ");// //D is non digit
        System.out.println(Pattern.matches("\\D", "A"));

        System.out.print("Regular Expresion check is alphanumeric  [789][0-9]{9} == 777223459999 ");
        System.out.println(Pattern.matches("[789]{3}[0-9]{9}", "777223459999"));

    }
}