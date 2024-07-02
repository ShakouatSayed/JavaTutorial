//Garbage Collection clenner java

package problem_solving_question;

import java.lang.Thread.State;
import java.lang.ref.Cleaner;

public class GCCleanerExample {

    // This cleaner is sheared by all Cleaner Example
    private static final Cleaner clenner = Cleaner.create();
    private final State state;

    public GCCleanerExample(String id) {
        state = new State(id);
        clenner.register(this, state);
    }

    // cleaning action class for Cleaner Example
    private static class State implements Runnable {
        final private String id;

        private State(String id) {
            this.id = id;
            System.out.println("Created Cleaning action for: "+this.id);
        }

        @Override
        public void run() {
            System.out.println("Cleaner Garbage Collected : " + this.id);
        }
    }

    public static void main(String[] args) {

        GCCleanerExample gc_cleaner_example = new GCCleanerExample("gc_cleaner_example");
        // make myObject 1 unreachable
        gc_cleaner_example = null;

        System.out.println("--Give the Garbage collector a chanch to schedule the cleaner--");
        for (int i = 0; i < 100; i++) {

            // Cleaning System.gc in a look usually sufficient to trigger
            // cleanup in a small program like this

            System.gc();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Cautch the error. " + e);
            }
        }

        System.out.println("--Finished--");
        System.out.println("\nShakouat Hossen Sayed.\n");

    }
}
