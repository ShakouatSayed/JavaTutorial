/* How to throw exception in java Program */
package problem_solving_question;

public class ThrowException {
    static void validate(int age){
        if(age < 18)
            throw new ArithmeticException("not valid");
        else    
            System.out.println("Welcome to vote on Election.");
    }
    public static void main(String[] args) {
       validate(23);
        System.out.println("Example of Throw Exception");
    }
}
