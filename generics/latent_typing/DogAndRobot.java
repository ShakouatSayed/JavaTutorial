package generics.latent_typing;

import type_information.pets.Checking_before_cast.pets_animals.Dog;

interface Performers {
    void speak();

    void sit();
}

class PerfromingDog extends Dog implements Performers {
    public void speak() {
        System.out.println("Dog Speak...");
    }

    public void sit() {
        System.out.println("Dog sit...");
    }

    public void reProcedure() {
        System.out.println("Dog re procedure.");
    }
}

class Robot implements Performers {
    public void speak() {
        System.out.println("Robot speak...");
    }

    public void sit() {
        System.out.println("Robot sit...");
    }

    public void oilChange() {
        System.out.println("Robot change the oil.");
    }
}

/* 
 * class Continusly{
 * static <T extends Performers> void performer(T anything){
 * anything.speak();
 * anything.sit();
 * }
 * }
 */

public class DogAndRobot {

    static <T extends Performers> void performer(T anything) {
        anything.speak();
        anything.sit();
        // PerfromingDog perfromingDog = new PerfromingDog();
        // perfromingDog.reProcedure();
        // Robot robot = new Robot();
        // robot.oilChange();
    }

    public static void main(String[] args) {
        PerfromingDog perfromingDog = new PerfromingDog();
        // Continusly.performer(perfromingDog);
        
        performer(perfromingDog);
        Robot robot = new Robot();
        // Continusly.performer(robot);
        performer(robot);
    }
    
}


/* class Continusly {
    static void performer(Performers performers){
        performers.speak();
        performers.sit();
    }
}

/**
 * DogAndRobot
 */
/* public class DogAndRobot {

    public static void main(String[] args) {
        PerfromingDog perfromingDog = new PerfromingDog();
        Continusly.performer(perfromingDog);
        Robot robot = new Robot();
        Continusly.performer(robot);
    }
}
 */ 
