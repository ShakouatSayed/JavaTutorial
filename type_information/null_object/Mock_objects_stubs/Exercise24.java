/*
 * Thiking in Java
 * Exercise Solution 24:
 * 
 * Exercise 24: (4) Add Null Objects to RegisteredFactories.java
 */

package type_information.null_object.Mock_objects_stubs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


interface Factory1<F> {F factory1();}

interface Null0 {};

class Part1 {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory1<? extends Part1>> factoryPart = new ArrayList<Factory1<? extends Part1>>();
    static {
        // collection.addAll() "unchecked generic array creation for bararge parameter."
        factoryPart.add(new FuelFilter1.Factory1());
        factoryPart.add(new AirFilter1.Factory1());
        factoryPart.add(new CabinAirFilter1.Factory1());
        factoryPart.add(new OilFilter1.Factory1());
        factoryPart.add(new FanBelt1.Factory1());
        factoryPart.add(new PowerSteeringBelt1.Factory1());
        factoryPart.add(new GeneratorBelt1.Factory1());
        factoryPart.add(new NullPart.Factory1());
    }

    private static Random rand = new Random(47);

    public static Part1 createRandomPart1() {
        int n = rand.nextInt(factoryPart.size());
        return factoryPart.get(n).factory1();
    }
}

class NullPart extends Part1 implements Null0{
    private NullPart(){super();}
    public static final Part1 NULL = new NullPart();
    public static class Factory1 implements type_information.null_object.Mock_objects_stubs.Factory1<NullPart>{
        public NullPart factory1(){
            return (NullPart)NULL;
        }
        public String toString(){
            return "NULL";
        }
    }
}

class Filter1 extends Part1{};

class FuelFilter1 extends Filter1{
    public static class Factory1 implements type_information.null_object.Mock_objects_stubs.Factory1<FuelFilter1>{
        public FuelFilter1 factory1(){
            return new FuelFilter1();
        }
    }
}

class AirFilter1 extends Filter1{
    public static class Factory1 implements type_information.null_object.Mock_objects_stubs.Factory1<AirFilter1>{
        public AirFilter1 factory1(){
            return new AirFilter1();
        }
    }
}

class CabinAirFilter1 extends Filter1{
    public static class Factory1 implements type_information.null_object.Mock_objects_stubs.Factory1<CabinAirFilter1>{
        public CabinAirFilter1 factory1(){
            return new CabinAirFilter1();
        }
    } 
}

class OilFilter1 extends Filter1{
    public static class Factory1 implements type_information.null_object.Mock_objects_stubs.Factory1<OilFilter1>{
        public OilFilter1 factory1(){
            return new OilFilter1();
        }
    }
}

class Belt1 extends Part1{}

class FanBelt1 extends Belt1{
    public static class Factory1 implements type_information.null_object.Mock_objects_stubs.Factory1<FanBelt1>{
        public FanBelt1 factory1(){
            return new FanBelt1();
        }
    }
}

class PowerSteeringBelt1 extends Belt1{
    public static class Factory1 implements type_information.null_object.Mock_objects_stubs.Factory1<PowerSteeringBelt1>{
        public PowerSteeringBelt1 factory1(){
            return new PowerSteeringBelt1();
        }
    }
}

class GeneratorBelt1 extends Belt1{
    public static class Factory1 implements type_information.null_object.Mock_objects_stubs.Factory1<GeneratorBelt1>{
        public GeneratorBelt1 factory1(){
            return new GeneratorBelt1();
        }
    }
}

public class Exercise24 {
    public static void main(String args[]) {
        for(int i = 0; i <= 10; i++){
            System.out.println(Part1.createRandomPart1());
        }
        System.out.println();
    }
}