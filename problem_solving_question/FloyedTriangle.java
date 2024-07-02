/* Print Floyd’s Triangle in java Program
 */
package problem_solving_question;

public class FloyedTriangle {
    public static void main(String[] args) {
        System.out.println("Floyed's Triangle : ");
        int num = 1;
        for(int i = 0; i < 10;i++){
            for(int j = 0; j <= i; j++){
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
