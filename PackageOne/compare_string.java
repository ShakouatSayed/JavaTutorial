package PackageOne;
public class compare_string{
    public static void main(String args[]){
        //compare string 
        String s1 = "sayed";
        String s2 = new StringBuffer("say").append("ed").toString();
        String s3 = s2.intern();
        System.out.println("S1 == s2? "+(s1 == s2));
        System.out.println("S1 == s3? "+(s1 == s3));
    }
}