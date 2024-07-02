package PackageFive;
public class stringLength{
    static int i, c, res;
    static int length(String s){
        try{
            for(i = 0, c = 0; 0 <= i; i++, c++)
                s.charAt(i);
        }catch (Exception e){
            System.out.println("String length is: ");
        }
        return c;
    }
    public static void main(String args[]){
        res = stringLength.length("I Love Bangladesh.");
        System.out.println(res);
    }
}