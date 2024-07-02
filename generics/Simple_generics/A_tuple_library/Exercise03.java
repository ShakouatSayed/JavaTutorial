
/* Exercise 3 : (1) Create and test a SixTuple generic. */

package generics.Simple_generics.A_tuple_library;

class AmpbihienA{}
class VehicleA{}

public class Exercise03 {
    static TwoTuple<String, Integer> f(){
        return new TwoTuple<String, Integer>("Hi ", 48);
    }

    static ThreeTuple<AmpbihienA,String, Integer> g(){
        return new ThreeTuple<AmpbihienA, String, Integer>(new AmpbihienA(),"Hi ", 49);
    }

    static FourTuple<VehicleA, AmpbihienA,String, Integer> h(){
        return new FourTuple<VehicleA, AmpbihienA, String, Integer>(new VehicleA(),new AmpbihienA(),"Hi ", 50);
    }

    static FiveTuple<VehicleA, AmpbihienA,String, Integer, Double> i(){
        return new FiveTuple<VehicleA, AmpbihienA, String, Integer, Double>(new VehicleA(),new AmpbihienA(),"Hi ", 50, 3.1416);
    }

    static SixTuple<VehicleA, AmpbihienA,String, Integer, Double, Character> j(){
        return new SixTuple<VehicleA, AmpbihienA, String, Integer, Double, Character>(new VehicleA(), new AmpbihienA(), "Hello world", 104, 3.02, 'n');
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> tTA = f();
        System.out.println(tTA);
        System.out.println(g());
        System.out.println(h());
        System.out.println(i());
        System.out.println(j());
    }
}
