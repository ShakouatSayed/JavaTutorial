package collection_java.hashing_and_hash_codes;

class GroundHog2 extends GroundHog{
    PredictionSpring pS = new PredictionSpring();
    public GroundHog2(int n){super(n);}
    public int hashCode(){return number;}
    public boolean equals(Object o){
        return o instanceof GroundHog2 && (number == ((GroundHog2)o).number);
    }
    
    @SuppressWarnings("static-access")
    public static void main(String[] args) throws Exception {
        GroundHog2 gHog2 = new GroundHog2(3);
        gHog2.pS.detectSpring(GroundHog2.class);
    }
}
