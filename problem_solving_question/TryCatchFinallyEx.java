package problem_solving_question;

class TryCatchFinallyEx {
    public static void main(String[] args) {
        System.out.println("\nThe try catch finally Example:\n");
        try {
            long data[] = new long[200000000];
            System.out.println("Print the data array: " + data);
        } catch (OutOfMemoryError e) {
            System.out.println("Catch the Exception: " + e);
        } finally {
            System.out.println("This finally block will be execute.");
        }
    }
}