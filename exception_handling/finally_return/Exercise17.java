
/*
 * Thinking in Java.
 * Exercise Solution 17:
 * 
 * Exercise 17: Modify polymorphism/Frog.java so that it uses try-finally to
 * guarantee proper cleanup, and show that this works even if you return from
 * the middle of
 * the try-finally.
 */

package exception_handling.finally_return;

class Characterstic {
    Characterstic(String s) {
        System.out.println(s);
    }

    protected void dispose() {
        System.out.println("Characterstic Class used in dispose()\n");
    }
}

class Discription {
    Discription(String s) {
        System.out.println(s);
    }

    protected void dispose() {
        System.out.println("Discription Class used in dispose()\n");
    }
}

class LivingCreature {
    LivingCreature() {
        System.out.println("print the Living Creature constractor is called.\n");
    }

    protected void dispose() {
        System.out.println("LivingCreature Class used in dispose()\n");
    }
}

class Animal extends LivingCreature {
    private Characterstic c = new Characterstic("Animal Charcterstic.\n");
    private Discription d = new Discription("Animal Description.\n");

    Animal() {
        System.out.println("animal()\n");
    }

    protected void despose() {
        System.out.println("Animal Class used in dispose()\n");
        c.dispose();
        d.dispose();
        super.dispose();
    }

}

class Ampahibin extends Animal {
    private Characterstic c = new Characterstic("Ampahibin Charcterstic.\n");
    private Discription d = new Discription("Ampahibin Description.\n");

    Ampahibin() {
        System.out.println("ampahibin()\n");
    }

    protected void despose() {
        System.out.println("Ampahibin Class used in dispose()\n");
        c.dispose();
        d.dispose();
        super.dispose();
    }

}

public class Exercise17 extends Ampahibin {
    private static Characterstic c = new Characterstic("Frog17 Charcterstic.\n");
    private static Discription d = new Discription("Frog17 Description.\n");

    public static void jump() {
        System.out.println("The frog was jump, when the rainning time.\n");
    }

    Exercise17() {
        System.out.println("The animal frog is calling.\n");
    }

    protected void despose() {
        System.out.println("Frog17 class used in despose method.\n");
        c.dispose();
        d.dispose();
        super.despose();
    }

    public static void main(String args[]) {
        Exercise17 frog = new Exercise17();
        try {
            jump();
            System.out.println("Return from is try-finally block.\n");
            return;
        } finally {
            frog.despose();
            System.out.println("This is the finally Block.\n");
        }
    }
}
