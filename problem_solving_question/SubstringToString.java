/* Find All substring of string in java Program */


/* 
 * 
 *     
 * 
 *      
 *    
 */
package problem_solving_question;

public class SubstringToString {
    public static void main(String[] args) {
        System.out.println("Find all Sub String of String.");
        String str1 = "My name is Shakouat Hossen Sayed. I loved Java Programming Language.";
        int length = str1.length();
        String sub;
        // String str2 = "I weak up early morning and Practice the java programming language.", flow2 = "";
        // for(int i = 0; i <= str1.length();i++){
        //     flow1 = flow1 + str1.charAt(i);
        // }

        // for(int i = 0; i <= str1.length();i++){
        //     flow2 = flow2 + str1.charAt(i);
        // }
        for(int i = 0; i < length;i++){
            for(int j = 1; j <= length - i; j++){
                sub = str1.substring(i, i+j);
                System.out.println(sub);
            }
        }
        
    }
}
