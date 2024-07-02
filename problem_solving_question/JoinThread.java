/*How to join tread in java program.*/

package problem_solving_question;

// class InnerJoinTread extends Thread {
//     public void run() {
//         for (int i = 0; i < 2; i++) {
//             try {

//                 // sleeping thread in 300 milisecond
//                 Thread.sleep(300);
//                 System.out.println("Creating a new Thread " + Thread.currentThread().getName());
//             } catch (Exception e) {
//                 // TODO: handle exception
//                 // catch block for catching the raisd exception
//                 System.out.println("The exception has been caught" + e);
//             }
//         }
//     }

// }

// public class JoinTread {
//     public static void main(String[] args) {
//         InnerJoinTread thread1 = new InnerJoinTread();
//         InnerJoinTread thread2 = new InnerJoinTread();
//         InnerJoinTread thread3 = new InnerJoinTread();

//         thread1.start();
//         try {
//             System.out.println("Creating a Thread1 " + Thread.currentThread().getName());
//             thread1.join();
//         } catch (Exception e) {
//             System.out.println("The Thread1 exception has been caught." + e);
//         }

//         thread2.start();
//         try { 
//             System.out.println("Creating a Thread2 " + Thread.currentThread().getName());
//             thread2.join();
//         } catch (Exception e) {
//             System.out.println("The Thread1 exception has been caught." + e);
//         }

//         thread3.start();
//         try {
//             System.out.println("Creating a Thread3 " + Thread.currentThread().getName());
//             thread3.join();
//         } catch (Exception e) {
//             System.out.println("The Thread1 exception has been caught." + e);
//         }
//     }
// }

/**
 * InnerJoinTread
 */

public class JoinThread extends Thread {
      public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                //sleeping thread time is 400 milisecond
                Thread.sleep(400);
                //System.out.println("Create a thread "+Thread.currentThread().getName());
            } catch (Exception e) {
                //exception the not create thread
                System.out.println("The thread exception is caught."+e);
            }
            System.out.println(i+" : "+"I love Java Programming Language and Software Engineer.");
        }
    }
    public static void main(String[] args) {
        JoinThread inner_joind_thread1 = new JoinThread();
        //JoinThread inner_joind_thread2 = new JoinThread();
        //JoinThread inner_joind_thread3 = new JoinThread();

        inner_joind_thread1.start();
        try {
            //System.out.println("Create thread 01 "+Thread.currentThread().getName());
            inner_joind_thread1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        //inner_joind_thread2.start();
        //inner_joind_thread3.start();
    }
}