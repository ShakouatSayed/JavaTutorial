package generics.mystery_of_erasure.action_at_the_boundaries;

public class SimpleHolder {
    private Object obj;
    public void set(Object obj){this.obj= obj;}

    public Object get(){return obj;}

    public static void main(String[] args) {
        SimpleHolder sHolder = new SimpleHolder();
        sHolder.set("Iteam");
        String s = (String)sHolder.get();

        System.out.println(s);
    }
}
