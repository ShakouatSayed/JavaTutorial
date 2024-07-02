/*
 * Thinking In Java.
 * Exercise Sulution 12:
 * 
 * Exercise 12: Modify innerclasses/Sequence.java so that it throws an
 * appropriate
 * exception if you try to put in too many elements.
 */

package exception_handling.standard_java_exception_runtime_exception;

interface Selector {
    boolean end();

    Object start();

    void mid();
}

public class Exercise12 {
    private Object[] items;
    private int size = 0;

    public Exercise12(int size) {
        items = new Object[size];
    }

    public void method1(Object x) throws ArrayIndexOutOfBoundsException {
        if (size == items.length)
            throw new ArrayIndexOutOfBoundsException();
        if (size < items.length)
            items[size++] = x;
    }

    private class method2 implements Selector {
        private int y = 0;

        public boolean end() {
            return y == items.length;
        }

        public Object start() {
            return items[y];
        }

        public void mid() {
            if (y < items.length)
                y++;
        }
    }

    public Selector selector() {
        return new method2();
    }

    public static void main(String args[]) {
        Exercise12 OB1 = new Exercise12(10);
        for (int i = 0; i < 10; i++)
            OB1.method1(Integer.toString(i));

        System.out.printf("");
        Selector selector = OB1.selector();

        while (!selector.end()) {
            System.out.println(selector.start() + " ");
            selector.mid();
        }

        OB1.method1(Integer.toString(10));
    }

}
