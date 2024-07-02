/* Exercise 26: (3) Implement clearSpitValve( ) as described in the summary.  */

package type_information.Interfaces_and_type_information;

import java.util.Random;
import java.util.jar.Attributes.Name;

class RandomInstrumentGenerator {
    private Random rand = new Random();

    public Instrument next() {
        switch (rand.nextInt(7)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new KeyBord();
            case 4:
                return new Barss();
            case 5:
                return new WoodWind();
            case 6:
                return new Piano();
        }
    }
}

class Instrument {
    void play(Name n) {System.out.println("Instrument.play() " + n);}
    public String toString() {return "Instrument";}
    void adjust() {System.out.println("Adjusting your Instrument.");}
}

class Wind extends Instrument {
    void play(Name n) {System.out.println("Wind.play() " + n);}
    public String toString() {return "Wind";}
    void adjust() {System.out.println("Adjusting your Wind.");}
    void clearSpitValve() {System.out.println("Wind clearing Spit valve."+"\n");}
}

class Percussion extends Instrument {
    void play(Name n) {System.out.println("Percussion.play() " + n);}
    public String toString() {return "Percussion";}
    void adjust() {System.out.println("Adjusting your Percussion.");}
}

class Stringed extends Instrument {
    void play(Name n) {System.out.println("Stringed.play() " + n);}
    public String toString() {return "Stringed";}
    void adjust() {System.out.println("Adjusting your Stringed.");}
}

class KeyBord extends Instrument {
    void play(Name n) {System.out.println("KeyBord.play() " + n);}
    public String toString() {return "KeyBord";}
    void adjust() {System.out.println("Adjusting your KeyBord.");}
}

class Barss extends Wind {
    void play(Name n) {System.out.println("Barss.play() " + n);}
    public String toString() {return "Barss";}
    void adjust() {System.out.println("Adjusting your Barss.");}
}

class WoodWind extends Wind {
    void play(Name n) {System.out.println("WoodWind.play() " + n);}
    public String toString() {return "WoodWind";}
    void adjust() {System.out.println("Adjusting your WoodWind.");}
}

class Piano extends Wind {
    void play(Name n) {System.out.println("Piano.play() " + n);}
    public String toString() {return "Piano";}
}

public class Exercise26 {

    //doesn't care about typek, so new types
    //added to the system still work right

    public static void tune(Instrument i) {
        i.play(Name.CONTENT_TYPE);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            System.out.println();
            tune(i);
        }
    }

    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

    public static void main(String[] args) {
        // up casting during addition to the array.
        Instrument[] ins = new Instrument[7];

        // fill up orchcestera array with instrument
        for (int i = 0; i < ins.length; i++) {
            ins[i] = gen.next(); 
        }

        for(Instrument i : ins){
            //Run time type information
            i.adjust();
            if(i instanceof Wind){
                ((Wind)i).clearSpitValve();
            }
        }
        tuneAll(ins);
    }
}
