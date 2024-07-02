/*How to create multithreding using in java program*/

package problem_solving_question;

// public class CreateMultithreading extends Thread{
//     public void run(){
//         try {
//             System.out.println("Thread "+Thread.currentThread().getId()+" is running");
//         } catch (Exception e) {
//             System.out.println("Exception is caught.");
//         }
//     }
//     public static void main(String[] args) {
//         int n = 8;
//         for (int i = 0; i < n; i++) {
//             CreateMultithreading thread = new CreateMultithreading();
//             thread.start();
//         }
//     }
// }

public class CreateMultithreading implements Runnable{
    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running.");
        } catch (Exception e) {
            System.out.println("Exception is caught.");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Thread thread = new Thread(new CreateMultithreading());
            thread.start();
        }
    }
}