package nested_interface;

public class Example04 {
    public interface NewInterface {
        void nestedInterface();
    }

    public static void main(String args[]) {
        NewInterface nested_interface = new NewInterface() {
            public void nestedInterface() {
                System.out.println("This is the another method of nested interface.");
            }
        };
        nested_interface.nestedInterface();

    }
}
