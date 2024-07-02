package PackageFive;
public class constractor{
    int id;
    String name;
    static String School = "CKB";
    static void Chang(){
        School = "SUB";
    }
    constractor(int i, String n){
        id = i;
        name = n;
    }
    void dispaly(){
        System.out.println("Student id: "+id+" Student name is: "+name+" School is: "+School);
    }
    public static void main(String args[]){
        constractor.Chang();
        constractor s1 = new constractor(123, "Shakout");
        s1.dispaly();
    }
}   