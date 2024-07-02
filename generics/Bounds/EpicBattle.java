package generics.Bounds;

import generics.Bounds.SuperPower.SuperHearing;
import generics.Bounds.SuperPower.SuperSmell;
import generics.Bounds.SuperPower.XRayVision;
import generics.Bounds.Wrold.PrecidentOfDubai;
import generics.Bounds.Wrold.PrecidentOfRussia;
import generics.Bounds.Wrold.PrecidentOfSudiaArab;

interface SuperPower{
    interface XRayVision extends SuperPower{public void seeThroughWalls();}
    interface SuperHearing extends SuperPower{public void hearSubtleNoises();}
    interface SuperSmell extends SuperPower{public void trackBySmell();}
}

interface Wrold{
    interface PrecidentOfRussia extends Wrold{public void russia();}
    interface PrecidentOfSudiaArab extends Wrold{public void sudiaArab();}
    interface PrecidentOfDubai extends Wrold{public void dubai();}
}

class Precident<PRECIDENT extends Wrold>{
    PRECIDENT precident;
    public Precident(PRECIDENT precident){this.precident = precident;}
    public PRECIDENT controlCountry(){return precident;}
}

class VladimirPotin<PRECIDENT extends PrecidentOfRussia> extends Precident<PRECIDENT>{
    PRECIDENT precident;
    public VladimirPotin(PRECIDENT precident){super(precident);}
    public void see(){precident.russia();}
}

class MohammadBinSalman<PRECIDENT extends PrecidentOfSudiaArab & PrecidentOfDubai> extends Precident<PRECIDENT>{
    PRECIDENT precident;
    public MohammadBinSalman(PRECIDENT precident){super(precident);}
    public void controlManPower(){precident.sudiaArab();}
    public void controlEconomices(){precident.dubai();}
}

class MohammadBinRasidAlMaktum implements PrecidentOfDubai, PrecidentOfSudiaArab{
    public void sudiaArab(){}
    public void dubai(){}
} 


class DubaiFrindsSudiaArab extends MohammadBinSalman<MohammadBinRasidAlMaktum>{
    public DubaiFrindsSudiaArab(){super(new MohammadBinRasidAlMaktum());}
}

class SuperHero <POWER extends SuperPower> {
    POWER power;
    public SuperHero(POWER power){this.power = power;}
    public POWER getPower(){return power;}
}

class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER>{
    POWER power;
    public SuperSleuth(POWER power){super(power);}
    public void see(){power.seeThroughWalls();}
}

class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER>{
    POWER power;
    public CanineHero(POWER power){super(power);}
    
    public void hear(){power.hearSubtleNoises();}
    public void smell(){power.trackBySmell();}
}

class SuperHearSmell implements SuperHearing , SuperSmell{
    //public void seeThroughWalls(){System.out.println("This statement is Through Walls");}
    public void hearSubtleNoises(){System.out.println("This statement is hear subtle notes");}
    public void trackBySmell(){System.out.println("this statement is track by smell");}
}

class DogBoy extends CanineHero<SuperHearSmell>{
    public DogBoy(){super(new SuperHearSmell());}
}


/**
 * EpicBattle
 */
public class EpicBattle {

    //bounds in generics methods
    static <PRECIDENT extends PrecidentOfSudiaArab> void precidentSudiaArab(Precident<PRECIDENT> precident){
        precident.controlCountry().sudiaArab();
    }

    static <PRECIDENT extends PrecidentOfDubai & PrecidentOfSudiaArab> void precidentFrind(Precident<PRECIDENT> precident){
        precident.controlCountry().dubai();
        precident.controlCountry().sudiaArab();
    }

    public static void main(String[] args) {
        DubaiFrindsSudiaArab dFSA =new DubaiFrindsSudiaArab();
        precidentFrind(dFSA);
        precidentFrind(dFSA);
    }
    
}
// public class EpicBattle {
    
//     //bounds in generics methods 
//     static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero){
//         hero.getPower().hearSubtleNoises();
//     }

//     static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero){
//         hero.getPower().hearSubtleNoises();
//         hero.getPower().trackBySmell();
//     }

//     public static void main(String[] args) {
//         DogBoy dogBoy = new DogBoy();
//         useSuperHearing(dogBoy);
//         superFind(dogBoy);
//     }
// }
