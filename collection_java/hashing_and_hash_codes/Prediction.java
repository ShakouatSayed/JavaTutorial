package collection_java.hashing_and_hash_codes;

import java.util.Random;

public class Prediction {
    private Random rand = new Random();
    private boolean shadaw = rand.nextDouble() > 0.5;
    public String toString(){
        if(shadaw)
            return "Six or more winter";
        else    
            return "Early Spring";
    }
}
