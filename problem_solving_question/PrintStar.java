package problem_solving_question;

public class PrintStar {
    public static void main(String[] args) {
        int i, j ;
        System.out.println("Print the star.");
        for( i = 0; i <= 5; i++){
            for( j = 0; j <= 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
