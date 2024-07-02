package generics.compensating_for_the_lack_latent_typing.reflection;

import java.lang.reflect.Method;

/**
 * LatenReflection
 */

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

class Mime{
    public void walkAgienstTheWind(){}
    public void sit(){System.out.println("Pretending the sit ;");}
    public void pushInvisibalWall(){}
    public String toString(){
        return "Mime";
    }
}

class SmartDog{
    public void speak(){System.out.println("Wroof ;");}
    public void sit(){System.out.println("sitting ;");}
    public void reProduce(){}
}

class CommunicateReflectively{
    public static void perfroms(Object speakers){
        Class<?> spkr = speakers.getClass();

        try{
            try{
                Method speak = spkr.getMethod("speak");
                speak.invoke(speakers);
            }catch(Exception e){
                System.out.println(speakers + " Cannot Speak ;");
            }

            try{
                Method sit = spkr.getMethod("sit");
                sit.invoke(speakers);
            }catch(Exception e){
                System.out.println(speakers + " Cannot Sit ;");
            }
        }catch (Exception e){
            throw new RuntimeException(speakers.toString(), e);
        }  
    }
}

public class LatenReflection {
    public static void main(String[] args) {
        CommunicateReflectively.perfroms(new Mime());
        CommunicateReflectively.perfroms(new SmartDog());
        CommunicateReflectively.perfroms(new Robot());
    }
}