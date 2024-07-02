package generics.mystery_of_erasure.action_at_the_boundaries;

public class GenericHolder<T> {
    private T obj;
    public void set(T obj){this.obj = obj;}

    public T get(){return obj;}

    public static void main(String[] args) {
        GenericHolder<String> genericHolder = new GenericHolder<String>();

        genericHolder.set("HI");
        String s = genericHolder.get();
        System.out.println(s);
    }
}
