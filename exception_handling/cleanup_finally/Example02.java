package exception_handling.cleanup_finally;

class Switch {
    boolean state = true;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    public String toString() {
        return state ? "on()" : "off()";
    }
}

class OnException extends Exception {

}

class OffException extends Exception {

}

public class Example02 {
    public static void f() throws OnException, OffException {
    }

    private static Switch swc = new Switch();

    public static void main(String args[]) {
        // try {
        // swc.on();
        // f();
        // swc.off();
        // } catch (OnException e) {
        // System.out.println("On Exception.");
        // swc.off();
        // } catch (OffException e) {
        // System.out.println("Off Exception.");
        // swc.off();
        // }

        try {
            swc.on();
            Example02.f();
        } catch (OnException e) {
            System.out.println("On Exception.");
        } catch (OffException e) {
            System.out.println("Off Exception.");
        } finally {
            swc.off();
        }
    }
}
