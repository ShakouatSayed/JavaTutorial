  /* Exercise 18: (3) Following the form of BankSeller.java, create an example where
BigFish eat LittleFish in the Ocean.  */

package generics.anonymous_inner_classes;

import java.util.*;

import generics.generic_interfaces.coffee.Generator;
import generics.generic_methods.generic_method_use_with_Generators.Generators;

class LittleFish{
  private static long count = 0;
  private final long id = count++;

  public String toString(){
    return "LittleFish " + id;
  }

  public static Generator<LittleFish> generator(){
    return new Generator<LittleFish>() {
      public LittleFish next(){return new LittleFish();};
    };
  }
}

class BigFish{
  private static long count = 0;
  private final long id = count++;

  public String toString(){
    return "BigFish " + id;
  }

  public static Generator<BigFish> generator(){
    return new Generator<BigFish>() {
      public BigFish next(){return new BigFish();}
    };
  } 
}

public class Exercise18 {
    public static void serve(LittleFish lF, BigFish bF){
      System.out.println(bF + " serves " + lF);
    }

    public static void main(String[] args) {
      Random rand = new Random(47);

      Queue<LittleFish> line = new LinkedList<LittleFish> ();
      Generators.fill(LittleFish.generator(), line, 15);
      List<BigFish> line2 = new ArrayList<BigFish>();
      Generators.fill(BigFish.generator(), line2, 5);

      for(LittleFish c : line)
        serve(c, line2.get(rand.nextInt(line2.size())));
    }
}
