package type_information.registered_factories;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Part{
    public String toString (){
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> factory_part = new ArrayList<Factory<? extends Part>>();

    static {
        //Collections.addAll() "unchecked generic array creation for bararge parameter"
        factory_part.add(new FuelFilter.Factory());
        factory_part.add(new AirFilter.Factory());
        factory_part.add(new CabinAirFilter.Factory());
        factory_part.add(new OilFilter.Factory());
        factory_part.add(new FanBelt.Factory());
        factory_part.add(new PowerSteeringBelt.Factory());
        factory_part.add(new GeneratorBelt.Factory());
    }
    
    private static Random rand = new Random(47);
    public static Part createRandom(){
        int n = rand.nextInt(factory_part.size());
        return factory_part.get(n).factory();
    }
    
}

class Filter extends Part{};

class FuelFilter extends Filter{
    public static class Factory implements type_information.registered_factories.Factory<FuelFilter> {
        public FuelFilter factory(){
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter{
    public static class Factory implements type_information.registered_factories.Factory<AirFilter> {
        public AirFilter factory(){
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter{
    public static class Factory implements type_information.registered_factories.Factory<CabinAirFilter>{
        public CabinAirFilter factory(){
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter{
    public static class Factory implements type_information.registered_factories.Factory<OilFilter> {
        public OilFilter factory(){
            return new OilFilter();
        }
    }
}

class Belt extends Part{};

class FanBelt extends Belt{
    public static class Factory implements type_information.registered_factories.Factory<FanBelt>{
        public FanBelt factory(){
            return new FanBelt();
        }
    }
}

class PowerSteeringBelt extends Belt{
    public static class Factory implements type_information.registered_factories.Factory<PowerSteeringBelt>{
        public PowerSteeringBelt factory(){
            return new PowerSteeringBelt();
        }
    }
}

class GeneratorBelt extends Belt{
    public static class Factory implements type_information.registered_factories.Factory<GeneratorBelt>{
        public GeneratorBelt factory(){
            return new GeneratorBelt();
        }
    }
}

public class RegisteredFactories {
    public static void main(String args[]){
        for(int i = 0; i < 10; i++){
            System.out.println(Part.createRandom());
        }
        System.out.println();
    }
}
