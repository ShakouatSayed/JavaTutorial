/* Exercise 32: (1) Verify that FixedSizeStack in GenericCast.java generates
exceptions if you try to go out of its bounds. Does this mean that bounds-checking code is not
required?  */

package generics.issues.casting_and_warnings;

/**
 * Exercise32
 */

class FixedSizeStackOne<T> {
    private int index = 0;
    private Object[] storage;

    public FixedSizeStackOne(int SIZE) {
        storage = new Object[SIZE];
    }

    public void push(T iteam) {
        storage[index++] = iteam;
    }

    int getIndex() {
        return index;
    }

    public T pop() {
        return (T) storage[--index];
    }
}

public class Exercise32 {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        FixedSizeStackOne<String> strings = new FixedSizeStackOne<String>(SIZE);

        try {
            for (String s : "A B C D E F G H I J".split(" "))
                strings.push(s);

            if (strings.getIndex() < SIZE || strings.getIndex() > SIZE) {
                strings.push("oops");
            }

            for (int i = 0; i < SIZE; i++) {
                String s = strings.pop();
                System.out.print(s + " ");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            // if (strings.getIndex() < SIZE || strings.getIndex() > SIZE) {
            // strings.push("oops");
            // }
            System.out.println(e);
        }
    }
}