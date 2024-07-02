package generics.issues.casting_and_warnings;


class FixedSizeStack<T> {
    private int index = 0;
    private Object[] storage;

    public FixedSizeStack(int SIZE) {
        storage = new Object[SIZE];
    }

    public void push(T iteam) {
        storage[index++] = iteam;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) storage[--index];
    }
}

public class GenericCast {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<String>(SIZE);

        for (String s : "A B C D G I K L M O".split(" "))
            strings.push(s);

        for (int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }

}
