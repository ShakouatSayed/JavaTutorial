/*
 * Thinking in Java.
 * Exercise Solution 14.
 * 
 * Exercise 14: (4) A constructor is a kind of factory method. Modify
 * RegisteredFactories.java so that instead of using an explicit factory, the
 * class object is
 * stored in the List, and newlnstance( ) is used to create each object.
 */

package type_information.registered_factories;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface Factory1<F> {F toFactory();}

class Part1{
   public String toString(){
      return getClass().getSimpleName();
   }

   static List<Class<? extends Part1>> list_factory = new ArrayList<Class<? extends Part1>>();

   static {
      list_factory.add(FuelFilter1.class);
      list_factory.add(OilFilter1.class);
      list_factory.add( AirFilter1.class);
      list_factory.add( CabinAirFilter1.class);
      list_factory.add(PowerSteeringBelt1.class);
      list_factory.add(FanBelt1.class);
      list_factory.add(GeneratorBelt1.class);
   }

   private static Random rand = new Random(47);
   public static Part1 createRandom(){
      int n = rand.nextInt(list_factory.size());
      try{
         return list_factory.get(n).newInstance();
      }catch(InstantiationException e){
         throw new RuntimeException();
      }catch(IllegalAccessException e){
         throw new RuntimeException(e);
      }
   }
}

class Filter1 extends Part1{}

class FuelFilter1 extends Filter1{
   public static class Factory1 implements type_information.registered_factories.Factory1<FuelFilter1>{
      public FuelFilter1 toFactory(){
         return new FuelFilter1();
      }
   }
}


class OilFilter1 extends Filter1{
   public static class Factory1 implements type_information.registered_factories.Factory1<OilFilter1>{
      public OilFilter1 toFactory(){
         return new OilFilter1();
      }
   }
}

class AirFilter1 extends Filter1{
   public static class Factory1 implements type_information.registered_factories.Factory1<AirFilter1>{
      public AirFilter1 toFactory(){
         return new AirFilter1();
      }
   }
}

class CabinAirFilter1 extends Filter1{
   public static class Factory1 implements type_information.registered_factories.Factory1<CabinAirFilter1>{
      public CabinAirFilter1 toFactory(){
         return new CabinAirFilter1();
      }
   }
}

class Belt1 extends Part1{};

class FanBelt1 extends Filter1{
   public static class Factory1 implements type_information.registered_factories.Factory1<FanBelt1>{
      public FanBelt1 toFactory(){
         return new FanBelt1();
      }
   }
}

class PowerSteeringBelt1 extends Filter1{
   public static class Factory1 implements type_information.registered_factories.Factory1<PowerSteeringBelt1>{
      public PowerSteeringBelt1 toFactory(){
         return new PowerSteeringBelt1();
      }
   }
}

class GeneratorBelt1 extends Filter1{
   public static class Factory1 implements type_information.registered_factories.Factory1<GeneratorBelt1>{
      public GeneratorBelt1 toFactory(){
         return new GeneratorBelt1();
      }
   }
}


public class Exercise14{
   public static void main(String args[]){
      for(int i = 0; i < 10; i++){
         System.out.println(Part1.createRandom()+"\n");
      }
   }
} 