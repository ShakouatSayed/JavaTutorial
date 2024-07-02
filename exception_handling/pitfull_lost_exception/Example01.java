package exception_handling.pitfull_lost_exception;

class VeryImpException extends Exception {
    public String toString() {
        return "The Exception is very important Exception.";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "It is HoHum Exception.";
    }
}

class LostMessage {
    void f() throws VeryImpException {
        throw new VeryImpException();
    }

    void despose() throws HoHumException {
        throw new HoHumException();
    }
}

public class Example01 {
    public static void main(String args[]) throws VeryImpException {
        try {
            LostMessage lostMessage = new LostMessage();
            try {
                lostMessage.f();
            } finally {
                lostMessage.despose();
            }
        } catch (Exception e) {
            System.out.println("The Exception is Ho Hum Exception.");
        }
    }
}
